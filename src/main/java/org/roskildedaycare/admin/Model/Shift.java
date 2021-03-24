package org.roskildedaycare.admin.Model;


import java.time.LocalDate;
import java.time.LocalTime;

public class Shift {

    //DATABASE ATTRIBUTES:
    private String shift_id;
    private int class_id;
    private LocalTime start_time;
    private LocalTime end_time;
    private LocalDate day_of_week;

    //ASSIGNED ATTRIBUTES:
    private Employee assignee; // TODO add this variable to the database and make it shuffle every week

    public Shift() {
    }

    public Shift(String shift_id, int class_id, LocalTime start_time, LocalTime end_time, LocalDate day_of_week) {
        this.shift_id = shift_id;
        this.class_id = class_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.day_of_week = day_of_week;
        //assign teacher
    }

    public String getShift_id() {
        return shift_id;
    }

    public void setShift_id(String shift_id) {
        this.shift_id = shift_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public LocalDate getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(LocalDate day_of_week) {
        this.day_of_week = day_of_week;
    }

    public Employee getAssignee() {
        return assignee;
    }

    public void setAssignee(Employee assignee) {
        this.assignee = assignee;
    }
}
