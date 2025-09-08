package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse responce) throws ServletException,IOException 
	{
		PrintWriter out = responce.getWriter();
		out.print("i am inside the do get for browser");
		System.out.println("i am inside doget methodd");
		
	}

}
