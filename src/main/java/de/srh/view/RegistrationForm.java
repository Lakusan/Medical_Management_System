package de.srh.view;

import javax.swing.*;

public class RegistrationForm extends JFrame{
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel usernameLabel;
    private JLabel emailLabel;
    private JTextField firstnameTextField;
    private JTextField lastnameTextField;
    private JTextField emailTextField;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JTextField confirmPasswordTextField;
    private JButton btnRegister;
    private JTextField msgTextField;
    private JButton btnReset;
    private JPanel registrationPanel;



    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.setLocationRelativeTo(null);
        registrationForm.setContentPane(registrationForm.registrationPanel);
        registrationForm.setTitle("Login");
        registrationForm.setSize(400, 400);
        registrationForm.setVisible(true);
        registrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
