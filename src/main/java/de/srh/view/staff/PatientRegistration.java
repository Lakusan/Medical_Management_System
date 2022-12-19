package de.srh.view.staff;

import de.srh.dao.impl.PatientDAOImpl;
import de.srh.model.Patient;
import org.apache.commons.validator.routines.EmailValidator;

import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shiva
 */
public class PatientRegistration extends javax.swing.JFrame {

    public PatientRegistration() {
        initComponents();
    }

        private void clearFields(){
            firstnameTextField.setText(null);
            lastnameTextField.setText(null);
            symptomsTextField.setText(null);
            phoneTextField.setText(null);
            houseNoTextField.setText(null);
            nurseAssignedTextField.setText(null);
            cityTextField.setText(null);
            countryTextField.setText(null);
            doctorAssignedTextField.setText(null);
            houseNoTextField.setText(null);
            symptomsTextField.setText(null);
            streetTextField.setText(null);
            dateTextField.cleanup();
            emailTextField.setText(null);
            postalcodeTextField.setText(null);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            AppIcon = new javax.swing.JLabel();
            Appname1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jPanel1 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            firstnameTextField = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            lastnameTextField = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            phoneTextField = new javax.swing.JTextField();
            houseNoTextField = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            nurseAssignedTextField = new javax.swing.JTextField();
            jLabel9 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            title = new javax.swing.JComboBox<>();
            jLabel16 = new javax.swing.JLabel();
            symptomsTextField = new javax.swing.JTextField();
            dateTextField = new com.toedter.calendar.JDateChooser();
            plab1 = new javax.swing.JLabel();
            BloodgroupTextField = new javax.swing.JComboBox<>();
            streetTextField = new javax.swing.JTextField();
            jLabel10 = new javax.swing.JLabel();
            doctorAssignedTextField = new javax.swing.JTextField();
            cityTextField = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            jLabel17 = new javax.swing.JLabel();
            countryTextField = new javax.swing.JTextField();
            postalcodeTextField = new javax.swing.JTextField();
            jLabel18 = new javax.swing.JLabel();
            emailTextField = new javax.swing.JTextField();
            jLabel20 = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            jLabel19 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            AppIcon.setText("jLabel4");
            AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

            Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            Appname1.setForeground(new java.awt.Color(102, 0, 102));
            Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            Appname1.setText("MediCare Hospital");
            Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

            jPanel1.setBackground(new java.awt.Color(216, 181, 224));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel3.setText("First Name:");

            jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel6.setText("Symptoms:");

            jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel8.setText("Date of birth:");

//            firstnameTextField.addActionListener(new java.awt.event.ActionListener() {
//                public void actionPerformed(java.awt.event.ActionEvent evt) {
//                    firstnameTextFieldActionPerformed(evt);
//                }
//            });
            firstnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    firstnameTextFieldKeyReleased(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel5.setText("Last Name:");

            jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel7.setText("Blood Group:");

//            lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
//                public void actionPerformed(java.awt.event.ActionEvent evt) {
//                    lastnameTextFieldActionPerformed(evt);
//                }
//            });
//            lastnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
//                public void keyReleased(java.awt.event.KeyEvent evt) {
//                    lastnameTextFieldKeyReleased(evt);
//                }
//            });

            jButton1.setText("Register");
            jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("Clear Form");
            jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("Homepage");
            jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

            phoneTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    phoneTextFieldKeyReleased(evt);
                }
            });

