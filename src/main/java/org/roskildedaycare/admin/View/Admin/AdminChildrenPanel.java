package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.Model.Child;
import org.roskildedaycare.admin.Repository.Data.ChildrenRepo;
import org.roskildedaycare.admin.View.MainFrame;
import org.roskildedaycare.admin.View.ViewWrap;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemEvent;

public class AdminChildrenPanel extends javax.swing.JPanel {

    // Variables:
    private static int editButtonState;
    private static int student_id;

    private javax.swing.JButton backButton;
    private javax.swing.JButton addButton;
    private javax.swing.JToggleButton editButton;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JLabel childrenHeader;
    private javax.swing.JTable childrenTable;
    // End of variables

    //CONSTRUCTOR:
    public AdminChildrenPanel(MainFrame frame) {
        initComponents(frame);
    }

    public static int getStudent_id() {
        return student_id;
    }

    public static void setStudent_id(int student_id) {
        AdminChildrenPanel.student_id = student_id;
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        childrenHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        editButton = new javax.swing.JToggleButton();
        tablePane = new javax.swing.JScrollPane();
        childrenTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();

        setOpaque(false); //sets background as transparent

        childrenHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        childrenHeader.setForeground(new java.awt.Color(255, 102, 102));
        childrenHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        childrenHeader.setText("Daycare Children");
        childrenHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        addButton.setBackground(new java.awt.Color(255, 250, 200));
        addButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 51, 0));
        addButton.setText("+ ADD CHILD");
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

        editButton.setSelected(false);
        editButton.setBackground(new java.awt.Color(255, 250, 200));
        editButton.setForeground(new java.awt.Color(153, 51, 0));
        editButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        editButton.setText("MORE INFO...");
        editButton.setToolTipText("Please select the child whose info you wish to display.");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.setDoubleBuffered(true);
        editButton.setFocusPainted(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setSize(new java.awt.Dimension(142, 42));
        editButton.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editButtonItemListener(evt);
            }
        });

        tablePane.setBackground(new java.awt.Color(253, 255, 245));
        tablePane.setMaximumSize(new java.awt.Dimension(607, 270));
        tablePane.setMinimumSize(new java.awt.Dimension(607, 270));
        tablePane.setPreferredSize(new java.awt.Dimension(607, 270));

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
        childrenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                childrenTableMouseClicked(evt, editButtonState, frame);
            }
        });


        tablePane.setViewportView(childrenTable);


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
                                                .addGap(187, 187, 187)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(childrenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(childrenHeader)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("AdminChildrenPanel");

    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_HOME);
    }

    private void addButtonActionPerformed(MainFrame frame) {
        frame.changePanel(ViewWrap.ADMIN_ADD_CHILD);
    }

    private void editButtonItemListener(java.awt.event.ItemEvent evt) {

        // state (int) can be selected = 1 or deselected = 2
        editButtonState = evt.getStateChange();


        if (editButtonState == ItemEvent.SELECTED) {
            editButton.setBackground(new java.awt.Color(255, 255, 234));
            editButton.setForeground(new java.awt.Color(255, 102, 102));
            childrenTable.setCellSelectionEnabled(false);
            childrenTable.setRowSelectionAllowed(true);
        } else {
            editButton.setBackground(new java.awt.Color(255, 250, 200));
            editButton.setForeground(new java.awt.Color(153, 51, 0));
            childrenTable.setCellSelectionEnabled(true);
        }

    }

    private void childrenTableMouseClicked(java.awt.event.MouseEvent evt, int editButtonState, MainFrame frame) {

        if (evt.getClickCount() == 2 && editButtonState == ItemEvent.SELECTED) {
            JTable target = (JTable) evt.getSource();
            int row = target.getSelectedRow();

            student_id = Integer.parseInt(target.getValueAt(row, 0).toString().replace(".", ""));

            ViewWrap.editChild.refresh(student_id);
            frame.changePanel(ViewWrap.ADMIN_EDIT_CHILD);
            editButton.setSelected(false);

        }

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

    public void refresh(MainFrame frame) {

        ViewWrap.adminChildren.initTableModel();
        student_id = 0;

    }

}
