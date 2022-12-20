package de.srh.view.staff;

import de.srh.dao.impl.AppointmentDAOImpl;
import de.srh.dao.impl.MedicationDAOImpl;
import de.srh.dao.impl.ProcedureDAOImpl;
import de.srh.model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shiva
 */
public class ManagePayments extends javax.swing.JFrame {

    public static String billSum = "";

    public ManagePayments() {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        sumTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        calculateButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AppIcon.setText("jLabel4");
        AppIcon.setIcon(new javax.swing.ImageIcon("src/main/resources/icon.png"));

        AppIcon.setPreferredSize(new java.awt.Dimension(40, 40));

        Appname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(102, 0, 102));
        Appname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Appname1.setText("MediCare Hospital");
        Appname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBackground(new java.awt.Color(216, 181, 224));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Manage Payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1528, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTable3.setBackground(new java.awt.Color(204, 204, 255));
        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Patient_id", "Firstname", "Lastname", "Appointment_id", "Date", "Time", "Symptoms", "active_Bill"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setColumnSelectionAllowed(true);
        jTable3.setShowGrid(false);
        jTable3.setShowHorizontalLines(true);
        jTable3.setShowVerticalLines(true);
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton3.setText("Homepage");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        calculateButton.setText("calcuilate price");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jTable4.setBackground(new java.awt.Color(204, 204, 255));
        jTable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false}
                },
                new String [] {
                        "Medication_id", "Medication_Name", "Price", "selected"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setShowGrid(false);
        jTable4.setShowHorizontalLines(true);
        jTable4.setShowVerticalLines(true);
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        sumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Sum");

        jTable5.setBackground(new java.awt.Color(204, 204, 255));
        jTable5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false},
                        {null, null, null, false}
                },
                new String [] {
                        "Procedure_id", "Procedure_name", "Price", "selected"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setShowGrid(false);
        jTable5.setShowHorizontalLines(true);
        jTable5.setShowVerticalLines(true);
        jScrollPane5.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        calculateButton1.setText("submit");
        calculateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButton1ActionPerformed(evt);
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
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Appname1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(1550, 1550, 1550)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(708, 708, 708)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(177, 177, 177)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(736, 736, 736)
                                .addComponent(calculateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(354, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(347, Short.MAX_VALUE)))
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
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton3)
                                .addGap(500, 500, 500)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculateButton)
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calculateButton1)
                                .addContainerGap(82, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(700, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(481, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(433, 433, 433)))
        );

        try {
            populateMedication();
            populateProcedure();
            populatePatient();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        pack();
    }// </editor-fold>

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.toBack();
        this.setVisible(false);
        StaffHome staffHome = new StaffHome();
        staffHome.toFront();
        staffHome.setVisible(true);
        staffHome.setLocationRelativeTo(null);
        staffHome.setState(java.awt.Frame.NORMAL);
    }

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        List<Medication> selectedMedications = getSelectedMedications();
        List<Procedure> selectedProcedures = getSelectedProcedures();
        List<Float> allPrices = new ArrayList<>();
        if (selectedMedications == null || selectedProcedures == null){
            javax.swing.JOptionPane.showMessageDialog(this, "No Prices selected - Pleas select Objects");
        } else {
            for ( int i = 0; i < selectedMedications.size(); i++){
                if (selectedMedications.size() > 0){
                    allPrices.add(selectedMedications.get(i).getPrice());
                }
            }
            for ( int j = 0; j < selectedProcedures.size(); j++){
                if (selectedProcedures.size() > 0) {
                    allPrices.add(selectedProcedures.get(j).getPrice());
                }
            }
        }
        sumTextField.setText(calcSum(allPrices));
    }


    private void sumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void calculateButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Appointment appointment = getSelectedPatientsAppointment();
        try {
            addBillToPatientsAppointment(appointment);
            javax.swing.JOptionPane.showMessageDialog(this, "Bill added to Appointment");
            populatePatient();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
            java.util.logging.Logger.getLogger(ManagePayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagePayments().setVisible(true);
            }
        });
    }

    /**
     * poulates table
     * @author Andreas Lakus
     */
    private void populateMedication() throws SQLException {
        MedicationDAOImpl medicationDAO = new MedicationDAOImpl();
        List<Medication> foundMedications = medicationDAO.getAll();
        for (int i = 0; i < foundMedications.size(); i++){
            jTable4.getModel().setValueAt(foundMedications.get(i).getMedicationId(), i, 0);
            jTable4.getModel().setValueAt(foundMedications.get(i).getMedicationName(), i, 1);
            jTable4.getModel().setValueAt(foundMedications.get(i).getPrice(), i, 2);
        }
    }

    /**
     * poulates table
     * @author Andreas Lakus
     */
    private void populateProcedure() throws SQLException{
        ProcedureDAOImpl procedureDAO = new ProcedureDAOImpl();
        List<Procedure> foundProcedures = procedureDAO.getAll();
        for (int i = 0; i < foundProcedures.size(); i++){
            jTable5.getModel().setValueAt(foundProcedures.get(i).getProcedureId(), i, 0);
            jTable5.getModel().setValueAt(foundProcedures.get(i).getProcedureName(), i, 1);
            jTable5.getModel().setValueAt(foundProcedures.get(i).getPrice(), i, 2);
        }
    }

    /**
     * poulates table
     * @author Andreas Lakus
     */
    private void populatePatient() throws SQLException{
        AppointmentDAOImpl appointmentDAOImpl = new AppointmentDAOImpl();
        List<Appointment> foundAppointments = appointmentDAOImpl.getAllAppointmentsWithPatientInfos();
        for (int i = 0; i < foundAppointments.size(); i++){
            jTable3.getModel().setValueAt(foundAppointments.get(i).getPatientID(), i, 0);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getFirstname(), i, 1);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getLastname(), i, 2);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getAppointmentID(), i, 3);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getDate(), i, 4);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getTime(), i, 5);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getDiagnosis(), i, 6);
            jTable3.getModel().setValueAt(foundAppointments.get(i).getPrice(), i, 7);
        }
    }

    /**
     * calculates Sum of float array
     * @author Andreas Lakus
     * @param prices
     * @return
     */
    private String calcSum(List<Float> prices){
        System.out.println("prices size" + prices.size());
        float sum = 0;
        for (int i = 0; i < prices.size(); i++){
            System.out.println("price: " + prices.get(i));
            sum += prices.get(i);
            System.out.println("sum: " + sum);
        }

        String rounded = String.format("%.2f", sum);

        billSum = rounded;
        return rounded;
    }

    /**
     *
     * @author Andreas Lakus
     * @return
     */
    public List<Medication> getSelectedMedications() throws NullPointerException{
        List<Medication> selectedMedications = new ArrayList<>();
        int getRows = jTable4.getRowCount();
        System.out.println(getRows);
        for ( int i = 0 ; i < getRows; i++) {
            if (jTable4.getValueAt(i, 3).equals(true)){
                int medicationID = Integer.parseInt(jTable4.getValueAt(i, 0).toString());
                String medicationName  =  jTable4.getValueAt(i, 1).toString();
                float price  = Float.parseFloat(jTable4.getValueAt(i, 2).toString());

                Medication medication = new Medication(medicationID, medicationName, price);

                selectedMedications.add(medication);
            }
        }
        return selectedMedications;
    }

    /**
     * @author Andreas Lakus
     * @return
     */
    public List<Procedure> getSelectedProcedures()throws NullPointerException{
        List<Procedure> selectedProcedures = new ArrayList<>();
        int getRows = jTable5.getRowCount();
        for ( int i = 0 ; i < getRows; i++) {
            if (jTable5.getValueAt(i, 3).equals(true)){
                int procedureID = Integer.parseInt(jTable5.getValueAt(i, 0).toString());
                String procedureName  =  jTable5.getValueAt(i, 1).toString();
                float price  = Float.parseFloat(jTable5.getValueAt(i, 2).toString());

                Procedure procedure = new Procedure(procedureID, procedureName, price);

                selectedProcedures.add(procedure);
            }
        }
        return selectedProcedures;
    }

    /**
     * @author Andreas Lakus
     * @return
     */
    public Appointment getSelectedPatientsAppointment()throws NullPointerException{
        int getSelectedRow = jTable3.getSelectedRow();
        int patientID = Integer.parseInt(jTable3.getValueAt(getSelectedRow,0).toString());
        int appointmentID = Integer.parseInt(jTable3.getValueAt(getSelectedRow,3).toString());
        String activeBillSum = billSum;

        Appointment appointment = new Appointment(appointmentID, activeBillSum);

        return appointment;
    }
    /**
     * @author Andreas Lakus
     * @return
     */
    void addBillToPatientsAppointment(Appointment appointment) throws SQLException{
        AppointmentDAOImpl appointmentDAO = new AppointmentDAOImpl();
        appointmentDAO.updatePrice(appointment);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AppIcon;
    private javax.swing.JLabel Appname1;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton calculateButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField sumTextField;
    // End of variables declaration
}
