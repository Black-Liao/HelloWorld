package com.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Employee;
import com.test.dao.EmployeeDAO;
import com.test.factory.EmployeeDAOFactory;
import com.test.util.StringExtension;

public class StatusRecognise extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ServletContext context = getServletContext();
		System.out.println("Helloworld");
		RequestDispatcher dispatcher = null;
		String employeeID = request.getParameter("employeeID");
		String password = request.getParameter("password");
		if(StringExtension.isNull(employeeID)){
			request.setAttribute("error", "please input the employeeID");
			dispatcher = context.getRequestDispatcher("/statueRecognise.jsp");
		} else {
			if(StringExtension.isNull(password)){
				request.setAttribute("error", "please input password");
				dispatcher = context.getRequestDispatcher("/statusRecognise.jsp");
			} else {
				EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAOInstance();
				Employee employee = employeeDAO.findEmployeeById(Integer.parseInt(employeeID));
				if(employee == null) {
					request.setAttribute("error", "no have the employee");
					dispatcher = context.getRequestDispatcher("/statusRecognise.jsp");
				} else {
					if(password.equals(password)) {
						request.getSession().setAttribute("employee", employee);
						response.sendRedirect("index.jsp");
						return;
					} else {
						request.setAttribute("error", "password is wrong");
						dispatcher = context.getRequestDispatcher("/statusRecognise.jsp");
					}
				}
			}
		}
		dispatcher.forward(request, response);
	}
	
}