//            houseNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
//                public void keyReleased(java.awt.event.KeyEvent evt) {
//                    houseNoTextFieldKeyReleased(evt);
//                }
//            });

            jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

            nurseAssignedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    nurseAssignedTextFieldKeyReleased(evt);
                }
            });
            houseNoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    houseNoTextFieldKeyReleased(evt);
                }
            });


            jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel9.setText("Street:");

            jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel12.setText("Patient's Registration form");

            jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel13.setText("Nurse Assigned:");

            jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel14.setText("Doctor Assigned:");

            jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel15.setText("Phone number:");

            title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Ms" }));

            jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel16.setText("Title:");

            symptomsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    symptomsTextFieldKeyReleased(evt);
                }
            });

            plab1.setForeground(new java.awt.Color(255, 0, 51));

            BloodgroupTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "O-", "O+", "AB-", "AB+", " " }));

            streetTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    streetTextFieldKeyReleased(evt);
                }
            });

            jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel10.setText("House No:");


            cityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    cityTextFieldKeyReleased(evt);
                }
            });

            lastnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    lastnameTextFieldActionPerformed(evt);
                }
            });



            jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel11.setText("Email:");

            jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel17.setText("Country: ");

            countryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    countryTextFieldKeyReleased(evt);
                }
            });

            postalcodeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    postalcodeTextFieldKeyReleased(evt);
                }
            });

            jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel18.setText("City:");

            emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    emailTextFieldKeyReleased(evt);
                }
            });
            doctorAssignedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    doctorAssignedTextFieldKeyReleased(evt);
                }
            });

            jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel20.setText("Postalcode:");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(jLabel6))
                                                                                    .addGap(28, 28, 28)
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                                                            .addComponent(symptomsTextField)))
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(jLabel14)
                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                    .addComponent(doctorAssignedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                    .addGap(30, 30, 30)
                                                                                                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                    .addGap(33, 33, 33)
                                                                                                                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(18, 18, 18)
                                                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel13)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(lastnameTextField)
                                                                            .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(nurseAssignedTextField)
                                                                            .addComponent(BloodgroupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel9)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                    .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addGap(6, 6, 6)
                                                                                                    .addComponent(jLabel18)
                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(jLabel11)
                                                                                                    .addGap(8, 8, 8)))
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                    .addGap(10, 10, 10)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel10)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(houseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel17)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(jLabel20)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(postalcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(35, 35, 35))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(27, 27, 27)
                                                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(plab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)
                                    .addComponent(plab1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(symptomsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(BloodgroupTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel1)
                                                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15))
                                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(nurseAssignedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(doctorAssignedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(houseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(postalcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton1)
                                            .addComponent(jButton2))
                                    .addGap(22, 22, 22))
            );

            jPanel4.setBackground(new java.awt.Color(216, 181, 224));
            jPanel4.setPreferredSize(new java.awt.Dimension(1920, 48));

            jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel19.setText("Register Patients");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGap(359, 359, 359)
                                                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(0, 749, Short.MAX_VALUE))
                                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1926, Short.MAX_VALUE))
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(303, Short.MAX_VALUE))
            );

            pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JOptionPane.showMessageDialog(this, "Register Button pressed");
        String titleVal = title.getSelectedItem().toString();
        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String symptoms = symptomsTextField.getText();
        String bloodgroup = BloodgroupTextField.getSelectedItem().toString();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String dateOfBirth = formatter.format(dateTextField.getDate());

        String phoneNumber = phoneTextField.getText();
        String assignedDoctor = doctorAssignedTextField.getText();
        String assignedNurse = nurseAssignedTextField.getText();
        String streetname = streetTextField.getText();
        int houseNumber = Integer.parseInt(houseNoTextField.getText().toString());
        String city = cityTextField.getText();
        String country = countryTextField.getText();
        String email = emailTextField.getText();
        int postalcode = Integer.parseInt(postalcodeTextField.getText().toString());

        Patient patient = new Patient(firstname, lastname, titleVal, phoneNumber, bloodgroup, assignedDoctor,
                assignedNurse, symptoms, country, dateOfBirth, email, houseNumber, postalcode, streetname, city);
        createNewPatient(patient);
        System.out.println(patient.toString());

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        clearFields();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        StaffHome staffHome = new StaffHome();
        staffHome.toFront();
        staffHome.setVisible(true);
        staffHome.setLocationRelativeTo(null);
        staffHome.setState(java.awt.Frame.NORMAL);
    }

    private void firstnameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(firstnameTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z");
        }else{
            plab1.setText(null);
        }
    }

    private void lastnameTextFieldActionPerformed(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(lastnameTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z");
        }else{
            plab1.setText(null);
        }
    }

    private void phoneTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[0-9]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(phoneTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only 0-9");
        }else{
            plab1.setText(null);
        }
    }

    private void doctorAssignedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z. ]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(doctorAssignedTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z");
        }else{
            plab1.setText(null);
        }
    }

    private void nurseAssignedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z. ]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(nurseAssignedTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z");
        }else{
            plab1.setText(null);
        }
    }

    private void symptomsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(symptomsTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z");
        }else{
            plab1.setText(null);
        }
    }

private void streetTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
    String PATTERN="^[a-zA-Z]{0,30}$";
    Pattern patt= Pattern.compile(PATTERN);
    Matcher match=patt.matcher(streetTextField.getText());
    if(!(match.matches())){
        plab1.setText("Invalid characters. Use only a-z, A-Z for Street names");
    }else{
        plab1.setText(null);
    }
}

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        boolean emailIsValid = EmailValidator.getInstance()
                .isValid(emailTextField.getText());
        if(!emailIsValid){
            plab1.setText("Invalid characters. Email incorrect");
        }
    }

    private void postalcodeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[0-9]{0,6}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(postalcodeTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only 0-9 for postalcodes");
        }else{
            plab1.setText(null);
        }
    }
    private void cityTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(cityTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z for City names");
        }else{
            plab1.setText(null);
        }
    }

    private void countryTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(countryTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-Z for Countries");
        }else{
            plab1.setText(null);
        }

    }

    private void houseNoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[0-9]{1,5}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(houseNoTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only 0-9 for house numbers");
        }else{
            plab1.setText(null);
        }

    }
// TODO add insurance and payment
    /**
     * Ceate new patient in DB
     * @author Andreas Lakus
     * @param patient
     * @return
     */

    private boolean createNewPatient(Patient patient){
        PatientDAOImpl patientDAO = new PatientDAOImpl();
        boolean success = true;
        try {
            patientDAO.insert(patient);
        } catch (SQLException e) {
            success = false;
            throw new RuntimeException(e);
        }
        return success;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Staff_Patient_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Staff_Patient_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Staff_Patient_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Staff_Patient_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JComboBox<String> BloodgroupTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField countryTextField;
    private com.toedter.calendar.JDateChooser dateTextField;
    private javax.swing.JTextField doctorAssignedTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JTextField houseNoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField nurseAssignedTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel plab1;
    private javax.swing.JTextField symptomsTextField;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JTextField postalcodeTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel18;

//    private ComboBoxModel dropDown;
    // End of variables declaration                   
}
