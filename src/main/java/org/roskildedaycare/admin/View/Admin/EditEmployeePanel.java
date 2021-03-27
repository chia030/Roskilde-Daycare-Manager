package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Employee;
import org.roskildedaycare.admin.Repository.Data.EmployeesRepo;
import org.roskildedaycare.admin.Repository.Data.WeeklyShiftsRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

public class EditEmployeePanel extends javax.swing.JPanel {

    // Variables:
    private static boolean changed; //true when the employee's info has been changed
    private static int deletedEmployee;

    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpr;
    private javax.swing.JTextField cprField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobField;
    private javax.swing.JPanel editFormPanel;
    private javax.swing.JLabel editHeader;
    private javax.swing.JLabel iban;
    private javax.swing.JTextField ibanField;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox paymentCheckBox;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel successLabel;
    // End of variables

    public EditEmployeePanel(MainFrame frame, int employee) {
        initComponents(frame);
        if (employee != 0) initEmployee(employee);
    }

    public static int getDeletedEmployee() {
        return deletedEmployee;
    }

    public static void setDeletedEmployee(int deletedEmployee) {
        EditEmployeePanel.deletedEmployee = deletedEmployee;
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        editHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        editFormPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cpr = new javax.swing.JLabel();
        cprField = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        iban = new javax.swing.JLabel();
        ibanField = new javax.swing.JTextField();
        paymentCheckBox = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(771, 539));
        setMinimumSize(new java.awt.Dimension(771, 539));
        setOpaque(false);

        editHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        editHeader.setForeground(new java.awt.Color(255, 102, 102));
        editHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editHeader.setText("Information");
        editHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        backButton.setBackground(new java.awt.Color(255, 250, 200));
        backButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 51, 0));
        backButton.setText("< BACK");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        backButton.setBorderPainted(false);
        backButton.setMaximumSize(new java.awt.Dimension(575, 515));
        backButton.setMinimumSize(new java.awt.Dimension(575, 515));
        backButton.setPreferredSize(new java.awt.Dimension(575, 515));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(frame);
            }
        });

        editFormPanel.setBackground(new java.awt.Color(255, 255, 234));
        editFormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));

        name.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 51, 0));
        name.setText("NAME:");

        nameField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        nameField.setText(" ");

        cpr.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cpr.setForeground(new java.awt.Color(153, 51, 0));
        cpr.setText("CPR:");

        cprField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        cprField.setText(" ");

        dob.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(153, 51, 0));
        dob.setText("BIRTH:");

        dobField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        dobField.setText(" ");

        phone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 51, 0));
        phone.setText("PHONE:");

        phoneField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        phoneField.setText(" ");

        iban.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        iban.setForeground(new java.awt.Color(153, 51, 0));
        iban.setText("IBAN:");

        ibanField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        ibanField.setText(" ");

        paymentCheckBox.setBackground(new java.awt.Color(255, 250, 200));
        paymentCheckBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        paymentCheckBox.setForeground(new java.awt.Color(153, 51, 0));
        paymentCheckBox.setText("PAYMENT");
        paymentCheckBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        paymentCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        saveButton.setBackground(new java.awt.Color(255, 250, 200));
        saveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 51, 0));
        saveButton.setText("SAVE");
        saveButton.setToolTipText("Save the new information.");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(ViewWrap.staffPanel.getEmployee_id());
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 200, 200));
        deleteButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(153, 51, 0));
        deleteButton.setText("DELETE");
        deleteButton.setToolTipText("Delete staff member.");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(ViewWrap.staffPanel.getEmployee_id());
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

        javax.swing.GroupLayout editFormPanelLayout = new javax.swing.GroupLayout(editFormPanel);
        editFormPanel.setLayout(editFormPanelLayout);
        editFormPanelLayout.setHorizontalGroup(
                editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFormPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editFormPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(paymentCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(editFormPanelLayout.createSequentialGroup()
                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cpr)
                                                        .addComponent(name))
                                                .addGap(34, 34, 34)
                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameField)
                                                        .addComponent(cprField)))
                                        .addGroup(editFormPanelLayout.createSequentialGroup()
                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dob)
                                                        .addComponent(phone)
                                                        .addComponent(iban))
                                                .addGap(26, 26, 26)
                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dobField)
                                                        .addComponent(phoneField)
                                                        .addComponent(ibanField))))
                                .addGap(45, 45, 45))
        );
        editFormPanelLayout.setVerticalGroup(
                editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editFormPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(name)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cpr)
                                        .addComponent(cprField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dob)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone))
                                .addGap(18, 18, 18)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ibanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iban))
                                .addGap(35, 35, 35)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(editFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editHeader)
                                .addGap(18, 18, 18)
                                .addComponent(editFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(86, Short.MAX_VALUE))
        );

        changed = false;

    }

    private void backButtonActionPerformed(MainFrame frame) {

        if (changed) ViewWrap.staffPanel.refresh(frame);
        frame.changePanel(ViewWrap.ADMIN_STAFF);

    }

    private void saveButtonActionPerformed(int id) {

        //TODO ask the user to confirm

        if (saveEmployee(id)) {
            successLabel.setText("Changes successful!");
            changed = true;
        } else {
            successLabel.setText("An error occurred.");
            changed = false;
        }

    }

    private void deleteButtonActionPerformed(int id) {

        //TODO ask the user to confirm

        deletedEmployee = id;

        EmployeesRepo.setInactive(id);
        WeeklyShiftsRepo.shuffleShift(id);

        EmployeesRepo.deleteEmployee(id);

        successLabel.setText("Deletion successful!");

        changed = true;

    }

    private void initEmployee(int id) {

        changed = false;

        Employee employee = EmployeesRepo.fetchEmployee(id);

        //SET ALL FIELDS TO DISPLAY THE CORRECT INFO:
        nameField.setText(employee.getName());
        cprField.setText(employee.getCpr());
        dobField.setText(employee.getDob().toString());
        phoneField.setText(employee.getPhone_number());
        ibanField.setText(employee.getIban());
        paymentCheckBox.setSelected(employee.isPaid());

    }

    private boolean saveEmployee(int id) {

        Employee employee;

        try {

            employee = new Employee(
                    nameField.getText(),
                    cprField.getText(),
                    dobField.getText(),
                    phoneField.getText(),
                    ibanField.getText()
            );

            employee.setPaid(paymentCheckBox.isSelected());

        } catch (Exception e) {
            e.printStackTrace();
            employee = null;
        }

        if (employee != null) {

            return EmployeesRepo.alterEmployee(employee, id);

        } else {
            System.out.println("Something went wrong!");
            return false;
        }

    }

    public void refresh(int employee) {
        if (employee != 0) initEmployee(employee);
    }
}
