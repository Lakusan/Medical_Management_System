package de.srh.view.staff;

import com.toedter.calendar.JDateChooser;
import de.srh.dao.impl.PatientDAOImpl;
import de.srh.model.Patient;
import org.apache.commons.validator.routines.EmailValidator;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
            insuranceTypeTextField.setText(null);
            insuranceNumberTextField.setText(null);
            paymenmtTypeTextField.setText(null);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            AppIcon = new JLabel();
            Appname1 = new JLabel();
            jSeparator1 = new JSeparator();
            jPanel1 = new JPanel();
            jLabel3 = new JLabel();
            jLabel6 = new JLabel();
            jLabel8 = new JLabel();
            firstnameTextField = new JTextField();
            jLabel5 = new JLabel();
            jLabel7 = new JLabel();
            lastnameTextField = new JTextField();
            jButton1 = new JButton();
            jButton2 = new JButton();
            jButton3 = new JButton();
            jLabel1 = new JLabel();
            phoneTextField = new JTextField();
            houseNoTextField = new JTextField();
            jLabel4 = new JLabel();
            nurseAssignedTextField = new JTextField();
            jLabel9 = new JLabel();
            jLabel12 = new JLabel();
            jLabel13 = new JLabel();
            jLabel14 = new JLabel();
            jLabel15 = new JLabel();
            title = new JComboBox<>();
            jLabel16 = new JLabel();
            symptomsTextField = new JTextField();
            dateTextField = new JDateChooser();
            plab1 = new JLabel();
            BloodgroupTextField = new JComboBox<>();
            streetTextField = new JTextField();
            jLabel10 = new JLabel();
            doctorAssignedTextField = new JTextField();
            cityTextField = new JTextField();
            jLabel11 = new JLabel();
            jLabel17 = new JLabel();
            countryTextField = new JTextField();
            postalcodeTextField = new JTextField();
            jLabel18 = new JLabel();
            insuranceTypeTextField = new JTextField();
            jLabel20 = new JLabel();
            emailTextField = new JTextField();
            insuranceNumberTextField = new JTextField();
            jLabel21 = new JLabel();
            paymenmtTypeTextField = new JTextField();
            jLabel22 = new JLabel();
            jLabel23 = new JLabel();
            jPanel4 = new JPanel();
            jLabel19 = new JLabel();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            AppIcon.setText("jLabel4");
            AppIcon.setIcon(new javax.swing.ImageIcon("src/main/resources/icon.png"));

            AppIcon.setPreferredSize(new Dimension(40, 40));

            Appname1.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            Appname1.setForeground(new Color(102, 0, 102));
            Appname1.setHorizontalAlignment(SwingConstants.CENTER);
            Appname1.setText("MediCare Hospital");
            Appname1.setVerticalAlignment(SwingConstants.TOP);

            jPanel1.setBackground(new Color(216, 181, 224));

            jLabel3.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel3.setText("First Name:");

            jLabel6.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel6.setText("Symptoms:");

            jLabel8.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel8.setText("Date of birth:");


            firstnameTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    firstnameTextFieldKeyReleased(evt);
                }
            });

            jLabel5.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel5.setText("Last Name:");

            jLabel7.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel7.setText("Blood Group:");


            lastnameTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    lastnameTextFieldKeyReleased(evt);
                }
            });

            jButton1.setText("Register");
            jButton1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("Clear Form");
            jButton2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("Homepage");
            jButton3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jLabel1.setFont(new Font("Segoe UI", 1, 14)); // NOI18N

            phoneTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    phoneTextFieldKeyReleased(evt);
                }
            });

            houseNoTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    houseNoTextFieldKeyReleased(evt);
                }
            });

            jLabel4.setFont(new Font("Segoe UI", 1, 14)); // NOI18N

            nurseAssignedTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    nurseAssignedTextFieldKeyReleased(evt);
                }
            });

            jLabel9.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel9.setText("Street:");

            jLabel12.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
            jLabel12.setText("Patient's Registration form");

            jLabel13.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel13.setText("Nurse Assigned:");

            jLabel14.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel14.setText("Doctor Assigned:");

            jLabel15.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel15.setText("Phone number:");

            title.setModel(new DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Ms" }));

            jLabel16.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel16.setText("Title:");

            plab1.setForeground(new Color(255, 0, 51));

            BloodgroupTextField.setModel(new DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "O-", "O+", "AB-", "AB+", " " }));

            streetTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    streetTextFieldKeyReleased(evt);
                }
            });

            jLabel10.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel10.setText("House No:");

            doctorAssignedTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    doctorAssignedTextFieldKeyReleased(evt);
                }
            });


            cityTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    cityTextFieldKeyReleased(evt);
                }
            });

            jLabel11.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel11.setText("Email:");

            jLabel17.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel17.setText("Country: ");

            countryTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    countryTextFieldKeyReleased(evt);
                }
            });


            postalcodeTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    postalcodeTextFieldKeyReleased(evt);
                }
            });

            jLabel18.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel18.setText("City:");

            jLabel20.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel20.setText("Postalcode:");

            emailTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    emailTextFieldKeyReleased(evt);
                }
            });


            insuranceNumberTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    insuranceNumberTextFieldKeyReleased(evt);
                }
            });

            jLabel21.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel21.setText("Insurance Num.:");


            paymenmtTypeTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    paymenmtTypeTextFieldKeyReleased(evt);
                }
            });

            insuranceTypeTextField.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent evt) {
                    insuranceTypeTextFieldKeyReleased(evt);
                }
            });


            jLabel22.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel22.setText("Insurance Type.:");

            jLabel23.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
            jLabel23.setText("Payment Method:");

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(jLabel6))
                                                                                    .addGap(28, 28, 28)
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(dateTextField, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                                                                                    .addGap(0, 180, Short.MAX_VALUE))
                                                                                            .addComponent(symptomsTextField)))
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                    .addGap(30, 30, 30)
                                                                                                                    .addComponent(title, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
                                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                    .addGap(33, 33, 33)
                                                                                                                    .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))))
                                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(jLabel14)
                                                                                                            .addComponent(jLabel9)
                                                                                                            .addComponent(jLabel10)
                                                                                                            .addComponent(jLabel18)
                                                                                                            .addComponent(jLabel11)
                                                                                                            .addComponent(jLabel17)
                                                                                                            .addComponent(jLabel20))
                                                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(streetTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(doctorAssignedTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(houseNoTextField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(cityTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(countryTextField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                                                                            .addComponent(postalcodeTextField, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))))
                                                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                                                                            .addGap(18, 18, 18)
                                                                                            .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                            .addComponent(jLabel13)
                                                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                            .addComponent(jLabel21)
                                                                            .addComponent(jLabel22)
                                                                            .addComponent(jLabel23))
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addComponent(insuranceNumberTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                    .addComponent(lastnameTextField)
                                                                                    .addComponent(phoneTextField, GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(nurseAssignedTextField)
                                                                                    .addComponent(BloodgroupTextField, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(insuranceTypeTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(paymenmtTypeTextField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(27, 27, 27)
                                                                                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(plab1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 728, GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(31, 31, 31))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)
                                    .addComponent(plab1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(symptomsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(BloodgroupTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel1)
                                                    .addComponent(phoneTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15))
                                            .addComponent(dateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(nurseAssignedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(doctorAssignedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(streetTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(houseNoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(insuranceNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel21)))
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel18)
                                                            .addComponent(cityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(postalcodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel20))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(countryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel17))
                                                    .addGap(8, 8, 8)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel11)
                                                            .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(105, 105, 105))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(insuranceTypeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel22))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(paymenmtTypeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel23))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jButton1)
                                                            .addComponent(jButton2))
                                                    .addGap(22, 22, 22))))
            );

            jPanel4.setBackground(new Color(216, 181, 224));
            jPanel4.setPreferredSize(new Dimension(1920, 48));

            jLabel19.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            jLabel19.setText("Register Patients");

            GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addContainerGap()
                                                                    .addComponent(AppIcon, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(Appname1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGap(359, 359, 359)
                                                                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(0, 569, Short.MAX_VALUE))
                                            .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1926, Short.MAX_VALUE))
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(AppIcon, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Appname1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81)
                                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(194, Short.MAX_VALUE))
            );


            pack();
    }// </editor-fold>



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String titleVal = title.getSelectedItem().toString();
        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String symptoms = symptomsTextField.getText();
        String bloodgroup = BloodgroupTextField.getSelectedItem().toString();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String dateOfBirthVal = formatter.format(dateTextField.getDate()).toString();

        String phoneNumber = phoneTextField.getText();
        String assignedDoctor = doctorAssignedTextField.getText();
        String assignedNurse = nurseAssignedTextField.getText();
        String streetname = streetTextField.getText();
        int houseNumber = Integer.parseInt(houseNoTextField.getText().toString());
        String city = cityTextField.getText();
        String country = countryTextField.getText();
        String email = emailTextField.getText();
        int postalcode = Integer.parseInt(postalcodeTextField.getText().toString());
        int insuranceNumber = Integer.parseInt(insuranceNumberTextField.getText().toString());
        String insuranceType = insuranceTypeTextField.getText();
        String paymentMethod = paymenmtTypeTextField.getText();

        Patient patient = new Patient(firstname, lastname, titleVal, phoneNumber, bloodgroup, assignedDoctor,
                assignedNurse, symptoms, country, dateOfBirthVal, email, houseNumber, postalcode, streetname, city,
                insuranceNumber, insuranceType, paymentMethod);
        if (createNewPatient(patient)){
            javax.swing.JOptionPane.showMessageDialog(this, "Patient registered");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error while creating new Patient - check form");
        }
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

    private void lastnameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
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
        } else {
            plab1.setText("");

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

    private void insuranceNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[0-9]{1,10}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(insuranceNumberTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only 0-9 for Insurance numbers");
        }else{
            plab1.setText(null);
        }

    }

    private void insuranceTypeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{1,10}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(insuranceTypeTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-z for Insurance types");
        }else{
            plab1.setText(null);
        }

    }

    private void paymenmtTypeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{1,10}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(paymenmtTypeTextField.getText());
        if(!(match.matches())){
            plab1.setText("Invalid characters. Use only a-z, A-z for Payment types");
        }else{
            plab1.setText(null);
        }

    }

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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JTextField insuranceTypeTextField;
    private javax.swing.JTextField insuranceNumberTextField;
    private javax.swing.JTextField paymenmtTypeTextField;

//    private ComboBoxModel dropDown;
    // End of variables declaration                   
}
