package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class MyConnection {

public  static Connection connect;
public static Connection getConnection() throws SQLException , ClassNotFoundException {
     Class.forName("com.mysql.cj.jdbc.Driver");
     connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/encrypt" ,"root" , "1234");
    System.out.println("Connected to database");
    return connect;

}
public static void closeConnection() throws SQLException , ClassNotFoundException {
         if(connect != null) {

                 connect.close();

         }

     }
       public static void main(String[] args) throws  ClassNotFoundException {

           try {
               MyConnection.getConnection();
//               MyConnection.closeConnection();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }

       }
}
