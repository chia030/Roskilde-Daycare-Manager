package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Employee;
import org.roskildedaycare.admin.Repository.Data.EmployeesRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemEvent;

public class StaffPanel extends javax.swing.JPanel {

    // Variables:
    private static int editButtonState;
    private static int employee_id;

    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JToggleButton editButton;
    private javax.swing.JLabel staffHeader;
    private javax.swing.JTable staffTable;
    private javax.swing.JScrollPane tablePane;
    // End of variables

    public StaffPanel(MainFrame frame) {
        initComponents(frame);
    }

    public static int getEmployee_id() {
        return employee_id;
    }

    public static void setEmployee_id(int employee_id) {
        StaffPanel.employee_id = employee_id;
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        addButton = new javax.swing.JButton();
        tablePane = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        editButton = new javax.swing.JToggleButton();
        backButton = new javax.swing.JButton();
        staffHeader = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(771, 539));
        setMinimumSize(new java.awt.Dimension(771, 539));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(771, 539));

        addButton.setBackground(new java.awt.Color(255, 250, 200));
        addButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 51, 0));
        addButton.setText("+ ADD EMPLOYEE");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        addButton.setBorderPainted(false);
        addButton.setMaximumSize(new java.awt.Dimension(575, 515));
        addButton.setMinimumSize(new java.awt.Dimension(575, 515));
        addButton.setPreferredSize(new java.awt.Dimension(575, 515));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(frame);
            }
        });

        tablePane.setBackground(new java.awt.Color(253, 255, 245));
        tablePane.setMaximumSize(new java.awt.Dimension(729, 201));
        tablePane.setMinimumSize(new java.awt.Dimension(729, 201));
        tablePane.setPreferredSize(new java.awt.Dimension(729, 201));

        staffTable.setBackground(new java.awt.Color(255, 250, 200));
        staffTable.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        staffTable.setForeground(new java.awt.Color(153, 51, 0));

        // TABLE MODEL INIT:
        Object[][] rowData = {};
        String[] columnNames = {"#", "NAME", "PROFESSION", "PHONE N.", "CPR", "IBAN", "PAID"};

        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        for (Employee i : EmployeesRepo.fetchAllEmployees()) {
            tableModel.addRow(new Object[]{i.getEmployee_id() + ".", i.getName(), i.getType(), i.getPhone_number(), i.getCpr(), i.getIban(), i.isPaid()});
        }
        // END

        staffTable.setModel(tableModel);

        staffTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        staffTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        staffTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        staffTable.getColumnModel().getColumn(6).setPreferredWidth(5);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        staffTable.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        staffTable.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);

        staffTable.setAutoscrolls(true);
        staffTable.setCellSelectionEnabled(true);
        staffTable.setFillsViewportHeight(true);
        staffTable.setFocusTraversalPolicyProvider(true);
        staffTable.setGridColor(new java.awt.Color(153, 51, 0));
        staffTable.setRowHeight(35);
        staffTable.setSelectionBackground(new java.awt.Color(255, 255, 234));
        staffTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        staffTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        staffTable.setShowGrid(true);
        staffTable.setVerifyInputWhenFocusTarget(false);
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt, frame);
            }
        });
        tablePane.setViewportView(staffTable);

        editButton.setSelected(false);
        editButton.setBackground(new java.awt.Color(255, 250, 200));
        editButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(153, 51, 0));
        editButton.setSelected(false);
        editButton.setText("EDIT INFO...");
        editButton.setToolTipText("Please select the employee whose info you wish to change.");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.setDoubleBuffered(true);
        editButton.setFocusPainted(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setPreferredSize(new java.awt.Dimension(142, 142));
        editButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editButtonItemListener(evt);
            }
        });

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

        staffHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        staffHeader.setForeground(new java.awt.Color(255, 102, 102));
        staffHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffHeader.setText("Daycare Staff");
        staffHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(staffHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staffHeader)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
        );
    }

    private void editButtonItemListener(java.awt.event.ItemEvent evt) {

        // state (int) can be selected = 1 or deselected = 2
        editButtonState = evt.getStateChange();


        if (editButtonState == ItemEvent.SELECTED) {
            editButton.setBackground(new java.awt.Color(255, 255, 234));
            editButton.setForeground(new java.awt.Color(255, 102, 102));
            staffTable.setCellSelectionEnabled(false);
            staffTable.setRowSelectionAllowed(true);
        } else {
            editButton.setBackground(new java.awt.Color(255, 250, 200));
            editButton.setForeground(new java.awt.Color(153, 51, 0));
            staffTable.setCellSelectionEnabled(true);
        }
    }

    private void staffTableMouseClicked(java.awt.event.MouseEvent evt, MainFrame frame) {

        if (evt.getClickCount() == 2 && editButtonState == ItemEvent.SELECTED) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();

            //selected employee's id: {target.getValueAt(row, 0).toString().charAt(0)}
            employee_id = Integer.parseInt(String.valueOf(target.getValueAt(row, 0).toString().charAt(0)));
            ViewWrap.editEmployee.refresh(employee_id);
            frame.changePanel(ViewWrap.ADMIN_EDIT_EMPLOYEE);

            //TODO fix: this is acting a little weird but it's a minor problem

        }

    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

    private void addButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_ADD_EMPLOYEE);
    }

    public void refresh(MainFrame frame) {
        ViewWrap.staffPanel.initComponents(frame);
    }

}
