package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Data.WaitingListRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

public class AddWaitingPanel extends javax.swing.JPanel {

    // Variables:
    private static boolean changed; //true when the list has been changed

    private javax.swing.JPanel addFormPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpr;
    private javax.swing.JTextField cprField;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel newChildHeader;
    private javax.swing.JLabel parent;
    private javax.swing.JTextField parentField;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel successLabel;
    // End of variables

    public AddWaitingPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        backButton = new javax.swing.JButton();
        newChildHeader = new javax.swing.JLabel();
        addFormPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cpr = new javax.swing.JLabel();
        cprField = new javax.swing.JTextField();
        parent = new javax.swing.JLabel();
        parentField = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        setOpaque(false);

        backButton.setBackground(new java.awt.Color(255, 250, 200));
        backButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 51, 0));
        backButton.setText("< BACK");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        backButton.setBorderPainted(false);
        backButton.setMaximumSize(new java.awt.Dimension(76, 37));
        backButton.setMinimumSize(new java.awt.Dimension(76, 37));
        backButton.setPreferredSize(new java.awt.Dimension(76, 37));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(frame);
            }
        });

        newChildHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        newChildHeader.setForeground(new java.awt.Color(255, 102, 102));
        newChildHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newChildHeader.setText("Add New Child");
        newChildHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addFormPanel.setBackground(new java.awt.Color(255, 255, 234));
        addFormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        addFormPanel.setMaximumSize(new java.awt.Dimension(641, 250));
        addFormPanel.setMinimumSize(new java.awt.Dimension(641, 250));
        addFormPanel.setPreferredSize(new java.awt.Dimension(641, 250));

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 51, 0));
        name.setText("NAME:");

        nameField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("[NAME]");

        cpr.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cpr.setForeground(new java.awt.Color(153, 51, 0));
        cpr.setText("CPR:");

        cprField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        cprField.setForeground(new java.awt.Color(102, 102, 102));
        cprField.setText("[CPR]");

        parent.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        parent.setForeground(new java.awt.Color(153, 51, 0));
        parent.setText("PARENT:");

        parentField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        parentField.setForeground(new java.awt.Color(102, 102, 102));
        parentField.setText("[NAME OF PARENT]");

        phone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 51, 0));
        phone.setText("PHONE:");

        phoneField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        phoneField.setForeground(new java.awt.Color(102, 102, 102));
        phoneField.setText("[PHONE NUMBER]");

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 51, 0));
        saveButton.setText("+ADD");
        saveButton.setToolTipText("Add a new child to the waiting list.");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        successLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        successLabel.setForeground(new java.awt.Color(153, 51, 0));
        successLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successLabel.setText("   ");
        successLabel.setMaximumSize(new java.awt.Dimension(164, 19));
        successLabel.setMinimumSize(new java.awt.Dimension(164, 19));
        successLabel.setPreferredSize(new java.awt.Dimension(164, 19));
        successLabel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout addFormPanelLayout = new javax.swing.GroupLayout(addFormPanel);
        addFormPanel.setLayout(addFormPanelLayout);
        addFormPanelLayout.setHorizontalGroup(
                addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77))
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addComponent(parent)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(parentField, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cpr)
                                                                        .addComponent(name))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nameField)
                                                                        .addComponent(cprField)))
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addComponent(phone)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(phoneField)))
                                                .addGap(47, 47, 47))))
        );
        addFormPanelLayout.setVerticalGroup(
                addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(name)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cpr)
                                        .addComponent(cprField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parent))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(successLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 187, Short.MAX_VALUE)
                                .addComponent(newChildHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newChildHeader)
                                .addGap(75, 75, 75)
                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(83, Short.MAX_VALUE))
        );

        changed = false;

    }

    private void backButtonActionPerformed(MainFrame frame) {
        if (changed) ViewWrap.waitingList.refresh();
        frame.changePanel(ViewWrap.ADMIN_WAITING_LIST);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {

        //TODO ask the user to confirm

        if (newChild() != null) {

            if (WaitingListRepo.addChild(newChild())) {
                successLabel.setText("Added successfully!");
                changed = true;
            } else {
                successLabel.setText("An error occurred.");
                changed = false;
            }
        }
    }

    private Child newChild() {

        Child child;

        try {

            child = new Child(
                    nameField.getText(),
                    cprField.getText(),
                    parentField.getText(),
                    phoneField.getText()
            );


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return child;

    }


}
