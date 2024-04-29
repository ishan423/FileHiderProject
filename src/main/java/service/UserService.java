package service;

import dao.UserDA0;
import model.User;

import java.sql.SQLException;

public class UserService {

    public static  Integer saveUser(User user){
        try{
            if(UserDA0.isExists(user.getEmail())){
                return 0;
            }
            else {
                UserDA0.saveUser(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 1;
    }
}
