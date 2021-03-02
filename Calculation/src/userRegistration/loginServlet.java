package userRegistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import userRegistration.MeiboBean;
import userRegistration.login;

/**
 * Servlet implementation class Sample
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stename = request.getParameter("uername");
		String stepass = request.getParameter("uerpass");
		
		
		try {		
				MeiboBean ab = new MeiboBean();
				ab.setname(stename);
				ab.setpass(stepass);
				
				login ad = new login();

				MeiboBean returnAb = ad.findAccount(ab);
				
				String hashed = returnAb.getpass();
				
				if(returnAb != null) {
					
					if(BCrypt.checkpw(stepass, hashed)) {
		            // セッションにアカウント情報＆ロールを登録
		            HttpSession session = request.getSession();
		            session.setAttribute("account", returnAb);

		            forward = "./user.jsp";
		            
					}else{
						
						forward = "./error.jsp";
					}
		        }
			}catch(Exception e){
				
				forward = "./error.jsp";
				
			}finally {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
	            dispatcher.forward(request, response);
			}
				
				
			}
		}
