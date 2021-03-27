package org.roskildedaycare.admin.View.Teacher;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Data.ChildrenRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TeacherChildrenPanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JButton backButton;
    private javax.swing.JLabel childrenHeader;
    private javax.swing.JTable childrenTable;
    private javax.swing.JScrollPane tablePane;
    // End of variables

    public TeacherChildrenPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        backButton = new javax.swing.JButton();
        childrenHeader = new javax.swing.JLabel();
        tablePane = new javax.swing.JScrollPane();
        childrenTable = new javax.swing.JTable();

        setOpaque(false);

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

        childrenHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        childrenHeader.setForeground(new java.awt.Color(255, 102, 102));
        childrenHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        childrenHeader.setText("Daycare Children");
        childrenHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tablePane.setBackground(new java.awt.Color(253, 255, 245));
        tablePane.setSize(607, 340);

        childrenTable.setBackground(new java.awt.Color(255, 250, 200));
        childrenTable.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        childrenTable.setForeground(new java.awt.Color(153, 51, 0));

        initTableModel();

        childrenTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        childrenTable.getColumnModel().getColumn(1).setPreferredWidth(100);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        childrenTable.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);

        childrenTable.setAutoscrolls(true);
        childrenTable.setCellSelectionEnabled(true);
        childrenTable.setFillsViewportHeight(true);
        childrenTable.setFocusTraversalPolicyProvider(true);
        childrenTable.setGridColor(new java.awt.Color(153, 51, 0));
        childrenTable.setRowHeight(35);
        childrenTable.setSelectionBackground(new java.awt.Color(255, 255, 234));
        childrenTable.setSelectionForeground(new java.awt.Color(255, 102, 102));
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setShowGrid(true);
        childrenTable.setVerifyInputWhenFocusTarget(false);
        tablePane.setViewportView(childrenTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(82, Short.MAX_VALUE)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(childrenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(childrenHeader)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
        );
    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.TEACHER_HOME);
    }


    public void initTableModel() {
        // TABLE MODEL INIT:
        Object[][] rowData = {};
        String[] columnNames = {"#", "NAME", "AGE", "GROUP"};

        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        for (Child i : ChildrenRepo.fetchAllChildren()) {
            tableModel.addRow(new Object[]{i.getStudent_id() + ".", i.getName(), i.getAge(), i.getClass_name()});
        }
        // END

        childrenTable.setModel(tableModel);
    }

}

