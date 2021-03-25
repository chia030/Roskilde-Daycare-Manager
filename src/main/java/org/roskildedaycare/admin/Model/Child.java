package org.roskildedaycare.admin.Model;

import java.time.LocalDate;
import java.time.Period;


public class Child {

    private int student_id;
    private String cpr;
    private String name;
    private LocalDate dob;
    private int age; // calculateAge()
    private int class_id;
    private String class_name;
    private String parent_name;
    private String parent_number;
    private boolean payment = false; // set to true manually by the admin when the parents (physically) pay
    private int payment_month;

    public Child() {
    }

    //CONSTRUCTOR FOR THE WAITING LIST
    public Child(String cpr, String name, String parent_name, String parent_number) {
        this.cpr = cpr;
        this.name = name;
        this.parent_name = parent_name;
        this.parent_number = parent_number;
    }

    //CONSTRUCTOR FOR NEW CHILDREN WITH A CLASS
    public Child(int student_id, String cpr, String name, LocalDate dob, int class_id, String parent_name, String parent_number, int payment, int payment_month) {
        this.student_id = student_id;
        this.cpr = cpr;
        this.name = name;
        this.dob = dob; //this could be extracted from the cpr
        setAge();
        this.class_id = class_id;
        this.parent_name = parent_name;
        this.parent_number = parent_number;
        this.payment = payment != 0;
        this.payment_month = payment_month;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getParent_number() {
        return parent_number;
    }

    public void setParent_number(String parent_number) {
        this.parent_number = parent_number;
    }

    public void setAge() {
        this.age = Period.between(this.dob, LocalDate.now()).getYears();
    }

    public int getAge() {
        return this.age;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public int getPayment_month() {
        return payment_month;
    }

    public void setPayment_month(int payment_month) {
        this.payment_month = payment_month;
    }

    @Override
    public String toString() {
        return "Child{" +
                "student_id=" + student_id +
                ", cpr='" + cpr + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", parent_name='" + parent_name + '\'' +
                ", parent_number='" + parent_number + '\'' +
                ", payment=" + payment +
                ", payment_month=" + payment_month +
                '}';
    }
}


