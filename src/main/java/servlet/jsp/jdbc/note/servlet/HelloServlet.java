package servlet.jsp.jdbc.note.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jsp.jdbc.note.util.UrlConstants;
import servlet.jsp.jdbc.note.util.JspConstants;

@WebServlet(name = "helloServlet", urlPatterns = {UrlConstants.Hello})
public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConstants.Hello_Index)
			.forward(req, resp);
	}
}
