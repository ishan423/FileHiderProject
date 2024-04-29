package dao;

import db.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDA0 {
    public static boolean isExists(String email) throws SQLException{
        Connection connect = null;
        try {
            connect = MyConnection.getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        PreparedStatement ps = connect.prepareStatement("select email from users");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String e = rs.getString(1);
            if(e.equals(email)) {
                return true;
            }
        }
            return false;

    }

    public static int saveUser(User user) throws SQLException{
        Connection connect = null;
        try {
            connect = MyConnection.getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        PreparedStatement ps = connect.prepareStatement("insert  into users values (default,?, ?)");
//        ResultSet rs = ps.executeQuery();;

        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
       return ps.executeUpdate();
    }
}
