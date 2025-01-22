package com.tap.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayData extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public DisplayData() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        	PrintWriter out = response.getWriter();
        	out.println("Hello! From the post method of user " + userName +" is Correct." + passWord);
    }

}
