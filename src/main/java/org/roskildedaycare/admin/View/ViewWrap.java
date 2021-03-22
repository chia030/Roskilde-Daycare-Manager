package org.roskildedaycare.admin.View;

public class ViewWrap {

    MainFrame frame;

    public ViewWrap() {

        frame = new MainFrame();

        StartPanel start = new StartPanel(frame);
        AdminHomePanel admin = new AdminHomePanel(frame);

        frame.addComponents(start.getStartPanel(), admin.getAdminPanel());


        frame.changePanel("Start");

        frame.setVisible(true);


//        frame.displayStartPanel(start.getStartPanel());
//        frame.setVisible(true);

        while (start.getLoginSuccessful()) {

            if (start.getValidCredentials() && start.getUserPermission()) {

//                frame.changePanel("Admin");
//                frame.displayAdminHomePanel(admin.getAdminPanel());
//                frame.revalidate();
//                frame.repaint();
//                frame.setVisible(true);


            }

        }
    }

}
