package org.roskildedaycare.admin.Repository.Data;


import org.roskildedaycare.admin.Model.Employee;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class EmployeesRepo {

    static Statement statement = Connector.connectRDAS();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");

    private static ArrayList<Employee> employeesList;
    private static int teacherCount;
    private static int janitorCount;


    public static Employee fetchEmployee(int employee_id) {

        String sql = "SELECT * FROM staff WHERE employee_id = '" + employee_id + "'";

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {

                return new Employee(
                        res.getInt("employee_id"),
                        res.getString("cpr"),
                        res.getString("name"),
                        res.getString("type"),
                        LocalDate.parse(res.getString("dob"), formatter),
                        res.getString("phone_number"),
                        res.getString("IBAN"),
                        res.getInt("is_paid"),
                        res.getInt("payment_month")
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    //probably better to use this for individual queries
    public static Employee fetchTypeValues(Employee employee) {

        String sql = "SELECT * FROM employee_type WHERE type = '" + employee.getType() + "'";

        try {
            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {

                employee.setHoursPerWeek(res.getInt("hours_per_week"));
                employee.setMonthlySalary(res.getString("monthly_salary"));
                employee.setTypeLimit(res.getInt("limit"));

                return employee;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void setAllTypeValues(ArrayList<Employee> list) {
        for (Employee i : list) {
            fetchTypeValues(i);
        }
    }

    public static ArrayList<Employee> fetchAllEmployees() {

        String sql = "SELECT * FROM staff";

        janitorCount = 0;
        teacherCount = 0;

        Employee employee;
        employeesList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                employee =
                        new Employee(
                                res.getInt("employee_id"),
                                res.getString("cpr"),
                                res.getString("name"),
                                (res.getString("type")),
                                LocalDate.parse(res.getString("dob"), formatter),
                                res.getString("phone_number"),
                                res.getString("IBAN"),
                                res.getInt("is_paid"),
                                res.getInt("payment_month")
                        );

                if (employee.getType().equals("JANITOR")) janitorCount++;
                else teacherCount++;

                employeesList.add(employee);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setAllTypeValues(employeesList);

        return employeesList;

    }

    public static int getLastEmployee() {
        return employeesList.get((employeesList.size()) - 1).getEmployee_id();
    }

    public static int addEmployee(Employee employee) {

        /*
        OUTCOME 1 = janitor limit reached
        OUTCOME 2 = teacher limit reached
        OUTCOME 3 = addition successful
        OUTCOME 4 = other error (likely database error or format)
         */

        fetchTypeValues(employee);

/*      I TURNED THIS PART OFF FOR THE SAKE OF TESTING, FOR NOW [LIMIT CHECK]

        // checking if the limit has already been reached:
//        if (employee.getType().equals("JANITOR") && employee.getTypeLimit() == janitorCount) return 1;
//        else if (employee.getType().equals("TEACHER") && employee.getTypeLimit() == teacherCount) return 2;


*/
        int newID = getLastEmployee() + 1;

        String sql = "INSERT INTO staff (employee_id,cpr,name,type,dob,phone_number,IBAN,is_paid,payment_month) " +
                "VALUES ( '" + newID + "', '" +
                employee.getCpr() + "', '" +
                employee.getName() + "', '" +
                employee.getType() + "', '" +
                employee.getDob() + "', '" +
                employee.getPhone_number() + "', '" +
                employee.getIban() + "', '" +
                ((employee.isPaid()) ? 1 : 0) + "', '" +
                LocalDate.now().format(monthFormatter) + "' )";

        try {

            statement.executeUpdate(sql);

            return 3;

        } catch (Exception e) {
            e.printStackTrace();
            return 4;
        }

    }

    public static boolean alterEmployee(Employee employee, int employee_id) {

        System.out.println(employee_id);

        String sql = "UPDATE staff SET " +
                "name = '" + employee.getName() + "', " +
                "cpr = '" + employee.getCpr() + "', " +
                "dob = '" + employee.getDob() + "', " +
                "phone_number = '" + employee.getPhone_number() + "', " +
                "IBAN = '" + employee.getIban() + "', " +
                "is_paid = '" + ((employee.isPaid()) ? 1 : 0) + "', " +
                "payment_month = '" + LocalDate.now().format(monthFormatter) + "' " +
                "WHERE employee_id = '" + employee_id + "'";

        try {
            statement.executeUpdate(sql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


    public static void setInactive(int employee_id) {

        String sql = "UPDATE staff SET is_active = '0' WHERE employee_id ='" + employee_id + "'";

        try {
            statement.executeUpdate(sql);
            teacherCount -= 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int deleteEmployee(int employee_id) {

        String sql = "DELETE FROM staff WHERE employee_id = '" + employee_id + "'";

        try {
            statement.executeUpdate(sql);
            employeesList.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee_id;

    }


    public static int fetchInactive() {

        String sql = "SELECT * FROM staff WHERE type = 'TEACHER' AND is_active = '0'";

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                return res.getInt("employee_id"); //returns the first one only
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;

    }


}
