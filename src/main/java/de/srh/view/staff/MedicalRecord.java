package de.srh.view.staff;

import de.srh.dao.impl.AppointmentDAOImpl;
import de.srh.dao.impl.PatientDAOImpl;
import de.srh.model.Appointment;
import de.srh.model.Patient;
import de.srh.view.RegistrationForm;
import de.srh.view.staff.StaffHome;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author shiva
 */
public class MedicalRecord extends javax.swing.JFrame {

    public MedicalRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        AppIcon = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submitRecordButton1 = new javax.swing.JButton();
        recordTextField1 = new javax.swing.JTextField();
        recordTextField2 = new javax.swing.JTextField();
        findRecordButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AppIcon.setText("jLabel4");
        AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

        Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(102, 0, 102));
        Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appname1.setText("MediCare Hospital");
        Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(216, 181, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter Message here:");

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "PatienId", "Firstname", "Lastname", "Symptoms", "Date", "Time"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        submitRecordButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitRecordButton1.setText("Submit Record");
        submitRecordButton1.setActionCommand("submitRecord");
        submitRecordButton1.setAutoscrolls(true);

        findRecordButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findRecordButton.setText("Find Record");
        findRecordButton.setActionCommand("submitRecord");
        findRecordButton.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Last Record");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel1)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(findRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(recordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(submitRecordButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(179, Short.MAX_VALUE)
                                        .addComponent(recordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)
                                .addComponent(submitRecordButton1)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(recordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findRecordButton)
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(recordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(570, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(216, 181, 224));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Medical Record");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1519, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
        );

        jButton2.setText("Homepage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        submitRecordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRecordButtonActionPerformed(evt);
            }
        });
        findRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRecordButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(414, 414, 414)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(7, 7, 7)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(231, Short.MAX_VALUE))
        );

        try {
            populateTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(MedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalRecord().setVisible(true);
            }
        });
    }

    public void populateTable() throws SQLException {
        AppointmentDAOImpl appointmentDAO = new AppointmentDAOImpl();
        List<Appointment> allAppointments = appointmentDAO.getAllAppointmentsWithPatientInfos();
        for (int i = 0 ; i < allAppointments.size() ; i++){
            jTable1.getModel().setValueAt(allAppointments.get(i).getPatientID(), i, 0);
            jTable1.getModel().setValueAt(allAppointments.get(i).getFirstname(), i,1);
            jTable1.getModel().setValueAt(allAppointments.get(i).getLastname(), i,2);
            jTable1.getModel().setValueAt(allAppointments.get(i).getDiagnosis(), i,3);
            jTable1.getModel().setValueAt(allAppointments.get(i).getDate(), i,4);
            jTable1.getModel().setValueAt(allAppointments.get(i).getTime(), i,5);
        }
    }

    /**
     * @author Andreas Lakus
     * @return
     */
    public Patient getSelectedPatientsAppointment()throws NullPointerException{
        int getSelectedRow = jTable1.getSelectedRow();
        int patientID = Integer.parseInt(jTable1.getValueAt(getSelectedRow,0).toString());
        String recordData = recordTextField1.getText();
        Patient patient = new Patient(patientID, recordData);
        return patient;
    }
    /**
     * @author Andreas Lakus
     * @return
     */
    void createRecord(Patient patient) throws SQLException{
        PatientDAOImpl patientDAO = new PatientDAOImpl();
        patientDAO.addRecordToPatient(patient);
    }
    /**
     * @author Andreas Lakus
     * @return
     */
    private void submitRecordButtonActionPerformed(java.awt.event.ActionEvent evt){
        Patient patient = getSelectedPatientsAppointment();
        try {
            createRecord(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Record Created");
    }
    /**
     * @author Andreas Lakus
     * @return
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        StaffHome staffHome = new StaffHome();
        staffHome.toFront();
        staffHome.setVisible(true);
        staffHome.setLocationRelativeTo(null);
        staffHome.setState(java.awt.Frame.NORMAL);
    }
    /**
     * @author Andreas Lakus
     * @return
     */
    private void findRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {
        PatientDAOImpl patientDAO = new PatientDAOImpl();
        Patient patient = getSelectedPatientsAppointment();
        Patient patientWithRecordData = null;
        try {
            patientWithRecordData = patientDAO.getPatientRecord(patient);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        recordTextField2.setText(patientWithRecordData.getRecordData());
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JButton findRecordButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField recordTextField1;
    private javax.swing.JTextField recordTextField2;
    private javax.swing.JButton submitRecordButton1;
    // End of variables declaration
}
