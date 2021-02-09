package userRegistration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userRegistration.MeiboBean;
import userRegistration.newuser;
/**
 * Servlet implementation class Register
 */
@WebServlet("/Signup_Servlet")
public class Signup_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        // register.jspから受け取った値をビーンズにセット
        MeiboBean ab = new MeiboBean();
        ab.setname(name);
        ab.setpass(pass);
        
        // アカウントをDBに登録
        newuser ard = new newuser(ab);
        
        HttpSession session = request.getSession();
        session.setAttribute("account", ab);
		
        RequestDispatcher rd = request.getRequestDispatcher("./registerSuccess.jsp");
        rd.forward(request, response);
	}

}
