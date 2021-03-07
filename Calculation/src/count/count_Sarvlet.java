package count;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class count_Sarvlet
 */
@WebServlet("/count_Sarvlet")
public class count_Sarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String forward = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public count_Sarvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count_list cl = new count_list();
		//ユーザの答えを受け取る
		String userid = request.getParameter("userid");
		//addition.jspから受け取った値を変換
		int id= Integer.valueOf(userid).intValue();
		//データベースに格納する値を保存
		cl.steid(id);
		
		count lc = new count();
		
		count_list countall = lc.findAccount(cl);
		
		HttpSession session = request.getSession();
        session.setAttribute("count", countall);
		    
		forward = "/user.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
	    dispatcher.forward(request, response);
	}
}


