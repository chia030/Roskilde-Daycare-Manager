package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.DaycareClass;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassesRepo {

    static Statement statement = Connector.connectRDAS();

    private ArrayList<DaycareClass> classesList;

    public static String fetchClassName(int class_id) {

        String sql = "SELECT * FROM classes WHERE class_id = '" + class_id + "'";

        try {
            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                return res.getString("class_name").toUpperCase();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<DaycareClass> fetchAllClasses() {

        String sql = "SELECT * FROM classes";
        classesList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                classesList.add(
                        new DaycareClass(
                                res.getInt("class_id"),
                                res.getString("class_name"),
                                res.getInt("children_capacity")
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return classesList;

    }

}
