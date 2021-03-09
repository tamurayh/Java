package Past_questions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import arithmetic.Result_registrationaddition;

import java.util.Random;

/**
 * Servlet implementation class Past_questions_Addition_Servlet
 */
@WebServlet("/Past_questions_Addition_Servlet")
public class Past_questions_Addition_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Past_questions_Addition_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Random rnd = new Random();
		
		String userid = request.getParameter("userid");
		String countadd = request.getParameter("countadd");
		String countaddall = request.getParameter("countaddall");
		
		int id= Integer.valueOf(userid).intValue();
		int countadd2= Integer.valueOf(countadd).intValue();
		int countaddall2= Integer.valueOf(countaddall).intValue();
		
		int countadd3 = countaddall2 - countadd2 -1;
		
		int count = rnd.nextInt(countadd3) +1; 
		
		Past_questions pq = new Past_questions();
		pq.setid(id);
		pq.setcount(count);
		
		Past_questions_Addition qp = new Past_questions_Addition();
		
		Past_questions Pqa = qp.findAccount(pq);
		
		session.setAttribute("Pqa", Pqa);
		
		forward = "/Past_questions_Addition.jsp";
		
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Past_questions Pqa = new Past_questions();
		
		//ユーザの答えを受け取る
		String strAnswer = request.getParameter("answer");
		
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		String additionid = request.getParameter("additionid");
		
		int Answer = Integer.valueOf(strAnswer).intValue();
		int addvalue1 = Integer.valueOf(value1).intValue();
		int addvalue2 = Integer.valueOf(value2).intValue();
		int additionid2 = Integer.valueOf(additionid).intValue();
		
		int Additionresult = addvalue1 + addvalue2;
		request.setAttribute("Additionresult",Additionresult);
		
		Pqa.setadditionid(additionid2);
		
		// 正誤チェック
		if ( Answer == Additionresult ) {
			
			Pqa.setAcceptance(1);
		    
			forward = "/Past_questions_Addition_result.jsp";
			
		} else {
			
			Pqa.setAcceptance(0);
			
			forward = "/Past_questions_Addition_resultmistake.jsp";
		}
		Past_questions_Addition_result RR = new Past_questions_Addition_result (Pqa);
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
	    dispatcher.forward(request, response);
}
}
