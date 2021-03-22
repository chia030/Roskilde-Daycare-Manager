package org.roskildedaycare.admin.View.Admin;

import org.roskildedaycare.admin.View.MainFrame;

public class AdminChildrenPanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JButton backButton;
    private javax.swing.JLabel childrenHeader;
    private javax.swing.JTable childrenTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables

    //CONSTRUCTOR:
    public AdminChildrenPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        childrenHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        childrenTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setOpaque(false); //sets background as transparent

        childrenHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        childrenHeader.setForeground(new java.awt.Color(255, 102, 102));
        childrenHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        childrenHeader.setText("Daycare Children");
        childrenHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jScrollPane1.setBackground(new java.awt.Color(253, 255, 245));

        childrenTable.setBackground(new java.awt.Color(255, 250, 200));
        childrenTable.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        childrenTable.setForeground(new java.awt.Color(153, 51, 0));
        childrenTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "#", "NAME", "AGE", "CLASS"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        childrenTable.setCellSelectionEnabled(true);
        childrenTable.setGridColor(new java.awt.Color(153, 51, 0));
        childrenTable.setSelectionBackground(new java.awt.Color(253, 255, 245));
        childrenTable.setSelectionForeground(new java.awt.Color(204, 0, 0));
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        childrenTable.setShowGrid(true);
        childrenTable.setShowVerticalLines(false);
        childrenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                childrenTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(childrenTable);
        childrenTable.getAccessibleContext().setAccessibleName("");
        childrenTable.getAccessibleContext().setAccessibleDescription("");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 122, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))
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
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(childrenHeader)
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("AdminChildrenPanel");
    }

    private void backButtonActionPerformed(MainFrame frame) {
        frame.changePanel("admin");
    }

    private void childrenTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

}
