package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Data.WaitingListRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemEvent;

public class WaitingListPanel extends javax.swing.JPanel {

    private static int deleteButtonState;
    // Variables:
    private javax.swing.JButton addButton;
    private javax.swing.JToggleButton deleteButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable childrenTable;
    private javax.swing.JLabel listHeader;
    private javax.swing.JScrollPane tablePane;
    // End of variables

    public WaitingListPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        listHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        tablePane = new javax.swing.JScrollPane();
        childrenTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JToggleButton();

        setOpaque(false);


        listHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        listHeader.setForeground(new java.awt.Color(255, 102, 102));
        listHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listHeader.setText("Waiting List");
        listHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        tablePane.setBackground(new java.awt.Color(255, 255, 234));
        tablePane.setMaximumSize(new java.awt.Dimension(2147483647, 70));
        tablePane.setMinimumSize(new java.awt.Dimension(60, 70));
        tablePane.setPreferredSize(new java.awt.Dimension(640, 95));

        childrenTable.setBackground(new java.awt.Color(255, 250, 200));
        childrenTable.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        childrenTable.setForeground(new java.awt.Color(153, 51, 0));

        // TABLE MODEL INIT:
        Object[][] rowData = {};
        String[] columnNames = {"CPR", "NAME", "PARENT", "PARENT NUMBER"};

        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        for (Child i : WaitingListRepo.fetchWaitingList()) {
            tableModel.addRow(new Object[]{i.getCpr(), i.getName(), i.getParent_name(), i.getParent_number()});
        }
        // END

        childrenTable.setModel(tableModel);
        childrenTable.setAutoscrolls(false);
        childrenTable.setGridColor(new java.awt.Color(153, 51, 0));
        childrenTable.setMinimumSize(new java.awt.Dimension(60, 69));
        childrenTable.setPreferredSize(new java.awt.Dimension(640, 70));
        childrenTable.setRequestFocusEnabled(false);
        childrenTable.setRowHeight(35);
        childrenTable.setSelectionBackground(new java.awt.Color(255, 255, 234));
        childrenTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setShowGrid(true);
        childrenTable.setUpdateSelectionOnSort(false);
        childrenTable.setVerifyInputWhenFocusTarget(false);
        childrenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                childrenTableMouseClicked(evt, deleteButtonState, frame);
            }
        });
        tablePane.setViewportView(childrenTable);

        addButton.setBackground(new java.awt.Color(255, 250, 200));
        addButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 51, 0));
        addButton.setText("+ ADD");
        addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        addButton.setBorderPainted(false);
        addButton.setMaximumSize(new java.awt.Dimension(575, 515));
        addButton.setMinimumSize(new java.awt.Dimension(575, 515));
        addButton.setPreferredSize(new java.awt.Dimension(575, 515));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 250, 200));
        deleteButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(153, 51, 0));
        deleteButton.setText("- DELETE");
        deleteButton.setToolTipText("Please select the entry you wish to edit.");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteButton.setDoubleBuffered(true);
        deleteButton.setFocusPainted(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setPreferredSize(new java.awt.Dimension(142, 142));
        deleteButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteButtonItemEvent(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(260, 260, 260)
                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(listHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listHeader)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100, Short.MAX_VALUE))
        );
    }


    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

    private void childrenTableMouseClicked(java.awt.event.MouseEvent evt, int deleteButtonState, MainFrame frame) {

        if (evt.getClickCount() == 2 && deleteButtonState == ItemEvent.SELECTED) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();
            System.out.println(target.getValueAt(row, 0).toString()); //returns the primary key of the entry (CPR)

            //TODO add a pop-up menu to confirm the deletion of the entry
            //TODO add the data handling

        }

    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonItemEvent(java.awt.event.ItemEvent evt) {

        // state (int) can be selected = 1 or deselected = 2
        deleteButtonState = evt.getStateChange();


        if (deleteButtonState == ItemEvent.SELECTED) {
            deleteButton.setBackground(new java.awt.Color(255, 255, 234));
            deleteButton.setForeground(new java.awt.Color(255, 102, 102));
        } else {
            deleteButton.setBackground(new java.awt.Color(255, 250, 200));
            deleteButton.setForeground(new java.awt.Color(153, 51, 0));
        }

    }

}