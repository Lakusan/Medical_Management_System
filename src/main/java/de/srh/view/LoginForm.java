package de.srh.view;

import de.srh.dao.impl.UserDAOImpl;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginForm extends JFrame{
    private JPanel mainPanel;
    private JButton loginBtn;
    private JTextField logTextField;
    private JTextField usernameTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField passwordTextField;

    private static ValidationService validationService = new ValidationService();
    private static UserDAOImpl userDAO = new UserDAOImpl();

    private static PasswordService passwordService = new PasswordService();

    public LoginForm() {
        loginBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameTextField.getText().toString();
            String password = passwordTextField.getText().toString();
            User loginUser = null;
            try {
                loginUser = userDAO.findUserByUserName(username);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            if (loginUser != null){
                setLogMsg("Found Username");
            }
            passwordService.verifyPasswordWithHash(loginUser.getPassword(), password);
            if (passwordService.verifyPasswordWithHash(loginUser.getPassword(), password)){
                System.out.println("Password matches");
                setLogMsg("Password matches");
            } else {
                System.out.println("Password false");
                setLogMsg("Password false");
            }
        }
    });
    }
    private boolean checkUsername(String username){
        return validationService.checkUsername(username);
    }

    private boolean checkPassword(String password){
        return validationService.validatePassword(password);
    }

    private void setLogMsg(String msg){
        logTextField.setText(msg);
    }
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setLocationRelativeTo(null);
        loginForm.setContentPane(loginForm.mainPanel);
        loginForm.setTitle("Login");
        loginForm.setSize(400, 200);
        loginForm.setVisible(true);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
