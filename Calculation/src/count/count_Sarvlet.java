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
		//���[�U�̓������󂯎��
		String userid = request.getParameter("userid");
		//addition.jsp����󂯎�����l��ϊ�
		int id= Integer.valueOf(userid).intValue();
		//�f�[�^�x�[�X�Ɋi�[����l��ۑ�
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


