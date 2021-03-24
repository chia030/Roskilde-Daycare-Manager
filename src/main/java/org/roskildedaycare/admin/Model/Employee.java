package org.roskildedaycare.admin.Model;

import java.time.LocalDate;

public class Employee {

    //staff variables:
    private int employee_id;
    private String cpr;
    private String name;
    private String type;
    private LocalDate dob;
    private String phone_number;
    private String iban;

    //TODO add boolean 'isPaid'

    //employee_type variables:
    private String monthlySalary;
    private int hoursPerWeek;

    public Employee() {
    }

    public Employee(int employee_id, String cpr, String name, String type, LocalDate dob, String phone_number, String iban) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", cpr='" + cpr + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dob=" + dob +
                ", phone_number='" + phone_number + '\'' +
                ", iban='" + iban + '\'' +
                ", monthlySalary='" + monthlySalary + '\'' +
                ", hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}


