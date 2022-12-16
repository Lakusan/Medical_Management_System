package de.srh.view;

import javax.swing.*;

/**
 *
 * @author shiva
 */
public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
    }

    LoginForm loginForm = new LoginForm();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        AppIcon = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Slogan1 = new javax.swing.JLabel();
        Alert = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Register = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AppIcon.setIcon(new javax.swing.ImageIcon("D:\\Medical management system\\icon.png")); // NOI18N
        AppIcon.setText("jLabel4");
        AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

        Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(102, 0, 102));
        Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appname1.setText("MediCare Hospital");
        Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(102, 0, 102));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome to the MediCare Official Website");
        welcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        welcome.setPreferredSize(new java.awt.Dimension(367, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Medical management system\\pics.png")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(920, 296));

        Slogan1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Slogan1.setForeground(new java.awt.Color(102, 0, 102));
        Slogan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slogan1.setText("\"Everything at one place on MediCare Plus- Manage appointments, patient’s health records, rooms facility, payment records, call records\"");
        Slogan1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        Slogan1.setPreferredSize(new java.awt.Dimension(883, 40));

        Alert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Alert.setForeground(new java.awt.Color(255, 0, 0));
        Alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alert.setText("This system must be accessed only by Doctors, Staff and Administrator");
        Alert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        Register.setBackground(new java.awt.Color(233, 212, 241));
        Register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(233, 212, 241));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(Register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Register)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18))
        );

        Login.setAlignmentX(0.5F);
        Login.setPreferredSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Slogan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
                        .addComponent(Alert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Slogan1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Alert, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        RegistrationForm registrationForm =new RegistrationForm();
        registrationForm.setVisible(true);
        registrationForm.toFront();
        registrationForm.setLocationRelativeTo(null);
        registrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        loginForm.setVisible(true);
        loginForm.toFront();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Homepage homepage = new Homepage();
                homepage.setVisible(true);
                homepage.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Alert;
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Login;
    private javax.swing.JButton Register;
    private javax.swing.JLabel Slogan1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel welcome;
    // End of variables declaration
}
