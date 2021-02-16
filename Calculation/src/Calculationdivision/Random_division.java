package Calculationdivision;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import arithmetic.Result_registrationdivision;

/**
 * Servlet implementation class Random_division
 */
@WebServlet("/Random_division")
public class Random_division extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random_division() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);	
		Randamu_sakusei_division RS = new Randamu_sakusei_division();	
		
		int value1 = RS.getvalue1();
		int value2 = RS.getvalue2();
		switch (value1) {
		
		case 2,4,8,10,20:
			
			value2 = RS.setvalue2(2);
			RS.setvalue3(value1);
			RS.setvalue4(value2);
			break;
			
		case 3,6,9,30,33:
			value2 = RS.setvalue2(3);;
			RS.setvalue3(value1);
			RS.setvalue4(value2);
			break;
		}
        forward = "/division.jsp";
		session.setAttribute("Randomadd", RS);
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Randamu_sakusei_division RS = new Randamu_sakusei_division();
		//���[�U�̓������󂯎��
		String strAnswer = request.getParameter("answer");
		//addition.jsp������̒l���󂯎��
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		//addition.jsp���烆�[�U�[id���󂯎��
		String userid = request.getParameter("userid");
		//addition.jsp����󂯎�����l��ϊ�
		int Answer = Integer.valueOf(strAnswer).intValue();
		int addvalue1 = Integer.valueOf(value1).intValue();
		int addvalue2 = Integer.valueOf(value2).intValue();
		int id= Integer.valueOf(userid).intValue();
		//�����̓������Ăяo��
		int Additionresult = addvalue1 / addvalue2;
		request.setAttribute("Additionresult",Additionresult);
		//�f�[�^�x�[�X�Ɋi�[����l��ۑ�
		RS.setvalue3(addvalue1);
		RS.setvalue4(addvalue2);
		RS.setAnswer(Answer);
		RS.setid(id);
		// ����`�F�b�N
		if ( Answer == Additionresult ) {
			
			RS.setAcceptance(1);
		    
			forward = "/division_result.jsp";
			
		} else {
			
			RS.setAcceptance(0);
			
			forward = "/mistake_division.jsp";
		}
		Result_registrationdivision RR = new Result_registrationdivision(RS);
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
	    dispatcher.forward(request, response);
  }

}
