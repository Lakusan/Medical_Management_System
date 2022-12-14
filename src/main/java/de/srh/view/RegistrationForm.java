package de.srh.view;

import de.srh.dao.impl.UserDAOImpl;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;
import org.apache.commons.validator.routines.EmailValidator;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author shiva
 */
public class RegistrationForm extends JFrame {

    public static RegistrationForm registrationForm = null;
    /**
     * Creates new form Registration
     */
    public RegistrationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        Register_heading = new javax.swing.JLabel();
        Title_heading = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Full_name_heading = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        Username_heading2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        Full_name_heading1 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        Contact_heading = new javax.swing.JLabel();
        Officialemail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        con = new javax.swing.JTextField();
        streetnameText = new javax.swing.JLabel();
        streetnameField = new javax.swing.JTextField();
        Password_Heading2 = new javax.swing.JLabel();
        plab = new javax.swing.JPasswordField();
        Repeat_password = new javax.swing.JLabel();
        plab2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        plab1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        lname1 = new javax.swing.JLabel();
        uname1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        con1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        HouseNoText = new javax.swing.JLabel();
        houseNoField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        countryText = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        cityText = new javax.swing.JLabel();
        postalcodeField = new javax.swing.JTextField();
        postalcodeText = new javax.swing.JLabel();
        AppIcon = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(216, 181, 224));

        Register_heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Register_heading.setText("Register");

        Title_heading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Title_heading.setText("Title:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Ms." }));

        Full_name_heading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Full_name_heading.setText("First name:");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });

        Username_heading2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Username_heading2.setText("Lastname:");

        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });

        Full_name_heading1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Full_name_heading1.setText("Username:");

        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });

        Contact_heading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Contact_heading.setText("Phone number");

        Officialemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Officialemail.setText("Official Email-Id:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conKeyReleased(evt);
            }
        });

        streetnameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        streetnameText.setText("Streetname:");

        streetnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetnameFieldActionPerformed(evt);
            }
        });
        streetnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                streetnameFieldKeyReleased(evt);
            }
        });

        Password_Heading2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password_Heading2.setText("Password:");

        plab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plabKeyReleased(evt);
            }
        });

        Repeat_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Repeat_password.setText("Repeat Password:");

        plab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plab2ActionPerformed(evt);
            }
        });
        plab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plab2KeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Homepage");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signupKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                signupKeyReleased(evt);
            }
        });

        jButton3.setText("Already have an account?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        plab1.setForeground(new java.awt.Color(255, 0, 51));
        plab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plab1KeyReleased(evt);
            }
        });

        email1.setForeground(new java.awt.Color(255, 0, 51));

        lname1.setForeground(new java.awt.Color(255, 0, 0));

        uname1.setForeground(new java.awt.Color(255, 0, 51));

        fname1.setForeground(new java.awt.Color(255, 0, 51));

        con1.setForeground(new java.awt.Color(255, 0, 51));

        id1.setForeground(new java.awt.Color(255, 0, 51));

        HouseNoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HouseNoText.setText("House No.:");

        houseNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNoFieldActionPerformed(evt);
            }
        });
        houseNoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                houseNoFieldKeyReleased(evt);
            }
        });

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cityFieldKeyReleased(evt);
            }
        });

        countryText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        countryText.setText("Country:");

        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });
        countryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                countryFieldKeyReleased(evt);
            }
        });

        cityText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cityText.setText("City:");

        postalcodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalcodeFieldActionPerformed(evt);
            }
        });
        postalcodeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postalcodeFieldKeyReleased(evt);
            }
        });

        postalcodeText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        postalcodeText.setText("Postalcode:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(signup)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(Register_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(plab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(Officialemail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(Password_Heading2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Title_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Username_heading2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                                        .addComponent(streetnameText)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(streetnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(HouseNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(houseNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGap(40, 40, 40)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(Contact_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(con1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(Full_name_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                                                                                .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                                        .addComponent(Full_name_heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(uname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addComponent(uname, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(con, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Repeat_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(plab2, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(countryText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(postalcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(postalcodeText)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(Register_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Title_heading)
                                        .addComponent(Full_name_heading)
                                        .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lname1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Username_heading2)
                                                .addComponent(Full_name_heading1))
                                        .addComponent(uname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(email1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(con1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Officialemail)
                                                .addComponent(Contact_heading)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(streetnameText)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(HouseNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(countryText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cityText)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(streetnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(houseNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postalcodeText)
                                .addGap(1, 1, 1)
                                .addComponent(postalcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Password_Heading2)
                                        .addComponent(Repeat_password))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(plab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plab1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(signup)
                                        .addComponent(jButton3))
                                .addContainerGap(113, Short.MAX_VALUE))
        );

        AppIcon.setText("jLabel4");
        AppIcon.setIcon(new javax.swing.ImageIcon("src/main/resources/icon.png"));

        AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

        Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(102, 0, 102));
        Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appname1.setText("MediCare Hospital");
        Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1901, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(453, 453, 453)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(307, Short.MAX_VALUE))
        );


        pack();

    }// </editor-fold>

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * gets form data
     * @author Andreas Lakus
     * @param evt
     */
    private void signupActionPerformed(java.awt.event.ActionEvent evt) {
        String title = jComboBox1.getSelectedItem().toString();
        String f_name= fname.getText();
        String l_name= lname.getText();
        String u_name= uname.getText();
        String email_id= email.getText();
        String cont= con.getText();
        String Pwd=plab.getText();
        String Pwd1=plab2.getText();
        int postalcode = Integer.parseInt(postalcodeField.getText().toString());
        String streetname = streetnameField.getText();
        String city = cityField.getText();
        String country = countryField.getText();
        int houseNum = Integer.parseInt(houseNoField.getText().toString());

        HashMap<String, String> formChecks = new HashMap<String, String>();
        formChecks.put("formIsComplete", "false");
        formChecks.put("usernameIsCorrect", "true");
        formChecks.put("firstnameIsCorrect", "true");
        formChecks.put("lastnameIsCorrect", "true");
        formChecks.put("phoneNumberIsCorrect", "true");
        formChecks.put("identificationNumberIsCorrect", "true");
        formChecks.put("passwordIsCorrect", "true");
        formChecks.put("formIsCorrect", "true");
        formChecks.put("emailIsCorrect", "true");

        LoginForm loginForm = new LoginForm();

        if((f_name.equals(""))
                && (l_name.equals(""))
                && (u_name.equals(""))
                && (email_id.equals(""))
                && (cont.equals(""))
                && (Pwd.equals(""))
                && (Pwd1.equals(""))) {
            javax.swing.JOptionPane.showMessageDialog(null, "Fields can't be empty");
            formChecks.replace("formIsComplete", "true", "false");
        }

            if(f_name.equals("")
                    && (!l_name.equals(""))
                    && (!u_name.equals(""))
                    && (!email_id.equals(""))
                    && (!cont.equals(""))
                    && (!Pwd.equals(""))
                    && (!Pwd1.equals("")))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Firstname can't be empty");
                formChecks.replace("firstnameIsCorrect", "true", "false");

            }

            if(l_name.equals("")
                    && (!f_name.equals(""))
                    && (!u_name.equals(""))
                    && (!email_id.equals(""))
                    && (!cont.equals(""))
                    && (!Pwd.equals(""))
                    && (!Pwd1.equals("")))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Lastname can't be empty");
                formChecks.replace("lastnameIsCorrect", "true", "false");
            }

            if(u_name.equals("")
                    && (!l_name.equals(""))
                    && (!f_name.equals(""))
                    && (!email_id.equals(""))
                    && (!cont.equals(""))
                    && (!Pwd.equals(""))
                    && (!Pwd1.equals("")))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Username can't be empty");
                formChecks.replace("usernameIsCorrect", "true", "false");

            }

            if(email_id.equals("")
                    && (!f_name.equals(""))
                    && (!l_name.equals(""))
                    && (!u_name.equals(""))
                    && (!cont.equals(""))
                    && (!Pwd.equals(""))
                    && (!Pwd1.equals("")))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Email can't be empty");
                formChecks.replace("emailIsCorrect", "true", "false");
            }

            if(cont.equals("")
                    && (!f_name.equals(""))
                    && (!l_name.equals(""))
                    && (!u_name.equals(""))
                    && (!email_id.equals(""))
                    && (!Pwd.equals(""))
                    && (!Pwd1.equals("")))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Phonenumber can't be empty");
                formChecks.replace("phoneNumberIsCorrect", "true", "false");
            }


        if(Pwd.equals("") || (Pwd1.equals(""))
                    && (!f_name.equals(""))
                    && (!l_name.equals(""))
                    && (!u_name.equals(""))
                    && (!email_id.equals(""))
                    && (!cont.equals(""))
                    && (!Pwd.equals("")))
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Password can't be emtpy");
            formChecks.replace("passwordIsCorrect", "true", "false");
        }

        if(!Pwd.equals("") && !(Pwd1.equals(""))
                && (!f_name.equals(""))
                && (!l_name.equals(""))
                && (!u_name.equals(""))
                && (!email_id.equals(""))
                && (!cont.equals(""))
                && (!Pwd.equals(""))) {

            formChecks.replace("formIsComplete", "false", "true");
            boolean registrationSuccess = false;
          if (!formChecks.containsValue("false")) {
              registrationSuccess = submitRegistration(title, f_name, l_name, u_name, email_id, cont, Pwd1, streetname, country, city,houseNum, postalcode);
          }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
        loginForm.toFront();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        setVisible(false);
        Homepage homepage = new Homepage();
        homepage.toFront();
        homepage.setVisible(true);
        homepage.setLocationRelativeTo(null);
        homepage.setState(java.awt.Frame.NORMAL);
    }

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(fname.getText());
        if(!(match.matches())){
            fname1.setText("Incorrect name");
        }else{
            fname1.setText(null);
        }

    }

    private void plabKeyReleased(java.awt.event.KeyEvent evt) {
        // 8-20 chars, one digit, one upper case letter, one lower case letter, one special char !@#$%&*()-+=^, no white space
        ValidationService validationService = new ValidationService();
        boolean passwordIsValid = validationService.validatePassword(plab.getText());
        if(!passwordIsValid){
            plab1.setText("Invalid characters.Use a strong password with at least 8 characters: a-z,A-Z,0-9, !@#$%&*()-+=^");
        }else{
            plab1.setText("Password is valid");
        }
    }

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {
        boolean emailIsValid = EmailValidator.getInstance()
                .isValid(email.getText());
        if(!emailIsValid){
            email1.setText("Email Incorrect");
        }else{
            email1.setText(null);
        }
    }

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(lname.getText());
        if(!(match.matches())){
            lname1.setText("Incorrect name");
        }else{
            lname1.setText(null);
        }
    }

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[a-zA-Z0-9]{0,30}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(uname.getText());
        if(!(match.matches())){
            uname1.setText("Incorrect Username");
        }else{
            uname1.setText(null);
        }
    }

    private void conKeyReleased(java.awt.event.KeyEvent evt) {
        String PATTERN="^[0-9]{0,12}$";
        Pattern patt= Pattern.compile(PATTERN);
        Matcher match=patt.matcher(con.getText());
        if(!(match.matches())){
            con1.setText("Incorrect phone Number");
        }else{
            con1.setText(null);
        }
    }

    private void signupKeyPressed(java.awt.event.KeyEvent evt) {
    }

    private void signupKeyReleased(java.awt.event.KeyEvent evt) {
    }

    private void plab2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void houseNoFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }


    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void houseNoFieldKeyReleased(java.awt.event.KeyEvent evt) {
    }
    private void streetnameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void streetnameFieldKeyReleased(java.awt.event.KeyEvent evt) {
    }
    private void cityFieldKeyReleased(java.awt.event.KeyEvent evt) {
    }
    private void plab1KeyReleased(java.awt.event.KeyEvent evt) {
    }
    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void countryFieldKeyReleased(java.awt.event.KeyEvent evt) {
    }
    private void postalcodeFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void postalcodeFieldKeyReleased(java.awt.event.KeyEvent evt) {
    }


    private void plab2KeyReleased(java.awt.event.KeyEvent evt) {
        String Pwd=plab.getText();
        String Pwd1=plab2.getText();

        if(Pwd.equals(Pwd1)){
            plab1.setText("Password Matches");
        }else{
            plab1.setText("Password does not match");
        }
    }

    private void IDKeyReleased(java.awt.event.KeyEvent evt) {


    }

    /**
     * Checks if email or username exists in DB
     * Creates User in DB
     * returns false if error
     * returns true and redirects to login if passed
     * @author Andreas Lakus
     * @param title
     * @param firstname
     * @param lastname
     * @param username
     * @param email
     * @param phoneNum
     * @param password
     * @return boolean
     */
    private boolean submitRegistration(String title,
                                       String firstname,
                                       String lastname,
                                       String username,
                                       String email,
                                       String phoneNum,
                                       String password,
                                       String streetname,
                                       String country,
                                       String city,
                                       int houseNum,
                                       int postalcode) {

        boolean passwordIsValid = checkPassword(password);
        boolean usernameIsValid = checkUsername(username);

        if (!usernameIsValid) {
            javax.swing.JOptionPane.showMessageDialog(this, "Username is invalid");
            return false;
        }

        UserDAOImpl userDAO = new UserDAOImpl();
        PasswordService passwordService = new PasswordService();
        User newUser = null;
        try {
            newUser = userDAO.findUserByUserName(username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (newUser != null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Username " + username + " is already existing!");
            uname.setText("");
            return false;
        } else {
            try {
                newUser = userDAO.findUserByEMail(email);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if (newUser != null) {
                javax.swing.JOptionPane.showMessageDialog(null, "Email " + email + " is already existing!");
                email1.setText("");
                return false;
            } else {
//                password = passwordService.hashPassword(password);
                newUser = new User(username,  firstname,  lastname,  email,  password,  phoneNum,  title,  streetname,  city,  country,  postalcode,  houseNum);
            }
        }
        if (createNewUser(newUser)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Registration Succeeded - An Admin will contact you to activate your Account");
            this.toBack();
            this.setVisible(false);
            LoginForm loginForm = new LoginForm();
            loginForm.toFront();
            loginForm.setVisible(true);
            loginForm.setLocationRelativeTo(null);
            loginForm.setState(java.awt.Frame.NORMAL);
            loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        return true;
    }

    /**
     * Username validataion
     * @author Andreas Lakus
     * @param username
     * @return
     */
    private boolean checkUsername(String username){
        ValidationService validationService = new ValidationService();
        return validationService.checkUsername(username);
    }

    /**
     * Password validation
     * @author Andreas Lakus
     * @param password
     * @return
     */
    private boolean checkPassword(String password){
        ValidationService validationService = new ValidationService();
        return validationService.validatePassword(password);
    }

    /**
     * Ceate new user in DB
     * @author Andreas Lakus
     * @param user
     * @return
     */

    private boolean createNewUser(User user){
        UserDAOImpl userDAO = new UserDAOImpl();
        boolean success = true;
        try {
            userDAO.insert(user);
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
        registrationForm = new RegistrationForm();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registrationForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Contact_heading;
    private javax.swing.JLabel Full_name_heading;
    private javax.swing.JLabel Full_name_heading1;
    private javax.swing.JLabel HouseNoText;
    private javax.swing.JLabel Officialemail;
    private javax.swing.JLabel Password_Heading2;
    private javax.swing.JLabel Register_heading;
    private javax.swing.JLabel Repeat_password;
    private javax.swing.JLabel Title_heading;
    private javax.swing.JLabel Username_heading2;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityText;
    private javax.swing.JTextField con;
    private javax.swing.JLabel con1;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryText;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fname1;
    private javax.swing.JTextField houseNoField;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lname1;
    private javax.swing.JPasswordField plab;
    private javax.swing.JLabel plab1;
    private javax.swing.JPasswordField plab2;
    private javax.swing.JTextField postalcodeField;
    private javax.swing.JLabel postalcodeText;
    private javax.swing.JButton signup;
    private javax.swing.JTextField streetnameField;
    private javax.swing.JLabel streetnameText;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel uname1;
    // End of variables declaration
}

