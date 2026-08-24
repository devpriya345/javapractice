package A2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/welcome") // url pattern //
public class WelcomeServlet extends HttpServlet{
	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException{
	PrintWriter pw = resp.getWriter();
	pw.append("<h1>Welcome to Servlet</h1>" );

}

}
