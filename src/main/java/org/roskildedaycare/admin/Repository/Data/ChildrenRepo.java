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
    static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");


    private static ArrayList<Child> childrenList;

    public ChildrenRepo() {
    }

    public static ArrayList<Child> fetchAllChildren() {

        checkPayment();

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

    public static int getLastChild() {
        return childrenList.get((childrenList.size()) - 1).getStudent_id();
    }


    public static Child fetchChild(int student_id) {

        String sql = "SELECT * FROM children WHERE student_id = '" + student_id + "'";

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

    //PAYMENT IS SET TO FALSE IF THE PAYMENT MONTH IS NOT THE CURRENT MONTH
    public static void checkPayment() {

        int payment_month = Integer.parseInt(LocalDate.now().format(monthFormatter));

        String sql = "UPDATE children " +
                "SET payment = '0', " +
                "payment_month = '" + payment_month + "' " +
                "WHERE payment_month != '" + payment_month + "'";

        try {
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean addChild(Child child) {

        //something that checks whether the class limit has been reached - missing for now

        int newID = getLastChild() + 1;

        String sql = "INSERT INTO children (student_id,cpr,name,dob,class_id,parent_name,parent_number,payment,payment_month) " +
                "VALUES ( '" + newID + "', '" +
                child.getCpr() + "', '" +
                child.getName() + "', '" +
                child.getDob() + "', '" +
                child.getClass_id() + "', '" +
                child.getParent_name() + "', '" +
                child.getParent_number() + "', '" +
                ((child.isPayment()) ? 1 : 0) + "', '" +
                LocalDate.now().format(monthFormatter) + "' )";

        try {

            statement.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean alterChild(Child child, int student_id) {

        System.out.println(student_id);

        String sql = "UPDATE children SET " +
                "name = '" + child.getName() + "', " +
                "cpr = '" + child.getCpr() + "', " +
                "dob = '" + child.getDob() + "', " +
                "parent_name = '" + child.getParent_name() + "', " +
                "parent_number = '" + child.getParent_number() + "', " +
                "payment = '" + ((child.isPayment()) ? 1 : 0) + "', " +
                "payment_month = '" + LocalDate.now().format(monthFormatter) + "' " +
                "WHERE student_id = '" + student_id + "'";

        try {
            statement.executeUpdate(sql); //this is executing even when the student id doesn't exist :O
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static int deleteChild(int student_id) {

        String sql = "DELETE FROM children WHERE student_id = '" + student_id + "'";

        try {
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student_id;

    }


}
