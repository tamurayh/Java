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
		int Additionresult = value1 + value2;
		System.out.println(Additionresult);
		
		RS.setvalue3(value1);
		RS.setvalue4(value2);
		RS.setAdditionresult(Additionresult);
		
        session.setAttribute("Randomadd", RS);
        forward = "/addition.jsp";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			Randamu_sakusei RS = new Randamu_sakusei();
			//�����̓������Ăяo��7
			int Additionresult = RS.getAdditionresult();
			//���[�U�̓������󂯎��
			System.out.println(Additionresult);
			String strAnswer = request.getParameter("answer");
			//���[�U�̓�����l�ɕϊ�
			int Answer = Integer.valueOf(strAnswer).intValue();;
			//���[�U�̓������i�[
			RS.setAnswer(Answer);
			// ����`�F�b�N
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
				
