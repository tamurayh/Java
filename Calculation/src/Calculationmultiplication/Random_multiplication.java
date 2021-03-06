package Calculationmultiplication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import arithmetic.Result_registrationmultiplication;

/**
 * Servlet implementation class Random_multiplication
 */
@WebServlet("/Random_multiplication")
public class Random_multiplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random_multiplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);	
		Randamu_sakusei_multiplication RS = new Randamu_sakusei_multiplication();	
		
		int value1 = RS.getvalue1();
		int value2 = RS.getvalue2();
		
		RS.setvalue3(value1);
		RS.setvalue4(value2);
        session.setAttribute("Randomadd", RS);
        forward = "/multiplication.jsp";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Randamu_sakusei_multiplication RS = new Randamu_sakusei_multiplication();
		//ユーザの答えを受け取る
		String strAnswer = request.getParameter("answer");
		//addition.jspから問題の値を受け取る
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		//addition.jspからユーザーidを受け取る
		String userid = request.getParameter("userid");
		//addition.jspから受け取った値を変換
		int Answer = Integer.valueOf(strAnswer).intValue();
		int addvalue1 = Integer.valueOf(value1).intValue();
		int addvalue2 = Integer.valueOf(value2).intValue();
		int id= Integer.valueOf(userid).intValue();
		//正解の答えを呼び出す
		int Additionresult = addvalue1 * addvalue2;
		request.setAttribute("Additionresult",Additionresult);
		//データベースに格納する値を保存
		RS.setvalue3(addvalue1);
		RS.setvalue4(addvalue2);
		RS.setAnswer(Answer);
		RS.setid(id);
		// 正誤チェック
		if ( Answer == Additionresult ) {
			
			RS.setAcceptance(1);
		    
			forward = "/multiplication_result.jsp";
			
		} else {
			
			RS.setAcceptance(0);
			
			forward = "/mistake_multiplication.jsp";
		}
		Result_registrationmultiplication RR = new Result_registrationmultiplication(RS);
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
	    dispatcher.forward(request, response);
  }

}
