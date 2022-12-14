package de.srh;

import de.srh.config.DBManager;
import de.srh.dao.RoomDAO;
import de.srh.dao.impl.RoomDAOImpl;
import de.srh.dao.impl.UserDAOImpl;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;
import org.apache.commons.validator.routines.EmailValidator;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAOImpl userDAO = new UserDAOImpl();
////        DBManager dbManager = new DBManager();
//        User user = null;
//        List<User> userList = null;
//        try {
////            dbManager.getConnection();
////            System.out.println("get user per ID");
////            user = userDAO.get(1);
////            System.out.println(user.toString());
//            System.out.println("insert user");
//            User newUser = new User("username2",
//                    "firstname",
//                    "lastname",
//                    "adresse2@email.com",
//                    "passwort");
//            System.out.println(newUser.toString());
//        try {
//            userDAO.insert(newUser);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//            System.out.println("get all users");
//            userList = userDAO.getAll();
//            System.out.println(userList.toString());
//
//            System.out.println(userDAO.findUserByEMail(newUser.getEmail().toString()));
//            User updateUser = new User(1,"neuerUsername", "neu", "newlastname", "neueEmAil@de", "password" );
//            userDAO.update(updateUser);
//
//            User deleteUser = new User(212, "username", "firstname", "lastname", "adresse@email.com", "passwort");
//            userDAO.delete(deleteUser);


//        } catch ( SQLException e){
//            System.out.println(e);
//            throw new RuntimeException(e);
//        }
//        ValidationService validationService = new ValidationService();
//        validationService.validatePasswort("As1!@hhdzehnbhsg!");
//        PasswordService passwordService = new PasswordService();
//        passwordService.hashPassword("Penner");
//        User usernameUser = null;
//        try {
//            usernameUser = userDAO.findUserByUserName("neuerUsername");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(usernameUser.toString());
//        UserDAOImpl userDAO1 = new UserDAOImpl();
//        User foundUser = null;
//        try {
//            foundUser = userDAO1.findUserByUserName("username2");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(foundUser.getUsername());
//        User testUser = new User("testUser", "test", "user",  "testuser@nomail.com", "Start123.Start123");
//        try {
//            userDAO.insert(testUser);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        boolean isvalid = EmailValidator.getInstance()
//                .isValid("Andreas.Lksu@something.de");
//        System.out.println(isvalid);
//        userDAO.findUserByUserName("")
        RoomDAOImpl roomDAO = new RoomDAOImpl();
        try {
            System.out.println(roomDAO.get(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(roomDAO.getAll());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}