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

    private ArrayList<Employee> employeesList;

    public static Employee fetchEmployee(int employee_id) {

        String sql = "SELECT * FROM employee WHERE employee_id = '" + employee_id + "'";

        Employee employee;

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
                        res.getString("IBAN")
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

    public ArrayList<Employee> fetchAllEmployees() {

        String sql = "SELECT * FROM staff";
        employeesList = new ArrayList<>();

        try {

            ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
                employeesList.add(
                        new Employee(
                                res.getInt("employee_id"),
                                res.getString("cpr"),
                                res.getString("name"),
                                (res.getString("type")),
                                LocalDate.parse(res.getString("dob"), formatter),
                                res.getString("phone_number"),
                                res.getString("IBAN")
                        ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setAllTypeValues(employeesList);

        return employeesList;

    }





}
