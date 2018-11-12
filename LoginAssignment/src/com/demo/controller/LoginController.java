package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean enter=false;
		
		
		String userId=req.getParameter("userid");
		String password=req.getParameter("password");
		for(int i=0;i<userId.length();i++) {
			if((Character.isLetter(userId.charAt(i)))
					&&(password.charAt(i)>32&&password.charAt(i)<58||Character.isLetter(password.charAt(i)))) {
				enter=true;
			}
		}
		if(enter) {
		req.setAttribute("userId", userId);
		req.setAttribute("password", password);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/data");
		dispatcher.include(req, resp);
		System.out.println("haha");
		}
		
	}
}
