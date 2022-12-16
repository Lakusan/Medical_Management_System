package de.srh.view;

import de.srh.dao.impl.UserDAOImpl;
import de.srh.model.User;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shiva
 */
public class AdminEmployeeManage extends JFrame {

    public AdminEmployeeManage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        AppIcon = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        String [] columnNames = new String [] {
                "User id", "Firstname", "Lastname", "Username",
                "Department", "Specialization", "Role", "Phone number",
                "email", "Address", "Street" , "House Num",
                "Country"
        };
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AppIcon.setIcon(new javax.swing.ImageIcon("D:\\Medical management system\\icon.png")); // NOI18N
        AppIcon.setText("jLabel4");
        AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

        Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(102, 0, 102));
        Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appname1.setText("MediCare Hospital");
        Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                columnNames

        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                    java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            boolean[] canEdit = new boolean [] {
                    false, true, true, true,
                    true, true, true, true,
                    true, true, true, true,
                    true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.setBackground(new java.awt.Color(216, 181, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Manage Employee- Update or Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1513, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Search Here");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Homepage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(56, 56, 56)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jButton2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(81, 81, 81)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1407, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(141, Short.MAX_VALUE))
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
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(280, Short.MAX_VALUE))
        );
        try {
            populateTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

        String searchTerm = jTextField1.getText().toString();
        String regexInt = "[0-9]+";
        String regexString = "[a-zA-Z]+";
        // if searchTerm is int look for user-ID
        if (searchTerm.matches(regexInt)) {
            System.out.println("search by ID");
            // if searchTerm is string try to find username
        } else if (searchTerm.matches(regexString)){
            System.out.println("search by username");
            // find user by id
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Search for username or user ID");
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Update selected User(s)", "Update Confirmation", dialogButton);
        if(dialogResult == 0) {
            System.out.println("Yes option");
            getSelectedUsers();
            // Update users
        } else {
            System.out.println("No Option");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete selected User(s)", "Delete Confirmation", dialogButton);
        if(dialogResult == 0) {
            System.out.println("Yes option");
            getSelectedUsers();
        } else {
            System.out.println("No Option");
        }
        // get selected Rows
        // ask if admin is shure
        // then delete user
        // feedback
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        AdminHome adminHome = new AdminHome();
        adminHome.toFront();
        adminHome.setVisible(true);
        adminHome.setLocationRelativeTo(null);
        adminHome.setState(java.awt.Frame.NORMAL);
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
            java.util.logging.Logger.getLogger(AdminEmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEmployeeManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AdminEmployeeManage().setVisible(true);
            }
        });
    }

    /**
     * @author Andreas Lakus
     * @param
     * @throws SQLException
     */
    public void populateTable() throws SQLException {
        UserDAOImpl userDAO = new UserDAOImpl();
        List<User> allUsers = userDAO.getAllManagedUsers();
        for (int i = 0 ; i < allUsers.size() ; i++){
            jTable1.getModel().setValueAt(allUsers.get(i).getId(), i, 0);
            jTable1.getModel().setValueAt(allUsers.get(i).getFirstname(), i,1);
            jTable1.getModel().setValueAt(allUsers.get(i).getLastname(), i,2);
            jTable1.getModel().setValueAt(allUsers.get(i).getUsername(), i,3);
            jTable1.getModel().setValueAt("Department", i,4);
            jTable1.getModel().setValueAt("Specialization", i,5);
            jTable1.getModel().setValueAt(allUsers.get(i).getRole(), i,6);
            jTable1.getModel().setValueAt(allUsers.get(i).getPhoneNum(), i,7);
            jTable1.getModel().setValueAt(allUsers.get(i).getEmail(), i,8);
            jTable1.getModel().setValueAt("address", i,9);
            jTable1.getModel().setValueAt("street", i,10);
            jTable1.getModel().setValueAt(8, i,11);
            jTable1.getModel().setValueAt("Country", i,12);
        }
    }

    /**
     * gets all selected users from table as list of Users
     * @author Andreas Lakus
     * @return List<User>
     */
    public List<User> getSelectedUsers(){
        int[] selectedRows = jTable1.getSelectedRows();
        List<User> selectedUsers = new ArrayList<>();
        for ( int i = 0 ; i < selectedRows.length; i++) {
            int userid =  Integer.parseInt(jTable1.getValueAt(selectedRows[i], 0).toString());
            String firstname = jTable1.getValueAt(selectedRows[i], 1).toString();
            String lastname = jTable1.getValueAt(selectedRows[i], 2).toString();
            String username = jTable1.getValueAt(selectedRows[i], 3).toString();
            String department = jTable1.getValueAt(selectedRows[i], 4).toString();
            String specialization = jTable1.getValueAt(selectedRows[i], 5).toString();
            String role = jTable1.getValueAt(selectedRows[i], 6).toString();
            String phoneNum = jTable1.getValueAt(selectedRows[i], 7).toString();
            String email = jTable1.getValueAt(selectedRows[i], 8).toString();
            String address = jTable1.getValueAt(selectedRows[i], 9).toString();
            String street = jTable1.getValueAt(selectedRows[i], 10).toString();
            int houseNo =  Integer.parseInt(jTable1.getValueAt(selectedRows[i], 11).toString());
            String country = jTable1.getValueAt(selectedRows[i], 11).toString();
            selectedUsers.add(new User ( username, userid, firstname,  lastname,  email, role));
        }
        System.out.println("selected users: " + selectedUsers.toString());
        return selectedUsers;
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}