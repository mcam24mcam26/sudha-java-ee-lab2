package sudha2;

import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;

public class LastAccsServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out = res.getWriter();
		out.println("<h1> Sum is "+k+"</h1>");
		HttpSession hs = req.getSession(true);
		if(hs.isNew()) {
			out.println("<h2> A new Session is created</h2>");
		}
		//Date dt = (Date) hs.getAttribute("Date");
		Date dt = new Date(hs.getLastAccessedTime());
		if(dt!=null) {
			out.println("<h2>Last Access Date and Time is "+dt+"</h2>");
		}
		Date d = new Date(); //new Date(hs.getCreationTime());
		hs.getAttribute("Date");
		out.println("<h2> Current Session Date and Time is "+d+"</h2>");
	}
}
