package com.demo;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
* Servlet implementation class DemoServlet
*/
@WebServlet({ "/DemoServlet", "/alias" })
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello World</h1>");
		String userName=request.getParameter("uname");
		String password=request.getParameter("pass");
		if(userName.equals("tester") && password.equals("tester")) {
			//out.println("Welcome " + userName);
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/HomeServlet");
			getServletContext().setAttribute("User", userName);
			System.out.println("Authenticated");
			dispatcher.forward(request, response);
			//response.sendRedirect("/MyDemoPrj/HomeServlet");
		}
		else {
			out.println("Invalid credentials");
			out.println("<a href='/MyDemoPrj/LoginForm.html'>Click to re-login</a>");
		}
		out.close();
	}
	public void init() {
		System.out.println("Servlet initialized....");
	}
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}