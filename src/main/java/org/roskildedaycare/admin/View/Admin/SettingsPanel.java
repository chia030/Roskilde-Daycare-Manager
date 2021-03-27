package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Repository.Data.ClassesRepo;
import org.roskildedaycare.admin.Repository.Data.EmployeesRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import java.awt.event.ItemEvent;

public class SettingsPanel extends javax.swing.JPanel {

    // Variables:
    private static boolean class1selected;
    private static boolean teacherCapacitySelected;
    private static boolean teacherSalarySelected;

    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox capJanitorBox;
    private javax.swing.JCheckBox capTeacherBox;
    private javax.swing.JCheckBox class1CheckBox;
    private javax.swing.JCheckBox class2CheckBox;
    private javax.swing.JLabel groupCapacity;
    private javax.swing.JTextField groupCapacityField;
    private javax.swing.JButton groupsSaveButton;
    private javax.swing.JLabel monthlySalary;
    private javax.swing.JLabel settingsHeader;
    private javax.swing.JCheckBox salJanitorBox;
    private javax.swing.JCheckBox salTeacherBox;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton salarySaveButton;
    private javax.swing.JPanel settingsFormPane;
    private javax.swing.JButton staffCapSaveButton;
    private javax.swing.JLabel staffCapacity;
    private javax.swing.JTextField staffCapacityField;
    private javax.swing.JLabel successLabel;
    // End of variables


    public SettingsPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        backButton = new javax.swing.JButton();
        settingsHeader = new javax.swing.JLabel();
        settingsFormPane = new javax.swing.JPanel();
        groupCapacity = new javax.swing.JLabel();
        class1CheckBox = new javax.swing.JCheckBox();
        class2CheckBox = new javax.swing.JCheckBox();
        groupCapacityField = new javax.swing.JTextField();
        groupsSaveButton = new javax.swing.JButton();
        staffCapacity = new javax.swing.JLabel();
        capTeacherBox = new javax.swing.JCheckBox();
        capJanitorBox = new javax.swing.JCheckBox();
        staffCapacityField = new javax.swing.JTextField();
        staffCapSaveButton = new javax.swing.JButton();
        monthlySalary = new javax.swing.JLabel();
        salTeacherBox = new javax.swing.JCheckBox();
        salJanitorBox = new javax.swing.JCheckBox();
        salaryField = new javax.swing.JTextField();
        salarySaveButton = new javax.swing.JButton();
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

        settingsHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        settingsHeader.setForeground(new java.awt.Color(255, 102, 102));
        settingsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsHeader.setText("Settings");
        settingsHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        settingsFormPane.setBackground(new java.awt.Color(255, 255, 234));
        settingsFormPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        settingsFormPane.setMaximumSize(new java.awt.Dimension(573, 308));
        settingsFormPane.setMinimumSize(new java.awt.Dimension(573, 308));
        settingsFormPane.setName(""); // NOI18N
        settingsFormPane.setPreferredSize(new java.awt.Dimension(573, 308));

        groupCapacity.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        groupCapacity.setForeground(new java.awt.Color(153, 51, 0));
        groupCapacity.setText("Set group capacity:");

