package org.roskildedaycare.admin.View;

import javax.swing.*;

public abstract class SchedulePanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JButton backButton;
    private javax.swing.JLabel childrenHeader;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JScrollPane scheduleTablePanel;
    private javax.swing.JLabel weekNumLabel;
    // End of variables

    public SchedulePanel(MainFrame frame) {
        initComponents(frame);
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        backButton = new javax.swing.JButton();
        childrenHeader = new javax.swing.JLabel();
        weekNumLabel = new javax.swing.JLabel();
        scheduleTablePanel = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();

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
//        backButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                backButtonActionPerformed(evt);
//            }
//        });

        childrenHeader.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        childrenHeader.setForeground(new java.awt.Color(255, 102, 102));
        childrenHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        childrenHeader.setText("Daycare Schedule");
        childrenHeader.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        weekNumLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        weekNumLabel.setForeground(new java.awt.Color(153, 51, 0));
        weekNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weekNumLabel.setText(" Week Number:     ");

        scheduleTablePanel.setBackground(new java.awt.Color(253, 255, 245));
        scheduleTablePanel.setForeground(new java.awt.Color(153, 51, 0));
        scheduleTablePanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scheduleTablePanel.setToolTipText("");
        scheduleTablePanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scheduleTablePanel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        scheduleTablePanel.setMaximumSize(new java.awt.Dimension(751, 266));
        scheduleTablePanel.setMinimumSize(new java.awt.Dimension(751, 266));
        scheduleTablePanel.setPreferredSize(new java.awt.Dimension(751, 266));

        scheduleTable.setBackground(new java.awt.Color(255, 250, 200));
        scheduleTable.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        scheduleTable.setForeground(new java.awt.Color(153, 51, 0));
        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {" 08:00", "  UNICORN", " teachername", " teachername", " teachername", " teachername", " teachername"},
                        {" ", "  RAINBOW", " teachername", " teachername", " teachername", " teachername", " teachername"},
                        {" 12:00", "  UNICORN", " teachername", " teachername", " teachername", " teachername", " teachername"},
                        {"", "  RAINBOW", " teachername", " teachername", " teachername", " teachername", " teachername"}
                },
                new String[]{
                        "START TIME", "CLASS", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        scheduleTable.setAutoscrolls(false);
        scheduleTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        scheduleTable.setFocusable(false);
        scheduleTable.setGridColor(new java.awt.Color(153, 51, 0));
        scheduleTable.setMaximumSize(new java.awt.Dimension(751, 266));
        scheduleTable.setMinimumSize(new java.awt.Dimension(751, 266));
        scheduleTable.setName(""); // NOI18N
        scheduleTable.setPreferredSize(new java.awt.Dimension(751, 266));
        scheduleTable.setRequestFocusEnabled(false);
        scheduleTable.setRowHeight(60);
        scheduleTable.setSelectionBackground(new java.awt.Color(253, 255, 245));
        scheduleTable.setSelectionForeground(new java.awt.Color(204, 0, 0));
        scheduleTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scheduleTable.setShowGrid(true);
        scheduleTable.setUpdateSelectionOnSort(false);
        scheduleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleTableMouseClicked(evt);
            }
        });
        scheduleTablePanel.setViewportView(scheduleTable);
        if (scheduleTable.getColumnModel().getColumnCount() > 0) {
            scheduleTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleTable.getColumnModel().getColumn(3).setResizable(false);
            scheduleTable.getColumnModel().getColumn(4).setResizable(false);
            scheduleTable.getColumnModel().getColumn(5).setResizable(false);
            scheduleTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(weekNumLabel)
                                .addGap(314, 314, 314))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(188, 188, 188)
                                                .addComponent(childrenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scheduleTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(childrenHeader)
                                .addGap(18, 18, 18)
                                .addComponent(weekNumLabel)
                                .addGap(18, 18, 18)
                                .addComponent(scheduleTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(81, Short.MAX_VALUE))
        );
    }


    protected abstract void backButtonActionPerformed(MainFrame frame);

    private void scheduleTableMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }


}