package org.roskildedaycare.admin.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //staff variables:
    private int employee_id;
    private String cpr;
    private String name;
    private String type;
    private LocalDate dob;
    private String phone_number;
    private String iban;
    private boolean paid;
    private int payment_month;

    //employee_type variables:
    private String monthlySalary;
    private int hoursPerWeek;
    private int typeLimit; // - column 'limit' - the amount of employees of that type needed at the daycare

    public Employee() {
    }

    // CONSTRUCTOR TO ADD NEW EMPLOYEE TO THE DATABASE
    public Employee(String name, String cpr, String dob, String phone_number, String iban) {
        this.name = name;
        this.cpr = cpr;
        this.dob = LocalDate.parse(dob, formatter);
        this.phone_number = phone_number;
        this.iban = iban;
    }

    // CONSTRUCTOR FOR STAFF PANEL
    public Employee(int employee_id, String name, String type, String phone_number, String cpr, String iban, int paid, int payment_month) {
        this.employee_id = employee_id;
        this.name = name;
        this.type = type;
        this.phone_number = phone_number;
        this.cpr = cpr;
        this.iban = iban;
        this.paid = paid != 0;
        this.payment_month = payment_month;
    }

    // CONSTRUCTOR FOR ARRAYLIST
    public Employee(int employee_id, String cpr, String name, String type, LocalDate dob, String phone_number, String iban, int paid, int payment_month) {
        this.employee_id = employee_id;
        this.cpr = cpr;
        this.name = name;
        this.type = type;
        this.dob = dob;
        this.phone_number = phone_number;
        this.iban = iban;
        this.paid = paid != 0;
        this.payment_month = payment_month;
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

    public int getTypeLimit() {
        return typeLimit;
    }

    public void setTypeLimit(int typeLimit) {
        this.typeLimit = typeLimit;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getPayment_month() {
        return payment_month;
    }

    public void setPayment_month(int payment_month) {
        this.payment_month = payment_month;
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