        class1CheckBox.setBackground(new java.awt.Color(255, 250, 200));
        class1CheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        class1CheckBox.setForeground(new java.awt.Color(153, 51, 0));
        class1CheckBox.setText("UNICORN");
        class1CheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        class1CheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        class1CheckBox.setSelected(true);
        class1selected = true;
        class1CheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                group1CapacityItemListener(evt);
            }
        });

        class2CheckBox.setBackground(new java.awt.Color(255, 250, 200));
        class2CheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        class2CheckBox.setForeground(new java.awt.Color(153, 51, 0));
        class2CheckBox.setText("RAINBOW");
        class2CheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        class2CheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        class2CheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                group2CapacityItemListener(evt);
            }
        });

        groupCapacityField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        groupCapacityField.setForeground(new java.awt.Color(102, 102, 102));
        groupCapacityField.setText("[capacity]");

        groupsSaveButton.setBackground(new java.awt.Color(204, 255, 204));
        groupsSaveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        groupsSaveButton.setForeground(new java.awt.Color(153, 51, 0));
        groupsSaveButton.setText("SAVE");
        groupsSaveButton.setToolTipText("Apply the new capacity to the selected group.");
        groupsSaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        groupsSaveButton.setBorderPainted(false);
        groupsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsSaveButtonActionPerformed(evt);
            }
        });

        staffCapacity.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        staffCapacity.setForeground(new java.awt.Color(153, 51, 0));
        staffCapacity.setText("Set staff capacity:");

        capTeacherBox.setBackground(new java.awt.Color(255, 250, 200));
        capTeacherBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        capTeacherBox.setForeground(new java.awt.Color(153, 51, 0));
        capTeacherBox.setText("TEACHERS");
        capTeacherBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        capTeacherBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        capTeacherBox.setSelected(true);
        teacherCapacitySelected = true;
        capTeacherBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherCapacityItemListener(evt);
            }
        });

        capJanitorBox.setBackground(new java.awt.Color(255, 250, 200));
        capJanitorBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        capJanitorBox.setForeground(new java.awt.Color(153, 51, 0));
        capJanitorBox.setText("JANITORS");
        capJanitorBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        capJanitorBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        capJanitorBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                janitorCapacityItemListener(evt);
            }
        });

        staffCapacityField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        staffCapacityField.setForeground(new java.awt.Color(102, 102, 102));
        staffCapacityField.setText("[capacity]");

        staffCapSaveButton.setBackground(new java.awt.Color(204, 255, 204));
        staffCapSaveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        staffCapSaveButton.setForeground(new java.awt.Color(153, 51, 0));
        staffCapSaveButton.setText("SAVE");
        staffCapSaveButton.setToolTipText("Apply the new capacity to the selected group.");
        staffCapSaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        staffCapSaveButton.setBorderPainted(false);
        staffCapSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffCapSaveButtonActionPerformed(evt);
            }
        });

        monthlySalary.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        monthlySalary.setForeground(new java.awt.Color(153, 51, 0));
        monthlySalary.setText("Set monthly salary:");

        salTeacherBox.setBackground(new java.awt.Color(255, 250, 200));
        salTeacherBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        salTeacherBox.setForeground(new java.awt.Color(153, 51, 0));
        salTeacherBox.setText("TEACHERS");
        salTeacherBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        salTeacherBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salTeacherBox.setSelected(true);
        teacherSalarySelected = true;
        salTeacherBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherSalaryItemListener(evt);
            }
        });

        salJanitorBox.setBackground(new java.awt.Color(255, 250, 200));
        salJanitorBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        salJanitorBox.setForeground(new java.awt.Color(153, 51, 0));
        salJanitorBox.setText("JANITORS");
        salJanitorBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        salJanitorBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        salJanitorBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                janitorSalaryItemListener(evt);
            }
        });

        salaryField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        salaryField.setForeground(new java.awt.Color(102, 102, 102));
        salaryField.setText("[salary]");

        salarySaveButton.setBackground(new java.awt.Color(204, 255, 204));
        salarySaveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        salarySaveButton.setForeground(new java.awt.Color(153, 51, 0));
        salarySaveButton.setText("SAVE");
        salarySaveButton.setToolTipText("Apply the new capacity to the selected group.");
        salarySaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        salarySaveButton.setBorderPainted(false);
        salarySaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarySaveButtonActionPerformed(evt);
            }
        });

        successLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        successLabel.setForeground(new java.awt.Color(153, 51, 0));
        successLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successLabel.setText("   ");
        successLabel.setMaximumSize(new java.awt.Dimension(205, 17));
        successLabel.setMinimumSize(new java.awt.Dimension(205, 17));
        successLabel.setPreferredSize(new java.awt.Dimension(205, 17));

        javax.swing.GroupLayout settingsFormPaneLayout = new javax.swing.GroupLayout(settingsFormPane);
        settingsFormPane.setLayout(settingsFormPaneLayout);
        settingsFormPaneLayout.setHorizontalGroup(
                settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(staffCapacity)
                                        .addComponent(groupCapacity)
                                        .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(monthlySalary)
                                                        .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(salTeacherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(salJanitorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(salarySaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                                        .addGap(70, 70, 70)
                                                        .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(class1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(capTeacherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                                                        .addComponent(class2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(groupCapacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(groupsSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                                                        .addComponent(capJanitorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(29, 29, 29)
                                                                        .addComponent(staffCapacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(staffCapSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(43, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsFormPaneLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183))
        );
        settingsFormPaneLayout.setVerticalGroup(
                settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(settingsFormPaneLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(groupCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(class1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(class2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(groupCapacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(groupsSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(staffCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(capTeacherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(capJanitorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(staffCapacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(staffCapSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(monthlySalary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(settingsFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(salTeacherBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salJanitorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salarySaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(settingsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(settingsFormPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(settingsHeader)
                                .addGap(40, 40, 40)
                                .addComponent(settingsFormPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE))
        );
    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

    private void group1CapacityItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            class2CheckBox.setSelected(false);
            groupCapacityField.setText(String.valueOf(ClassesRepo.getCapacity(1)));
            class1selected = true;
        } else {
            class2CheckBox.setSelected(true);
            class1selected = false;
        }
    }

    private void group2CapacityItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            class1CheckBox.setSelected(false);
            groupCapacityField.setText(String.valueOf(ClassesRepo.getCapacity(2)));
            class1selected = false;
        } else {
            class1CheckBox.setSelected(true);
            class1selected = true;
        }
    }

    private void groupsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (ClassesRepo.setCapacity(Integer.parseInt(groupCapacityField.getText()), (class1selected) ? 1 : 2))
            successLabel.setText("Changes have been saved.");
        else successLabel.setText("Something went wrong...");
    }

    private void teacherCapacityItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            capJanitorBox.setSelected(false);
            staffCapacityField.setText(String.valueOf(EmployeesRepo.fetchStaffCapacity("TEACHER")));
            teacherCapacitySelected = true;
        } else {
            capJanitorBox.setSelected(true);
            teacherCapacitySelected = false;
        }
    }

    private void janitorCapacityItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            capTeacherBox.setSelected(false);
            staffCapacityField.setText(String.valueOf(EmployeesRepo.fetchStaffCapacity("JANITOR")));
            teacherCapacitySelected = false;
        } else {
            capTeacherBox.setSelected(true);
            teacherCapacitySelected = true;
        }
    }

    private void staffCapSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (EmployeesRepo.setCapacity(Integer.parseInt(staffCapacityField.getText()), (teacherCapacitySelected) ? "TEACHER" : "JANITOR"))
            successLabel.setText("Changes have been saved.");
        else successLabel.setText("Something went wrong...");
    }

    private void teacherSalaryItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            salJanitorBox.setSelected(false);
            salaryField.setText(String.valueOf(EmployeesRepo.fetchMonthlySalary("TEACHER")));
            teacherSalarySelected = true;
        } else {
            salJanitorBox.setSelected(true);
            teacherSalarySelected = false;
        }
    }

    private void janitorSalaryItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            salTeacherBox.setSelected(false);
            salaryField.setText(String.valueOf(EmployeesRepo.fetchMonthlySalary("JANITOR")));
            teacherSalarySelected = false;
        } else {
            salTeacherBox.setSelected(true);
            teacherSalarySelected = true;
        }
    }

    private void salarySaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (EmployeesRepo.setSalary(salaryField.getText(), (teacherSalarySelected) ? "TEACHER" : "JANITOR"))
            successLabel.setText("Changes have been saved.");
        else successLabel.setText("Something went wrong...");
    }
}
