package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.User;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsersRepo {

    static Statement statement = Connector.connectRDAS();

    private static ArrayList<User> userList;

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
}
