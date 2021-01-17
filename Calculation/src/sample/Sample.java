package sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


/**
 * Servlet implementation class Sample
 */
@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
	String tmp = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stename = request.getParameter("uername");
		String stepass = request.getParameter("uerpass");
		
		try{
			if (stename != null) {
				
				MeiboBean med = new MeiboBean(stename,stepass);
				request.setAttribute("med", med);
				forward = "./results.jsp";

			}
				
		} catch(Exception e){
				
			}finally {
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
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
