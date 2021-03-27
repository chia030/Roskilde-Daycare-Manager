package org.roskildedaycare.admin.View;

import org.roskildedaycare.admin.View.Admin.*;
import org.roskildedaycare.admin.View.Teacher.TeacherChildrenPanel;
import org.roskildedaycare.admin.View.Teacher.TeacherHomePanel;
import org.roskildedaycare.admin.View.Teacher.TeacherSchedulePanel;

public class ViewWrap {

    //  PANEL NAMES:
    public static final String START = "start";
    public static final String ADMIN_HOME = "admin";
    public static final String ADMIN_CHILDREN = "admin/children";
    public static final String ADMIN_ADD_CHILD = "admin/children/add";
    public static final String ADMIN_EDIT_CHILD = "admin/children/edit";
    public static final String ADMIN_STAFF = "admin/staff";
    public static final String ADMIN_ADD_EMPLOYEE = "admin/staff/add";
    public static final String ADMIN_EDIT_EMPLOYEE = "admin/staff/edit";
    public static final String ADMIN_SCHEDULE = "admin/schedule";
    public static final String ADMIN_WAITING_LIST = "admin/waiting-list";
    public static final String ADMIN_ADD_WAITING = "admin/waiting-list/add";
    public static final String ADMIN_SETTINGS = "admin/settings";
    public static final String TEACHER_HOME = "teacher";
    public static final String TEACHER_CHILDREN = "teacher/children";
    public static final String TEACHER_SCHEDULE = "teacher/schedule";
    //  NAMES END

    //  PANELS:
    public static StartPanel start; //login

    //admin
    public static AdminHomePanel admin;
    public static AdminChildrenPanel adminChildren;
    public static AddChildPanel addChild;
    public static EditChildPanel editChild;
    public static StaffPanel staffPanel;
    public static AddEmployeePanel addEmployee;
    public static EditEmployeePanel editEmployee;
    public static AdminSchedulePanel adminSchedule;
    public static WaitingListPanel waitingList;
    public static AddWaitingPanel addWaiting;
    public static SettingsPanel settings;

    //teacher
    public static TeacherHomePanel teacher;
    public static TeacherChildrenPanel teacherChildren;
    public static TeacherSchedulePanel teacherSchedule;

    //  PANELS END

    //FRAME:
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
        addChild = new AddChildPanel(frame);
        editChild = new EditChildPanel(frame, adminChildren.getStudent_id());
        staffPanel = new StaffPanel(frame);
        addEmployee = new AddEmployeePanel(frame);
        editEmployee = new EditEmployeePanel(frame, staffPanel.getEmployee_id());
        adminSchedule = new AdminSchedulePanel(frame);
        waitingList = new WaitingListPanel(frame);
        addWaiting = new AddWaitingPanel(frame);
        settings = new SettingsPanel(frame);
        frame.addPanel(ADMIN_HOME, admin);
        frame.addPanel(ADMIN_CHILDREN, adminChildren);
        frame.addPanel(ADMIN_ADD_CHILD, addChild);
        frame.addPanel(ADMIN_EDIT_CHILD, editChild);
        frame.addPanel(ADMIN_STAFF, staffPanel);
        frame.addPanel(ADMIN_ADD_EMPLOYEE, addEmployee);
        frame.addPanel(ADMIN_EDIT_EMPLOYEE, editEmployee);
        frame.addPanel(ADMIN_SCHEDULE, adminSchedule);
        frame.addPanel(ADMIN_WAITING_LIST, waitingList);
        frame.addPanel(ADMIN_ADD_WAITING, addWaiting);
        frame.addPanel(ADMIN_SETTINGS, settings);

        //ADD TEACHER PANELS
        teacher = new TeacherHomePanel(frame, start);
        teacherChildren = new TeacherChildrenPanel(frame);
        teacherSchedule = new TeacherSchedulePanel(frame);
        frame.addPanel(TEACHER_HOME, teacher);
        frame.addPanel(TEACHER_CHILDREN, teacherChildren);
        frame.addPanel(TEACHER_SCHEDULE, teacherSchedule);

    }

}
