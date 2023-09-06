package curdoperatation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delet {
  public static void main(String[] args)throws Exception {
    Connection con=null;
    Statement st=null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sakthivillan");
      st=con.createStatement();
      int r = st.executeUpdate("delete from movie where id=2");
      System.out.println(r + "rows are deleted");
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