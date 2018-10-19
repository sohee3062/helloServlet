package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet") // annotation - /loginServlet에 매핑
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// db처리...
		
		// Build HTML code
		// 밑의 내용이 client한테 html형태로 전달됨
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<h2> your name is " + username + "</br>";
		htmlResponse += "your passowrd is " + password + "</br>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}

}
