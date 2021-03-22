package org.roskildedaycare.admin.Model;

public class DaycareClass {

    private int class_id;
    private String class_name;
    private int children_capacity;

    public DaycareClass() {
    }

    public DaycareClass(int class_id, String class_name, int children_capacity) {
        this.class_id = class_id;
        this.class_name = class_name;
        this.children_capacity = children_capacity;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getChildren_capacity() {
        return children_capacity;
    }

    public void setChildren_capacity(int children_capacity) {
        this.children_capacity = children_capacity;
    }

    @Override
    public String toString() {
        return "DaycareClass{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", children_capacity=" + children_capacity +
                '}';
    }

}


