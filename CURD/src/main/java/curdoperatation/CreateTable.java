package curdoperatation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Statement st=null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is Loaded");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sakthivillan");
		System.out.println(con);
		System.out.println("Connection is Established...");
		
		st=con.createStatement();
		
		st.execute("create table Movie(id INT NULL,name VARCHAR(40)NULL,age INT NULL,PRIMARY KEY(id))");
		System.out.println("Statement is created");
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}
		finally {
			if(con!=null)
			con.close();
		}
		  if(st!=null) {
			  st.close();
		  }
	}
	}

