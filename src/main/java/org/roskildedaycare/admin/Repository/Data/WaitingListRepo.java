package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class WaitingListRepo {

    static Statement statement = Connector.connectRDAS();

    private static ArrayList<Child> waitingList;

    public static ArrayList<Child> fetchWaitingList() {

        String sql = "SELECT * FROM waiting_list";
        waitingList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                waitingList.add(
                        new Child(
                                res.getString("cpr"),
                                res.getString("name"),
                                res.getString("parent_name"),
                                res.getString("parent_number")
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return waitingList;

    }

}
