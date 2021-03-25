package org.roskildedaycare.admin.Repository.Data;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ChildrenRepo {

    static Statement statement = Connector.connectRDAS();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static ArrayList<Child> childrenList;

    public ChildrenRepo() {
    }

    public static ArrayList<Child> fetchAllChildren() {

        String sql = "SELECT * FROM children";
        childrenList = new ArrayList<>();


        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {

                childrenList.add(
                        new Child(
                                res.getInt("student_id"),
                                res.getString("cpr"),
                                res.getString("name"),
                                LocalDate.parse(res.getString("dob"), formatter),
                                res.getInt("class_id"),
                                res.getString("parent_name"),
                                res.getString("parent_number"),
                                res.getInt("payment"),
                                res.getInt("payment_month")
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setClassName(childrenList);

        return childrenList;
    }

    public static void setClassName(ArrayList<Child> list) {
        for (Child i : list) {
            i.setClass_name(ClassesRepo.fetchClassName(i.getClass_id()));
        }
    }

    public static Child fetchChild(int student_id) {

        String sql = "SELECT * FROM children WHERE student_id = '" + student_id + "'";

        Child child;

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {

                return new Child(
                        res.getInt("student_id"),
                        res.getString("cpr"),
                        res.getString("name"),
                        LocalDate.parse(res.getString("dob"), formatter),
                        res.getInt("class_id"),
                        res.getString("parent_name"),
                        res.getString("parent_number"),
                        res.getInt("payment"),
                        res.getInt("payment_month")
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }


}
