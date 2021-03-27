package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.DaycareClass;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassesRepo {

    static Statement statement = Connector.connectRDAS();

    private static ArrayList<DaycareClass> classesList;

    public static String fetchClassName(int class_id) {

        String sql = "SELECT * FROM classes WHERE class_id = '" + class_id + "'";

        try {
            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                return res.getString("class_name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static ArrayList<DaycareClass> fetchAllClasses() {

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

    public static int getCapacity(int class_id) {
        for (DaycareClass i : fetchAllClasses()) {
            if (i.getClass_id() == class_id) return i.getChildren_capacity();
        }
        return 0;
    }

    public static boolean setCapacity(int capacity, int class_id) {

        String sql = "UPDATE classes SET children_capacity = '" + capacity + "' WHERE class_id ='" + class_id + "'";

        try {
            statement.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
