package curdoperatation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
  public static void main(String[] args) throws SQLException {
    Connection con =  null;
    Statement st = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver is Loaded");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sakthivillan");
      System.out.println("Connection is Establishd...");

      st =con.createStatement();
      System.out.println("Statement is Created");
      boolean res = st.execute("insert into Movie values(2,'VTV',30)");
//       boolean res = st.execute("insert into Student values(3,'rohit',35)");
//      boolean res = st.execute("update Movie set age=33 where id= 1");

     // System.out.println(res + "row get affected.......");

    } catch (ClassNotFoundException | SQLException e) {
      System.out.println(e);
    } 
    finally {
      if(con!=null) {
        con.close();
        System.out.println("Connection has been closed");
      }
      if(st!=null) {
        st.close();
        System.out.println("Statement has been closed");

      }
    }
  }
}


