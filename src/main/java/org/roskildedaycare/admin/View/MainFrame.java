package org.roskildedaycare.admin.View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout layout;
    private JPanel mainPanel;

    private JPanel start;
    private JPanel admin;

    public MainFrame() {
    }

    public MainFrame(JPanel start, JPanel admin) {

        //YOU NEED TO HAVE ONE MAIN FRAME ONLY AND THEN ADD THINGS TO IT!!!!!!!!!
        //(you can't close the window and then open it again every time!!!!!!!)

        initFrame(start, admin);


//            This makes the frame open ad infinitum lol:
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    new MainFrame().setVisible(true);
//                }
//            });

    }

    public void addComponents(JPanel start, JPanel admin) {

        initFrame(start, admin);

    }

//    @Override
//    public CardLayout getLayout() {
//        return this.layout;
//    }
//
//    public void setLayout(CardLayout layout) {
//        this.layout = layout;
//    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void initFrame(JPanel start, JPanel admin) {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(772, 539));
        setTitle("Daycare Manager");
        setIconImage(new ImageIcon("src/main/resources/view_files/sun_icon.png").getImage());
        setResizable(false);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(253, 255, 245));
//            mainPanel.setSize(new java.awt.Dimension(772, 539));
        layout = new CardLayout();
        mainPanel.setLayout(layout);
        add(mainPanel);
        mainPanel.add("Start", start);
        mainPanel.add("Admin", admin);


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public void displayStartPanel(JPanel startPanel) {

//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            layout.setHorizontalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            );
//            layout.setVerticalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            );

        add(startPanel);
        pack();
        revalidate();
        repaint();

    }

    public void displayAdminHomePanel(JPanel adminPanel) {

        getContentPane().removeAll();

//            removeAll();

//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            layout.setHorizontalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            );
//            layout.setVerticalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            );

        add(adminPanel);

        pack();

        revalidate();
        repaint();

    }

    public void changePanel(String panel) {
//        removeAll();
//        add(panel);
//        revalidate();
//        repaint();
//        mainPanel.add(panel);
        layout.show(mainPanel, panel);

    }

}

