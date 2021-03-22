package org.roskildedaycare.admin.Model;

public enum EmployeeType {

    JANITOR(40, "15000 DKK"), TEACHER(20, "12000 DKK");

    private final int hours_per_week;
    private final String monthly_salary;

    EmployeeType(int hours_per_week, String monthly_salary) {
        this.hours_per_week = hours_per_week;
        this.monthly_salary = monthly_salary;
    }

    public int getHours() {
        return hours_per_week;
    }

    public String getSalary() {
        return monthly_salary;
    }

}
