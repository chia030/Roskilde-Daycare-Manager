package org.roskildedaycare.admin.Model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Daycare {

    private String name;
    private String cvr;
    private String phoneNumber;
    private LocalTime opening_hours;
    private LocalTime closing_hours;
    private ArrayList<Child> children_list;
    private ArrayList<Child> waiting_list;
    private ArrayList<Employee> employee_list;

    private User admin;
    private User teacher;

    public Daycare() {
    }

    public Daycare(String name, String cvr, String phoneNumber, LocalTime opening_hours, LocalTime closing_hours, ArrayList<Child> children_list, ArrayList<Child> waiting_list, ArrayList<Employee> employee_list, User admin, User teacher) {
        this.name = name;
        this.cvr = cvr;
        this.phoneNumber = phoneNumber;
        this.opening_hours = opening_hours;
        this.closing_hours = closing_hours;
        this.children_list = children_list;
        this.waiting_list = waiting_list;
        this.employee_list = employee_list;
        this.admin = admin;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalTime getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(LocalTime opening_hours) {
        this.opening_hours = opening_hours;
    }

    public LocalTime getClosing_hours() {
        return closing_hours;
    }

    public void setClosing_hours(LocalTime closing_hours) {
        this.closing_hours = closing_hours;
    }

    public ArrayList<Child> getChildren_list() {
        return children_list;
    }

    public void setChildren_list(ArrayList<Child> children_list) {
        this.children_list = children_list;
    }

    public ArrayList<Child> getWaiting_list() {
        return waiting_list;
    }

    public void setWaiting_list(ArrayList<Child> waiting_list) {
        this.waiting_list = waiting_list;
    }

    public ArrayList<Employee> getEmployee_list() {
        return employee_list;
    }

    public void setEmployee_list(ArrayList<Employee> employee_list) {
        this.employee_list = employee_list;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
