package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.StartPanel;
import org.roskildedaycare.admin.View.ViewWrap;

public class AdminHomePanel extends javax.swing.JPanel {


    // Variables:
    private javax.swing.JLabel adminHeader;
    private javax.swing.JButton childrenButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton waitingListButton;
    // End of variables

    //CONSTRUCTOR:
    public AdminHomePanel(MainFrame frame, StartPanel start) {
        initComponents(frame, start);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame, StartPanel start) {

        adminHeader = new javax.swing.JLabel();
        childrenButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();
        waitingListButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setOpaque(false); //sets background as transparent

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
                childrenButtonActionPerformed(frame);
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
                staffButtonActionPerformed(frame);
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
                scheduleButtonActionPerformed(frame);
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
                waitingListButtonActionPerformed(frame);
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
                settingsButtonActionPerformed(frame);
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
                logoutButtonActionPerformed(frame, start);
            }
        });

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(this);
        setLayout(adminPanelLayout);
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


    }

    private void childrenButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_CHILDREN);
    }

    private void staffButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_STAFF);
    }

    private void scheduleButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_SCHEDULE);
    }

    private void waitingListButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_WAITING_LIST);
    }

    private void settingsButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_SETTINGS);
    }

    private void logoutButtonActionPerformed(MainFrame frame, StartPanel start) {
        start.reset(frame);
        frame.changePanel(ViewWrap.START);
    }


}

