package com.bday.servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.google.gson.Gson;
import com.bday.db.DBConnectionManager;
import com.bday.vo.Employee;

public class LoadEmployeeData extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List <Employee> list= new ArrayList<Employee>();
		try{
		Connection con =DBConnectionManager.getConnection();
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from employee");
		while(rs.next())
	      {
			Employee ankit= new Employee(rs.getString("Name"),rs.getString("SpouseName"));
	        String bday=rs.getString("Bday");
	        String annivdate=rs.getString("annivdate");
	        String joiningdate=rs.getString("joiningdate");
	        ankit.setAnnivDate(annivdate);
	        ankit.setBday(bday);
	        ankit.setJoiningDate(joiningdate);
	        list.add(ankit);
	      }
		
		Gson gson = new Gson();
		String JSON=gson.toJson(list);
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(JSON);
		out.flush();
		

		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
}
