package org.roskildedaycare.admin.View.Teacher;

import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.StartPanel;
import org.roskildedaycare.admin.View.ViewWrap;

public class TeacherHomePanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JLabel adminHeader;
    private javax.swing.JButton childrenButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton scheduleButton;
    // End of variables

    //CONSTRUCTOR:
    public TeacherHomePanel(MainFrame frame, StartPanel start) {
        initComponents(frame, start);
    }


    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame, StartPanel start) {

        logoutButton = new javax.swing.JButton();
        adminHeader = new javax.swing.JLabel();
        childrenButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();

        setOpaque(false); //sets background as transparent

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

        adminHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        adminHeader.setForeground(new java.awt.Color(255, 102, 102));
        adminHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminHeader.setText("Welcome, teacher!");
        adminHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        childrenButton.setBackground(new java.awt.Color(255, 250, 200));
        childrenButton.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        childrenButton.setForeground(new java.awt.Color(153, 51, 0));
        childrenButton.setText("Groups");
        childrenButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        childrenButton.setBorderPainted(false);
        childrenButton.setDefaultCapable(false);

        childrenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childrenButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(182, 182, 182)
                                                .addComponent(adminHeader)))
                                .addContainerGap(181, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(childrenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(adminHeader)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(childrenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(scheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(231, 231, 231))))
        );
    }

    private void logoutButtonActionPerformed(MainFrame frame, StartPanel start) {
        start.reset(frame);
        frame.changePanel(ViewWrap.START);
    }

    private void childrenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void scheduleButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.SCHEDULE);
    }

}
