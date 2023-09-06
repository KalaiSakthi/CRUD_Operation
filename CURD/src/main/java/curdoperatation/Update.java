package curdoperatation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Update {
	public static void main(String[] args)throws Exception {
	    Connection con=null;
	    Statement st=null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sakthivillan");
	      st=con.createStatement();
	      int r = st.executeUpdate("update MOvie set name='Anish',age=24 where id=2");
	      System.out.println(r + "rows are updated");
	    } catch (ClassNotFoundException | SQLException e)
	    {
	      System.out.println(e);
	    }
	    finally 
	    {
	      if(con!=null) {
	        con.close();
	      }
	      if(st!=null) {
	        st.close();
	      }
	    }
	  }
	}

