package org.roskildedaycare.admin.View;

import javax.swing.*;

public class AdminHomePanel {


    // Variables declaration - do not modify
    private javax.swing.JLabel adminHeader;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton childrenButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton waitingListButton;

    // End of variables declaration

    public AdminHomePanel(JFrame frame) {
        initComponents(frame);
    }

    public JLabel getAdminHeader() {
        return adminHeader;
    }

    public void setAdminHeader(JLabel adminHeader) {
        this.adminHeader = adminHeader;
    }

    public JPanel getAdminPanel() {
        return adminPanel;
    }

    public void setAdminPanel(JPanel adminPanel) {
        this.adminPanel = adminPanel;
    }

    public JButton getChildrenButton() {
        return childrenButton;
    }

    public void setChildrenButton(JButton childrenButton) {
        this.childrenButton = childrenButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(JButton logoutButton) {
        this.logoutButton = logoutButton;
    }

    public JButton getScheduleButton() {
        return scheduleButton;
    }

    public void setScheduleButton(JButton scheduleButton) {
        this.scheduleButton = scheduleButton;
    }

    public JButton getSettingsButton() {
        return settingsButton;
    }

    public void setSettingsButton(JButton settingsButton) {
        this.settingsButton = settingsButton;
    }

    public JButton getStaffButton() {
        return staffButton;
    }

    public void setStaffButton(JButton staffButton) {
        this.staffButton = staffButton;
    }

    public JButton getWaitingListButton() {
        return waitingListButton;
    }

    public void setWaitingListButton(JButton waitingListButton) {
        this.waitingListButton = waitingListButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(JFrame frame) {

        adminPanel = new javax.swing.JPanel();
        adminHeader = new javax.swing.JLabel();
        childrenButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();
        waitingListButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();


//        adminPanel.setBackground(new java.awt.Color(253, 255, 245));
        adminPanel.setOpaque(false);

        adminHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        adminHeader.setForeground(new java.awt.Color(255, 102, 102));
        adminHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminHeader.setText("Welcome, Sandra!");
        adminHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        childrenButton.setBackground(new java.awt.Color(255, 250, 200));
        childrenButton.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        childrenButton.setForeground(new java.awt.Color(153, 51, 0));
        childrenButton.setText("Children");
        childrenButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        childrenButton.setBorderPainted(false);
        childrenButton.setDefaultCapable(false);
        childrenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childrenButtonActionPerformed(evt);
            }
        });

        staffButton.setBackground(new java.awt.Color(255, 250, 200));
        staffButton.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        staffButton.setForeground(new java.awt.Color(153, 51, 0));
        staffButton.setText("Staff");
        staffButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        staffButton.setBorderPainted(false);
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        scheduleButton.setBackground(new java.awt.Color(255, 250, 200));
        scheduleButton.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        scheduleButton.setForeground(new java.awt.Color(153, 51, 0));
        scheduleButton.setText("Schedule");
        scheduleButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        scheduleButton.setBorderPainted(false);
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });

        waitingListButton.setBackground(new java.awt.Color(255, 250, 200));
        waitingListButton.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        waitingListButton.setForeground(new java.awt.Color(153, 51, 0));
        waitingListButton.setText("Waiting List");
        waitingListButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        waitingListButton.setBorderPainted(false);
        waitingListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitingListButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(255, 250, 200));
        settingsButton.setFont(new java.awt.Font("Consolas", 2, 14)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(153, 51, 0));
        settingsButton.setText("Settings");
        settingsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        settingsButton.setBorderPainted(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 250, 200));
        logoutButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(153, 51, 0));
        logoutButton.setText("LOG OUT");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        logoutButton.setBorderPainted(false);
        logoutButton.setMaximumSize(new java.awt.Dimension(575, 515));
        logoutButton.setMinimumSize(new java.awt.Dimension(575, 515));
        logoutButton.setPreferredSize(new java.awt.Dimension(575, 515));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
                adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(childrenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                        .addGroup(adminPanelLayout.createSequentialGroup()
                                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminPanelLayout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(waitingListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(adminPanelLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                                .addContainerGap(189, Short.MAX_VALUE)
                                .addComponent(adminHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
        );
        adminPanelLayout.setVerticalGroup(
                adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(adminHeader)
                                .addGap(75, 75, 75)
                                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(childrenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(waitingListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(162, Short.MAX_VALUE))
        );


    }// </editor-fold>

    private void childrenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void waitingListButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


}

