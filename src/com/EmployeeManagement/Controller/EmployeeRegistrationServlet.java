package com.EmployeeManagement.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet
public class EmployeeRegistrationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 String action = request.getServletPath().toString();
		 
     	System.out.println(action);
     	switch(action) {
     	case "/":
     		RequestDispatcher dispatcher = request.getRequestDispatcher("employeeRegistration.jsp");
             dispatcher.forward(request, response); break;
            
     	case "/insert":
     		
     		String employeeName = (request.getParameter("employeeName"));
     		String employeeId = (request.getParameter("employeeId"));
     		String phoneNumber = (request.getParameter("phoneNumber"));
     		String emailId = (request.getParameter("emailId"));
     		
     	//	RequestDispatcher req = request.getRequestDispatcher("employeeRegistration.jsp");
     	//	req.forward(request, response);
     		System.out.println(employeeName);
     		System.out.println(employeeId);
     		System.out.println(phoneNumber);
     		System.out.println(emailId);
     	}
		
		
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	 String action = request.getServletPath().toString();
 
        	System.out.println(action);
        	switch(action) {
        	case "/":
        		RequestDispatcher dispatcher = request.getRequestDispatcher("employeeRegistration.jsp");
                dispatcher.forward(request, response); break;
               
        	case "/insert":
        		
        		String employeeName = (request.getParameter("employeeName"));
        		String employeeId = (request.getParameter("employeeId"));
        		String phoneNumber = (request.getParameter("phoneNumber"));
        		String emailId = (request.getParameter("emailId"));
        		
        	//	RequestDispatcher req = request.getRequestDispatcher("employeeRegistration.jsp");
        	//	req.forward(request, response);
        		System.out.println(employeeName);
        		System.out.println(employeeId);
        		System.out.println(phoneNumber);
        		System.out.println(emailId);
        		
//        		request.setAttribute("employeeName",employeeName);
//        		request.setAttribute("employeeId", employeeId);
//        		request.setAttribute("phoneNumber", phoneNumber);
//        		request.setAttribute("emailId", emailId);
//        		request.getRequestDispatcher("display.jsp").forward(request, response); 
//        		break;
    		
        	}
        	
	
	}    
    }


