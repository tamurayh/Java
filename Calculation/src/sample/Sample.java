package sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import sample.MeiboBean;
import sample.rogin;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Servlet implementation class Sample
 */
@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stename = request.getParameter("uername");
		String stepass = request.getParameter("uerpass");
				
				MeiboBean ab = new MeiboBean();
				ab.setname(stename);
				ab.setpass(stepass);
				
				rogin ad = new rogin();

				MeiboBean returnAb = ad.findAccount(ab);
				
				String hashed = returnAb.getpass();
				
				if(returnAb != null) {
					
					if(BCrypt.checkpw(stepass, hashed)) {
		            // セッションにアカウント情報＆ロールを登録
		            HttpSession session = request.getSession();
		            session.setAttribute("account", returnAb);

		            RequestDispatcher rd = request.getRequestDispatcher("./jsp/results.jsp");
		            rd.forward(request, response);
		            
					}else{
			            RequestDispatcher rd = request.getRequestDispatcher("./jsp/error.jsp");
			            rd.forward(request, response);}
		        }
			}
		}
