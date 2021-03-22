package org.roskildedaycare.admin.View;

import org.roskildedaycare.admin.Repository.Data.UsersRepo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends javax.swing.JPanel {

    // Variables:
    private javax.swing.JLabel header;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel successLabel;

    private boolean validCredentials;
    private boolean userPermission;
    // End of variables

    //CONSTRUCTOR:
    public StartPanel(MainFrame frame) {
        initComponents(frame);
    }

    @SuppressWarnings("unchecked")
    private void initComponents(MainFrame frame) {

        header = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        setOpaque(false); //sets background as transparent

        header.setFont(new java.awt.Font("MS Gothic", 2, 48)); // NOI18N
        header.setForeground(new java.awt.Color(255, 102, 102));
        header.setText("Roskilde Daycare");
        header.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        loginPanel.setBackground(new java.awt.Color(255, 255, 234));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));

        username.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(153, 51, 0));
        username.setText("USERNAME:");

        password.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 51, 0));
        password.setText("PASSWORD:");

        usernameField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N

        passwordField.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N

        loginButton.setBackground(new java.awt.Color(255, 250, 200));
        loginButton.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        loginButton.setForeground(new java.awt.Color(153, 51, 0));
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 0)));
        loginButton.setBorderPainted(false);

        successLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        successLabel.setForeground(new java.awt.Color(153, 51, 0));
        successLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successLabel.setText("   ");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(frame);
            }
        });

        // there is no need for a key-listener if the key is "ENTER"

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(username)
                                                .addGap(18, 18, 18)
                                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(password)
                                                .addGap(18, 18, 18)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addContainerGap(111, Short.MAX_VALUE)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(169, 169, 169))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108))))
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(successLabel)
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(this);
        setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
                startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(189, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
                startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(header)
                                .addGap(64, 64, 64)
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(113, Short.MAX_VALUE))
        );

        //sets the default button as the login button (ENTER triggers it):
        frame.setDefButton(loginButton);

    }


    private void loginButtonActionPerformed(MainFrame frame) {

        validCredentials = false;
        userPermission = false;

//        TEST:
//        successLabel.setText(UsersRepo.isUser(usernameField.getText(), passwordField.getText())) ? "Login successful!" : "Try again!");

        if (UsersRepo.isUser(usernameField.getText(), passwordField.getText())) {

            successLabel.setText("Login successful!"); //not showing :(((
            validCredentials = true;
            userPermission = UsersRepo.isAdmin(usernameField.getText());

        } else {
            successLabel.setText("Try again!");
            return;
        }

//        try {Thread.sleep(2000);} catch(Exception e) {e.printStackTrace();}
        login(frame);

    }

    public void login(MainFrame frame) {

        //changing panel seems to be working only if done when the button is activated
        // cause=actionPerformed private??
        frame.changePanel(userPermission ? ViewWrap.ADMIN_HOME : ViewWrap.TEACHER_HOME);
        frame.setDefButton(null);

    }

    //implemented in AdminHomePanel and TeacherHomePanel when they log out
    public void reset(MainFrame frame) {

        usernameField.setText("");
        passwordField.setText("");
        successLabel.setText("   ");

        frame.setDefButton(loginButton);

    }
}
