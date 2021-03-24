package org.roskildedaycare.admin.View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    //Variables:
    private CardLayout layout;
    private JPanel mainPanel;
    //End of variables

    //CONSTRUCTOR:
    public MainFrame() {
        initFrame();
        setDefButton(null);
    }

//            This makes the frame open ad infinitum lol:
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    new MainFrame().setVisible(true);
//                }
//            });

//    }

    public void initFrame() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(772, 539));
        setTitle("Daycare Manager");
        setIconImage(new ImageIcon("src/main/resources/view_files/sun_icon.png").getImage());
        setResizable(false);
        setLocationRelativeTo(null); //the window will show up at the center of the screen

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(253, 255, 245));

        layout = new CardLayout();
        mainPanel.setLayout(layout);

        add(mainPanel);

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

    public void addPanel(String name, JPanel panel) {
        mainPanel.add(name, panel);
    }

    public void goBack() {
        layout.previous(mainPanel);
    }

    public void changePanel(String panel) {
        layout.show(mainPanel, panel);
    }

    //Sets the default button as needed:
    public void setDefButton(JButton button) {
        getRootPane().setDefaultButton(button);
    }


    //this is not needed but I'm keeping it for the future ->

    //    public void displayStartPanel(JPanel startPanel) {
//
////            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
////            getContentPane().setLayout(layout);
////            layout.setHorizontalGroup(
////                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////                            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////            );
////            layout.setVerticalGroup(
////                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////                            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////            );
//
//        add(startPanel);
//        pack();
//        revalidate();
//        repaint();
//
//    }
//
//    public void displayAdminHomePanel(JPanel adminPanel) {
//
//        getContentPane().removeAll();
//
////            removeAll();
//
////            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
////            getContentPane().setLayout(layout);
////            layout.setHorizontalGroup(
////                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////                            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////            );
////            layout.setVerticalGroup(
////                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
////                            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
////            );
//
//        add(adminPanel);
//
//        pack();
//
//        revalidate();
//        repaint();
//
//    }


}

