package org.roskildedaycare.admin.Model;

public class User {

    private String user_name;
    private String password;
    private boolean all_permissions_granted;

    public User() {
    }

    public User(String user_name, String password, boolean all_permissions_granted) {
        this.user_name = user_name;
        this.password = password;
        this.all_permissions_granted = all_permissions_granted;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAll_permissions_granted() {
        return all_permissions_granted;
    }

    public void setAll_permissions_granted(boolean all_permissions_granted) {
        this.all_permissions_granted = all_permissions_granted;
    }

}
