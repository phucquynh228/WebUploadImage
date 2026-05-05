/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author PhucQuynh
 */
public class UserDAO extends DBContext{
    public User UserLogin(String username, String password){
        String sql = "SELECT UserID, Username, Password FROM Users WHERE Username=? AND Password=? AND is_allowed = 1";

    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            User user = new User();
            user.setUserID(rs.getInt("UserID"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));

            return user;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
        
    }

    public User login(String username, String password) {
        return UserLogin(username, password);
    }
}
