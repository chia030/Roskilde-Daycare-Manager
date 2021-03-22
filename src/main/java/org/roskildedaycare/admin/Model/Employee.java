package org.roskildedaycare.admin.Model;

import java.time.LocalDate;

public class Employee {

    private int employee_id;
    private String cpr;
    private String name;
    private EmployeeType type;
    private LocalDate dob;
    private String phone_number;
    private String iban;

    public Employee() {
    }

    public Employee(int employee_id, String cpr, String name, EmployeeType type, LocalDate dob, String phone_number, String iban) {
        this.employee_id = employee_id;
        this.cpr = cpr;
        this.name = name;
        this.type = type;
        this.dob = dob;
        this.phone_number = phone_number;
        this.iban = iban;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", cpr='" + cpr + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", dob=" + dob +
                ", phone_number='" + phone_number + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}


