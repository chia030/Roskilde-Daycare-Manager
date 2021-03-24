package org.roskildedaycare.admin.View;

import org.roskildedaycare.admin.View.Admin.*;
import org.roskildedaycare.admin.View.Teacher.TeacherChildrenPanel;
import org.roskildedaycare.admin.View.Teacher.TeacherHomePanel;
import org.roskildedaycare.admin.View.Teacher.TeacherSchedulePanel;

public class ViewWrap {

    //PANEL NAMES:
    public static final String START = "start";
    public static final String ADMIN_HOME = "admin";
    public static final String ADMIN_CHILDREN = "admin/children";
    public static final String ADMIN_EDIT_CHILD = "admin/children/edit";
    public static final String ADMIN_SCHEDULE = "admin/schedule";
    public static final String ADMIN_WAITING_LIST = "admin/waiting-list";
    public static final String TEACHER_HOME = "teacher";
    public static final String TEACHER_CHILDREN = "teacher/children";
    public static final String TEACHER_SCHEDULE = "teacher/schedule";

    public static final String SCHEDULE = "schedule";

    public static StartPanel start;
    //ADMIN PANELS
    public static AdminHomePanel admin;
    public static AdminChildrenPanel adminChildren;
    public static EditChildPanel editChild;
    public static AdminSchedulePanel adminSchedule;
    public static WaitingListPanel waitingList;
    //TEACHER PANELS
    public static TeacherHomePanel teacher;
    public static TeacherChildrenPanel teacherChildren;
    public static TeacherSchedulePanel teacherSchedule;
    private MainFrame frame;

    public ViewWrap() {

        frame = new MainFrame();
        addAllPanels(frame);

        start.reset(frame); // not very nice to have this here

        frame.setVisible(true);

    }

    public void addAllPanels(MainFrame frame) {

        start = new StartPanel(frame);
        frame.addPanel(START, start);

        //ADD ADMIN PANELS
        admin = new AdminHomePanel(frame, start);
        adminChildren = new AdminChildrenPanel(frame);
        editChild = new EditChildPanel(frame, adminChildren.getStudent_id());
        adminSchedule = new AdminSchedulePanel(frame);
        waitingList = new WaitingListPanel(frame);
        frame.addPanel(ADMIN_HOME, admin);
        frame.addPanel(ADMIN_CHILDREN, adminChildren);
        frame.addPanel(ADMIN_EDIT_CHILD, editChild);
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
