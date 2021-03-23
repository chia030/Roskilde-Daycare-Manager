package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.SchedulePanel;
import org.roskildedaycare.admin.View.ViewWrap;

public class AdminSchedulePanel extends SchedulePanel {

    public AdminSchedulePanel(MainFrame frame) {
        super(frame);
        super.getBackButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(frame);
            }
        });
    }

    @Override
    protected void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

}
