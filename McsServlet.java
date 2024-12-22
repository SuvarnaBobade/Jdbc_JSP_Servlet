package com.servletDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class McsServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fname= request.getParameter("fname");
	String Degree=request.getParameter("degree");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("mysql:jdbc://localhost:3306:/servlet","root","root");
		PreparedStatement ps=c.prepareStatement("select * from registerform where fname=? and degree=? ");
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
