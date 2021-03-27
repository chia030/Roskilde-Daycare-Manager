package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Data.ChildrenRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import java.awt.event.ItemEvent;

public class AddChildPanel extends javax.swing.JPanel {

    // Variables:
    private static boolean changed; //true when the list has been changed
    private static int checkedBox; // unicorn=1, rainbow=2

    private javax.swing.JPanel addFormPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox class1CheckBox;
    private javax.swing.JCheckBox class2CheckBox;
    private javax.swing.JLabel cpr;
    private javax.swing.JTextField cprField;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel group;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel newChildHeader;
    private javax.swing.JLabel parent;
    private javax.swing.JTextField parentField;
    private javax.swing.JCheckBox paymentCheckBox;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel successLabel;
    // End of variables


    public AddChildPanel(MainFrame frame) {
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
        group = new javax.swing.JLabel();
        class1CheckBox = new javax.swing.JCheckBox();
        class2CheckBox = new javax.swing.JCheckBox();
        dob = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        parent = new javax.swing.JLabel();
        parentField = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        paymentCheckBox = new javax.swing.JCheckBox();
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
        addFormPanel.setMaximumSize(new java.awt.Dimension(641, 310));
        addFormPanel.setMinimumSize(new java.awt.Dimension(641, 310));

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

        group.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        group.setForeground(new java.awt.Color(153, 51, 0));
        group.setText("GROUP:");

        class1CheckBox.setBackground(new java.awt.Color(255, 200, 200));
        class1CheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        class1CheckBox.setForeground(new java.awt.Color(153, 51, 0));
        class1CheckBox.setText("UNICORN");
        class1CheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        class1CheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class1CheckBox.setSelected(true);

        class1CheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classCheck1ItemListener(evt);
            }
        });

        class2CheckBox.setBackground(new java.awt.Color(255, 200, 200));
        class2CheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        class2CheckBox.setForeground(new java.awt.Color(153, 51, 0));
        class2CheckBox.setText("RAINBOW");
        class2CheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        class2CheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        class2CheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classCheck2ItemListener(evt);
            }
        });

        dob.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(153, 51, 0));
        dob.setText("BIRTH:");

        dobField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        dobField.setForeground(new java.awt.Color(102, 102, 102));
        dobField.setText("[yyyy-MM-dd]");

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

        paymentCheckBox.setBackground(new java.awt.Color(255, 250, 200));
        paymentCheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        paymentCheckBox.setForeground(new java.awt.Color(153, 51, 0));
        paymentCheckBox.setText("PAYMENT");
        paymentCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        paymentCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 51, 0));
        saveButton.setText("+ADD");
        saveButton.setToolTipText("Add a new child.");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(frame);
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
                                                .addComponent(parent)
                                                .addGap(18, 18, 18)
                                                .addComponent(parentField))
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cpr)
                                                        .addComponent(name))
                                                .addGap(34, 34, 34)
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameField)
                                                        .addComponent(cprField)))
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(phone)
                                                        .addComponent(group))
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(class1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                                .addComponent(class2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dob)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(phoneField))))
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(paymentCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)))
                                .addGap(47, 47, 47))
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
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(class2CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(group)
                                        .addComponent(class1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dob))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(parentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parent))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone))
                                .addGap(35, 35, 35)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paymentCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(successLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(65, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(newChildHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newChildHeader)
                                .addGap(18, 18, 18)
                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        changed = false;

    }

    private void backButtonActionPerformed(MainFrame frame) {
        if (changed) ViewWrap.adminChildren.refresh(frame);
        frame.changePanel(ViewWrap.ADMIN_CHILDREN);
    }

    private void classCheck1ItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            checkedBox = 1;
            class2CheckBox.setSelected(false);
        } else {
            checkedBox = 2;
            class2CheckBox.setSelected(true);
        }
    }

    private void classCheck2ItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            checkedBox = 2;
            class1CheckBox.setSelected(false);
        } else {
            checkedBox = 1;
            class1CheckBox.setSelected(true);
        }
    }

    private void saveButtonActionPerformed(MainFrame frame) {
        if (newChild() != null) {

            if (ChildrenRepo.addChild(newChild())) {
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
                    dobField.getText(),
                    parentField.getText(),
                    phoneField.getText()
            );

            child.setClass_id((class1CheckBox.isSelected()) ? 1 : 2);
            child.setPayment(paymentCheckBox.isSelected());


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return child;

    }

}