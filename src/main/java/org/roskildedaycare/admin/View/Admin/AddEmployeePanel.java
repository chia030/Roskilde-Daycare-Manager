package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Employee;
import org.roskildedaycare.admin.Repository.Data.EmployeesRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import java.awt.event.ItemEvent;

public class AddEmployeePanel extends javax.swing.JPanel {

    // Variables:
    private static boolean changed; //true when the list has been changed
    private static int checkedBox; // teacher=1, janitor=2

    private javax.swing.JPanel addFormPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpr;
    private javax.swing.JTextField cprField;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel editHeader;
    private javax.swing.JLabel iban;
    private javax.swing.JTextField ibanField;
    private javax.swing.JCheckBox janitorCheckBox;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox paymentCheckBox;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel role;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox teacherCheckBox;
    private javax.swing.JLabel successLabel;
    // End of variables

    public AddEmployeePanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        editHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addFormPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cpr = new javax.swing.JLabel();
        cprField = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        role = new javax.swing.JLabel();
        teacherCheckBox = new javax.swing.JCheckBox();
        janitorCheckBox = new javax.swing.JCheckBox();
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        iban = new javax.swing.JLabel();
        ibanField = new javax.swing.JTextField();
        paymentCheckBox = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        setOpaque(false);

        editHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        editHeader.setForeground(new java.awt.Color(255, 102, 102));
        editHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editHeader.setText("Add Employee");
        editHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        addFormPanel.setBackground(new java.awt.Color(255, 255, 234));
        addFormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));

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
        cprField.setText("[CPR NUMBER]");

        dob.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(153, 51, 0));
        dob.setText("BIRTH:");

        dobField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        dobField.setForeground(new java.awt.Color(102, 102, 102));
        dobField.setText("[yyyy-MM-dd]");

        role.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        role.setForeground(new java.awt.Color(153, 51, 0));
        role.setText("ROLE:");

        teacherCheckBox.setBackground(new java.awt.Color(255, 200, 200));
        teacherCheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        teacherCheckBox.setForeground(new java.awt.Color(153, 51, 0));
        teacherCheckBox.setText("TEACHER");
        teacherCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        teacherCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherCheckBox.setSelected(true);

        teacherCheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherBoxItemListener(evt);
            }
        });


        janitorCheckBox.setBackground(new java.awt.Color(255, 200, 200));
        janitorCheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        janitorCheckBox.setForeground(new java.awt.Color(153, 51, 0));
        janitorCheckBox.setText("JANITOR");
        janitorCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        janitorCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        janitorCheckBox.setSelected(false);


        janitorCheckBox.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                janitorBoxItemListener(evt);
            }
        });

        phone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 51, 0));
        phone.setText("PHONE:");

        phoneField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        phoneField.setForeground(new java.awt.Color(102, 102, 102));
        phoneField.setText("[PHONE NUMBER]");

        iban.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        iban.setForeground(new java.awt.Color(153, 51, 0));
        iban.setText("IBAN:");

        ibanField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        ibanField.setForeground(new java.awt.Color(102, 102, 102));
        ibanField.setText("[IBAN NUMBER]");

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
        saveButton.setToolTipText("Add a new member of the staff.");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed();
            }
        });

        successLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        successLabel.setForeground(new java.awt.Color(153, 51, 0));
        successLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successLabel.setText("   ");
        successLabel.setMaximumSize(new java.awt.Dimension(165, 19));
        successLabel.setMinimumSize(new java.awt.Dimension(165, 19));
        successLabel.setPreferredSize(new java.awt.Dimension(165, 19));
        successLabel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout addFormPanelLayout = new javax.swing.GroupLayout(addFormPanel);
        addFormPanel.setLayout(addFormPanelLayout);
        addFormPanelLayout.setHorizontalGroup(
                addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFormPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                        .addComponent(dob)
                                                        .addComponent(iban)
                                                        .addComponent(role))
                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(teacherCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                                .addComponent(janitorCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(phone)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addFormPanelLayout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(dobField)
                                                                        .addComponent(ibanField)))))
                                        .addGroup(addFormPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(paymentCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)))
                                .addGap(45, 45, 45))
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
                                        .addComponent(dob)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone)
                                        .addComponent(janitorCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(role)
                                        .addComponent(teacherCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ibanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iban))
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(65, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editHeader)
                                .addGap(18, 18, 18)
                                .addComponent(addFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        changed = false;

    }

    private void backButtonActionPerformed(MainFrame frame) {

        if (changed) ViewWrap.staffPanel.refresh(frame);
        frame.changePanel(ViewWrap.ADMIN_STAFF);

    }

    private void teacherBoxItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            checkedBox = 1;
            janitorCheckBox.setSelected(false);
        } else {
            checkedBox = 2;
            janitorCheckBox.setSelected(true);
        }
    }

    private void janitorBoxItemListener(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            checkedBox = 2;
            teacherCheckBox.setSelected(false);
        } else {
            checkedBox = 1;
            teacherCheckBox.setSelected(true);
        }
    }


    private void saveButtonActionPerformed() {

        if ((newEmployee() != null)) {

            if (EmployeesRepo.addEmployee(newEmployee()) == 3) {
                successLabel.setText("Added successfully!");
                changed = true;
            } else {
                successLabel.setText("An error occurred.");
                changed = false;
                System.out.println(EmployeesRepo.addEmployee(newEmployee()));
            }

        /*
        OUTCOME 1 = janitor limit reached
        OUTCOME 2 = teacher limit reached
        OUTCOME 3 = addition successful
        OUTCOME 4 = other error (likely database error or format) //probably some problem with the id
         */

        }

        //refresh/reset -> update arraylist

    }

    private Employee newEmployee() {

        Employee employee;

        try {

            employee = new Employee(
                    nameField.getText(),
                    cprField.getText(),
                    dobField.getText(),
                    phoneField.getText(),
                    ibanField.getText()
            );

            employee.setType((teacherCheckBox.isSelected()) ? "TEACHER" : "JANITOR");
            employee.setPaid(paymentCheckBox.isSelected());


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return employee;

    }

}
