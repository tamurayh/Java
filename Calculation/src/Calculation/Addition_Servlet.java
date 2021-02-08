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
import Calculation.Random_addition;

/**
 * Servlet implementation class Addition_Servlet
 */
@WebServlet("/Addition_Servlet")
public class Addition_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			
			Randamu_sakusei RS = new Randamu_sakusei();	
			//�����̓������Ăяo��7
			int Additionresult = RS.getAdditionresult();
			//���[�U�̓������󂯎��
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
		}catch(Exception e){
            forward = "/addition_result.jsp";
		}finally{
			
            RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
            dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		doGet(request, response);
	}
}
