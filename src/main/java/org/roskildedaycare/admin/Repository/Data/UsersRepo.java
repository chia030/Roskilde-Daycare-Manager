package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.User;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsersRepo {

    static Statement statement = Connector.connectRDAS();

    //UNUSED
    private static ArrayList<User> userList;


    // UNUSED
    public static ArrayList<User> fetchAllUsers() {

        String sql = "SELECT * FROM users";
        userList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                userList.add(
                        new User(
                                res.getString("user_id"),
                                res.getString("password"),
                                res.getInt("all_permissions") == 1
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userList;

    }

    // RETURNS WHETHER THE USER EXISTS
    public static boolean isUser(String id, String password) {

        String userSQL = "SELECT * FROM users WHERE password = '" + password + "' AND EXISTS " +
                "( SELECT user_id FROM users WHERE user_id = '" + id + "')";

        try {
            ResultSet res = statement.executeQuery(userSQL);

            while (res.next()) {
                return true;
            }

            res.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    // RETURNS WHETHER THE CURRENT USER IS AN ADMINISTRATOR
    public static boolean isAdmin(String id) {

        String adminSQL = "SELECT * FROM users WHERE all_permissions = '1'";

        try {
            ResultSet res = statement.executeQuery(adminSQL);

            while (res.next()) {
                return res.getString("user_id").equals(id);
            }

            res.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

}
