package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/movie")
public class MovieServlet extends HttpServlet {
	
@Override	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		String year=req.getParameter("year");
		String description =req.getParameter("description");
		String director=req.getParameter("director");
		String duration=req.getParameter("duration");
		String poster=req.getParameter("poster");
		String rating=req.getParameter("rating");
		
	
		
	try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String sql="insert into movie (name, year, description, director, duration, poster, rating, doe)" + "values(?,?,?,?,?,?,?,?)";

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/signup_db","root","root");
			// pstmt -contains compiled query
						PreparedStatement pstmt=con.prepareStatement(sql);
						
						//setting values inside the place holders
						pstmt.setString(1, name);
						pstmt.setString(2, year);
						pstmt.setString(3, description);
						pstmt.setString(4, director);
						pstmt.setString(5, duration);
						pstmt.setString(6, poster);
						pstmt.setString(7, rating);
					
						//Creating instance of Timestamp
						long millis = new Date().getTime();
						Timestamp timestamp=new Timestamp(millis);
						
						pstmt.setTimestamp(8, timestamp);
						
						//fire the query!!!
						pstmt.executeUpdate();
						
					}catch (Exception e) {
						e.printStackTrace();

		}
		
		
		
		
		Movie movie = new Movie(name, year, description, director, duration, poster, rating);
		
		req.setAttribute("data", movie);
		req.getRequestDispatcher("movieReview.jsp").forward(req, resp);
	}
}
