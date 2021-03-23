package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

public class EditChildPanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpr;
    private javax.swing.JTextField cprField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobField;
    private javax.swing.JPanel editFormPanel;
    private javax.swing.JLabel editHeader;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel parent;
    private javax.swing.JTextField parentField;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton saveButton;
    // End of variables

    public EditChildPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        editHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        editFormPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        cpr = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        parent = new javax.swing.JLabel();
        parentField = new javax.swing.JTextField();
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cprField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(771, 539));
        setMinimumSize(new java.awt.Dimension(771, 539));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(771, 539));

        editHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        editHeader.setForeground(new java.awt.Color(255, 102, 102));
        editHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editHeader.setText("Edit Information");
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

        cpr.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cpr.setForeground(new java.awt.Color(153, 51, 0));
        cpr.setText("CPR:");

        nameField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        nameField.setText("get data");

        dob.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(153, 51, 0));
        dob.setText("BIRTH:");

        dobField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        dobField.setText("get data");

        parent.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        parent.setForeground(new java.awt.Color(153, 51, 0));
        parent.setText("PARENT:");

        parentField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        parentField.setText("get data");

        phone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(153, 51, 0));
        phone.setText("PHONE:");

        phoneField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        phoneField.setText("get data");

        saveButton.setBackground(new java.awt.Color(255, 250, 200));
        saveButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(153, 51, 0));
        saveButton.setText("SAVE");
        saveButton.setToolTipText("Save the new information.");
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        saveButton.setBorderPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cprField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        cprField.setText("get data");

        deleteButton.setBackground(new java.awt.Color(255, 200, 200));
        deleteButton.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(153, 51, 0));
        deleteButton.setText("DELETE");
        deleteButton.setToolTipText("Delete entry.");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0), 2));
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editFormPanelLayout = new javax.swing.GroupLayout(editFormPanel);
        editFormPanel.setLayout(editFormPanelLayout);
        editFormPanelLayout.setHorizontalGroup(
                editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFormPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                        .addComponent(parent)
                                                        .addComponent(dob))
                                                .addGap(18, 18, 18)
                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dobField)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFormPanelLayout.createSequentialGroup()
                                                                .addComponent(parentField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                                .addComponent(phone)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(editFormPanelLayout.createSequentialGroup()
                                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(26, 26, 26)
                                                                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                                        .addComponent(parent)
                                        .addComponent(parentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone))
                                .addGap(30, 30, 30)
                                .addGroup(editFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(editFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(65, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editHeader)
                                .addGap(35, 35, 35)
                                .addComponent(editFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100, Short.MAX_VALUE))
        );
    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

}