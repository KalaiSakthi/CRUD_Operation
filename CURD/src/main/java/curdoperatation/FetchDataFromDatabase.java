package curdoperatation;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.DriverManager;
	//import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class FetchDataFromDatabase 
	{
	  public static void main(String[] args) throws Exception
	  {
	    Connection con = null;
	    Statement st = null;
	    ResultSet rs = null;

	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sakthivillan");
	      st = con.createStatement();
	      boolean res = st.execute("select * from movie"); //only when we write  dql queries, resultset object is created
	      if(res)
	        rs =st.getResultSet();

	      System.out.println("ID   NAME       AGE");
	      while(rs.next())
	        System.out.println(rs.getInt("id")  +  "    " + rs.getString("name") + "      " + rs.getInt("age"));
	    }
	    catch(SQLException | ClassNotFoundException e){
	      System.out.println(e);
	    }
	    finally 
	    {
	      if(con!=null)
	        con.close();

	      if(st!=null)
	        st.close();

	      if(rs!=null)
	        rs.close();
	    }

	  }
	}
