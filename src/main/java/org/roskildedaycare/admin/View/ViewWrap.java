package org.roskildedaycare.admin.View;

import org.roskildedaycare.admin.View.Admin.AdminChildrenPanel;
import org.roskildedaycare.admin.View.Admin.AdminHomePanel;
import org.roskildedaycare.admin.View.Teacher.TeacherHomePanel;

public class ViewWrap {

    //PANEL NAMES:
    public static final String START = "start";
    public static final String ADMIN_HOME = "admin";
    public static final String ADMIN_CHILDREN = "admin/children";
    public static final String TEACHER_HOME = "teacher";
    public static final String SCHEDULE = "schedule";

    MainFrame frame;
    StartPanel start;
    SchedulePanel schedule;

    //ADMIN PANELS
    AdminHomePanel admin;
    AdminChildrenPanel adminChildren;

    //TEACHER PANELS
    TeacherHomePanel teacher;

    public ViewWrap() {

        frame = new MainFrame();
        addAllPanels(frame);
        frame.setVisible(true);

    }

    public void addAllPanels(MainFrame frame) {

        start = new StartPanel(frame);
        schedule = new SchedulePanel(frame);
        frame.addPanel(START, start);
        frame.addPanel(SCHEDULE, schedule);

        //ADD ADMIN PANELS
        admin = new AdminHomePanel(frame, start);
        adminChildren = new AdminChildrenPanel(frame);
        frame.addPanel(ADMIN_HOME, admin);
        frame.addPanel(ADMIN_CHILDREN, adminChildren);

        //ADD TEACHER PANELS
        teacher = new TeacherHomePanel(frame, start);
        frame.addPanel(TEACHER_HOME, teacher);

    }

}
