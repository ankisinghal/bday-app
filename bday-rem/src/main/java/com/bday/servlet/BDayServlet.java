package com.bday.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BDayServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/bday.jsp");
		rd.forward(request, response);
	}
}
