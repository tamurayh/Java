package Calculation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import arithmetic.Randamu_sakusei;
import arithmetic.Result_registration;
import userRegistration.MeiboBean;

/**
 * Servlet implementation class Random_addition
 */
@WebServlet("/Random_addition")
public class Random_addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random_addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);	
		Randamu_sakusei RS = new Randamu_sakusei();	
		
		int value1 = RS.getvalue1();
		int value2 = RS.getvalue2();
		
		RS.setvalue3(value1);
		RS.setvalue4(value2);
		
        session.setAttribute("Randomadd", RS);
        forward = "/addition.jsp";
        
        addition add = new addition();
        add.additionPrint(RS);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			Randamu_sakusei RS = new Randamu_sakusei();
			//正解の答えを呼び出す7
			//ユーザの答えを受け取る
			String strAnswer = request.getParameter("answer");
			String value1 = request.getParameter("value1");
			String value2 = request.getParameter("value2");
			//ユーザの答えを値に変換
			int Answer = Integer.valueOf(strAnswer).intValue();
			int addvalue1 = Integer.valueOf(value1).intValue();
			int addvalue2 = Integer.valueOf(value2).intValue();
			//ユーザの答えを格納
			int Additionresult = addvalue1 + addvalue2;
			RS.setAnswer(Answer);
			// 正誤チェック
			if ( Answer == Additionresult ) {
				
				RS.setAcceptance(1);
			    
				forward = "/addition_result.jsp";
				
			} else {
				
				RS.setAcceptance(0);
				
				forward = "/error.jsp";
			}    
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		    dispatcher.forward(request, response);
	}
}
				
