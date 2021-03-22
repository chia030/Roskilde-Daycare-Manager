package org.roskildedaycare.admin.Repository.Data;


import org.roskildedaycare.admin.Model.Employee;
import org.roskildedaycare.admin.Model.EmployeeType;
import org.roskildedaycare.admin.Repository.Driver.Connector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class EmployeesRepo {

    static Statement statement = Connector.connectRDAS();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private List<Employee> employeesList;

    public List fetchAllEmployees() {

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
                                EmployeeType.valueOf(res.getString("type")),
                                LocalDate.parse(res.getString("dob"), formatter),
                                res.getString("phone_number"),
                                res.getString("IBAN")
                        ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employeesList;

    }
}
