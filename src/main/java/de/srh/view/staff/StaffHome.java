package de.srh.view.staff;

import javax.swing.*;

/**
 *
 * @author shiva
 */
public class StaffHome extends javax.swing.JFrame {

    public StaffHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

            AppIcon = new javax.swing.JLabel();
            Appname1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jPanel4 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanel8 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jButton18 = new javax.swing.JButton();
            jLabel6 = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel9 = new javax.swing.JLabel();
            jButton10 = new javax.swing.JButton();
            jPanel6 = new javax.swing.JPanel();
            jLabel8 = new javax.swing.JLabel();
            jButton14 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jPanel9 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            registerPatentBtn = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(1920, 1080));

        AppIcon.setIcon(new javax.swing.ImageIcon("src/main/resources/icon.png"));
        AppIcon.setText("jLabel4");
            AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

            Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            Appname1.setForeground(new java.awt.Color(102, 0, 102));
            Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Appname1.setText("MediCare Hospital");
            Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

            jPanel4.setBackground(new java.awt.Color(216, 181, 224));
            jPanel4.setPreferredSize(new java.awt.Dimension(1920, 48));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel1.setText("Staff Homepage");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            jPanel8.setBackground(new java.awt.Color(216, 181, 224));
            jPanel8.setPreferredSize(new java.awt.Dimension(322, 219));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            jButton18.setText("View");
            jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton18.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton18ActionPerformed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Manage Appointments");

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                    jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel4))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addGap(55, 55, 55)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addGap(115, 115, 115)
                                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(60, Short.MAX_VALUE))
            );
            jPanel8Layout.setVerticalGroup(
                    jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel7.setBackground(new java.awt.Color(216, 181, 224));
            jPanel7.setPreferredSize(new java.awt.Dimension(300, 219));

            jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel9.setText("Manage Records");
            jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            jButton10.setText("Update");
            jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton10ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(75, 75, 75)
                                                    .addComponent(jLabel9))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGap(116, 116, 116)
                                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(82, Short.MAX_VALUE))
            );
            jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(108, Short.MAX_VALUE))
            );

            jPanel6.setBackground(new java.awt.Color(216, 181, 224));
            jPanel6.setPreferredSize(new java.awt.Dimension(322, 219));

            jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel8.setText("Manage Payments");
            jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            jButton14.setText("Manage");
            jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton14.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton14ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(62, 62, 62)
                                                    .addComponent(jLabel8))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(119, 119, 119)
                                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(56, Short.MAX_VALUE))
            );
            jPanel6Layout.setVerticalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(107, Short.MAX_VALUE))
            );

            jPanel2.setBackground(new java.awt.Color(216, 181, 224));
            jPanel2.setPreferredSize(new java.awt.Dimension(300, 219));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel3.setText("Manage Patients");
            jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            jButton2.setText("Add");
            jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton2.setVisible(false);

            jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            jButton6.setText("Manage");
            jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(14, 14, 14))
                                            .addComponent(jLabel3))
                                    .addContainerGap(53, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel3)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(106, Short.MAX_VALUE))
            );

            jPanel9.setBackground(new java.awt.Color(216, 181, 224));
            jPanel9.setPreferredSize(new java.awt.Dimension(322, 219));

            jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel10.setText("Patient Registration");
            jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            registerPatentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
            registerPatentBtn.setText("Manage");
            registerPatentBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            registerPatentBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    registerPatentBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                    jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                    .addGap(62, 62, 62)
                                                    .addComponent(jLabel10))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                    .addGap(119, 119, 119)
                                                    .addComponent(registerPatentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(68, Short.MAX_VALUE))
            );
            jPanel9Layout.setVerticalGroup(
                    jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(registerPatentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(107, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1559, Short.MAX_VALUE)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(0, 1263, Short.MAX_VALUE))
                                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(104, 104, 104)
                                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(49, 49, 49)
                                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(57, 57, 57)
                                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(634, 634, 634)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(52, 52, 52)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(191, Short.MAX_VALUE))
            );

        pack();
    }// </editor-fold>

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JOptionPane.showMessageDialog(this, "Button 11");
        this.toBack();
        this.setVisible(false);
        PatientInfo patientInfo = new PatientInfo();
        patientInfo.toFront();
        patientInfo.setVisible(true);
        patientInfo.setLocationRelativeTo(null);
        patientInfo.setState(java.awt.Frame.NORMAL);
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.toFront();
        medicalRecord.setVisible(true);
        medicalRecord.setLocationRelativeTo(null);
        medicalRecord.setState(java.awt.Frame.NORMAL);
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        ManagePayments managePayments = new ManagePayments();
        managePayments.toFront();
        managePayments.setVisible(true);
        managePayments.setLocationRelativeTo(null);
        managePayments.setState(java.awt.Frame.NORMAL);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        PatientInfo patientInfo = new PatientInfo();
        patientInfo.toFront();
        patientInfo.setVisible(true);
        patientInfo.setLocationRelativeTo(null);
        patientInfo.setState(java.awt.Frame.NORMAL);
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        ManageAppointments manageAppointments= new ManageAppointments();
        manageAppointments.toFront();
        manageAppointments.setVisible(true);
        manageAppointments.setLocationRelativeTo(null);
        manageAppointments.setState(java.awt.Frame.NORMAL);
    }

    private void registerPatentBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        PatientRegistration patientRegistration = new PatientRegistration();
        patientRegistration.toFront();
        patientRegistration.setVisible(true);
        patientRegistration.setLocationRelativeTo(null);
        patientRegistration.setState(java.awt.Frame.NORMAL);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton registerPatentBtn;
    // End of variables declaration
}
