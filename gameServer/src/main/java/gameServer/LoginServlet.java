package gameServer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 로그인 검증 로직 (예: 데이터베이스에서 사용자 정보 조회)
       // boolean isValid = checkLogin(username, password); // 이 함수는 실제 로그인 검증 로직을 구현해야 합니다.

        //if (isValid) {
            // 로그인 성공 시 메인 페이지로 리다이렉트
            response.sendRedirect("main.jsp");
       // } else {
            // 로그인 실패 시 에러 메시지와 함께 로그인 페이지로 돌아갑니다.
        //    request.setAttribute("errorMessage", "Invalid username or password");
         //   request.getRequestDispatcher("/login.jsp").forward(request, response);
        //}
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
