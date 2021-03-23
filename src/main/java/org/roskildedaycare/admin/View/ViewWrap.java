package org.roskildedaycare.admin.View;

import org.roskildedaycare.admin.View.Admin.AdminChildrenPanel;
import org.roskildedaycare.admin.View.Admin.AdminHomePanel;
import org.roskildedaycare.admin.View.Admin.AdminSchedulePanel;
import org.roskildedaycare.admin.View.Admin.WaitingListPanel;
import org.roskildedaycare.admin.View.Teacher.TeacherChildrenPanel;
import org.roskildedaycare.admin.View.Teacher.TeacherHomePanel;
import org.roskildedaycare.admin.View.Teacher.TeacherSchedulePanel;

public class ViewWrap {

    //PANEL NAMES:
    public static final String START = "start";
    public static final String ADMIN_HOME = "admin";
    public static final String ADMIN_CHILDREN = "admin/children";
    public static final String ADMIN_SCHEDULE = "admin/schedule";
    public static final String ADMIN_WAITING_LIST = "admin/waiting-list";
    public static final String TEACHER_HOME = "teacher";
    public static final String TEACHER_CHILDREN = "teacher/children";
    public static final String TEACHER_SCHEDULE = "teacher/schedule";

    public static final String SCHEDULE = "schedule";

    MainFrame frame;
    StartPanel start;

    //ADMIN PANELS
    AdminHomePanel admin;
    AdminChildrenPanel adminChildren;
    AdminSchedulePanel adminSchedule;
    WaitingListPanel waitingList;


    //TEACHER PANELS
    TeacherHomePanel teacher;
    TeacherChildrenPanel teacherChildren;
    TeacherSchedulePanel teacherSchedule;

    public ViewWrap() {

        frame = new MainFrame();
        addAllPanels(frame);
        frame.setVisible(true);

    }

    public void addAllPanels(MainFrame frame) {

        start = new StartPanel(frame);
//        schedule = new SchedulePanel(frame);
        frame.addPanel(START, start);
//        frame.addPanel(SCHEDULE, schedule);

        //ADD ADMIN PANELS
        admin = new AdminHomePanel(frame, start);
        adminChildren = new AdminChildrenPanel(frame);
        adminSchedule = new AdminSchedulePanel(frame);
        waitingList = new WaitingListPanel(frame);
        frame.addPanel(ADMIN_HOME, admin);
        frame.addPanel(ADMIN_CHILDREN, adminChildren);
        frame.addPanel(ADMIN_SCHEDULE, adminSchedule);
        frame.addPanel(ADMIN_WAITING_LIST, waitingList);

        //ADD TEACHER PANELS
        teacher = new TeacherHomePanel(frame, start);
        teacherChildren = new TeacherChildrenPanel(frame);
        teacherSchedule = new TeacherSchedulePanel(frame);
        frame.addPanel(TEACHER_HOME, teacher);
        frame.addPanel(TEACHER_CHILDREN, teacherChildren);
        frame.addPanel(TEACHER_SCHEDULE, teacherSchedule);

    }

}
