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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		
		Randamu_sakusei RS = new Randamu_sakusei();
		
		try{
			
			String strAnswer = request.getParameter("answer");
			int Answer = Integer.parseInt(strAnswer);
			
			int Additionresult = RS.getAdditionresult();
		
			RS.setAnswer(Answer);
			
			if ( Answer == Additionresult) {
				
				RS.setAcceptance(1);
				
				forward = "/addition.jsp";
				
			} else {
				
				RS.setAcceptance(0);
				
				forward = "/addition_error.jsp";
				
			}
		}catch(Exception e){
            forward = "/addAnswer.jsp";
		}finally{
			
			Result_registration ard = new Result_registration(RS);
			
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

