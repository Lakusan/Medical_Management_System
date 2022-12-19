package de.srh.dao.impl;


import de.srh.config.DBManager;
import de.srh.dao.DAO;
import de.srh.model.User;
import de.srh.service.PasswordService;
import de.srh.service.ValidationService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object Implementation for Users
 * @author Andreas Lakus
 */

public class UserDAOImpl implements DAO<User> {
    @Override
    public User get(int id) throws SQLException {
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title FROM users WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");
                user = new User(oid, username, firstName, lastName, email, password, phoneNum, title );

                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    // lists all entities
    @Override
    public List<User> getAll() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM users";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("user_id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");
                User user = new User( id,  firstname,  lastname,  email,  password, username, phoneNum, title );

                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return users;
    }

/**    "Save 'saves' an entity to the database: depending on the existence of the key
    property, it will be inserted (key is null) or updated (key is not null).
    This is similar to insertOrReplace, but may be more efficient, because if
   a key is present, it does not have to query if that key already exists."**/
    @Override
    public int save(User user) {
        return 0;
    }

    // insert entity into table and assumes that the key doesn't exist. Otherwise, throws exception
    @Override
    public int insert(User user) throws SQLException {
        Connection connection = DBManager.getConnection();

        // validate Password
        ValidationService validationService = new ValidationService();
        validationService.validatePassword(user.getPassword());

        // hash password
        PasswordService passwordService = new PasswordService();
        String hashedPassword = passwordService.hashPassword(user.getPassword());

//        String sql = "INSERT INTO users (firstname, lastname, email, password, username, phone_num, title) VALUES (?,?,?,?,?,?,?)";
        String sql = "INSERT IGNORE INTO country (countryname) VALUE (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getCountry());
        int result = -1;

        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }

        String sql2 = "INSERT IGNORE INTO city (cityname , city.country_country_id) VALUES (?, (SELECT country_id FROM country  WHERE countryname = ?))";
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        preparedStatement2.setString(1, user.getCity());
        preparedStatement2.setString(2, user.getCountry());
        int result2 = -1;

        try{
            result2 = preparedStatement2.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }



        String sql3 = "INSERT IGNORE INTO address (streetname , postalcode, housenumber, address.city_city_id) VALUES (?, ?, ?, (SELECT city_id FROM city  WHERE cityname = ?));";
        PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
        preparedStatement3.setString(1, user.getStreetname());
        preparedStatement3.setInt(2, user.getPostalcode());
        preparedStatement3.setInt(3, user.getHouseNum());
        preparedStatement3.setString(4, user.getCity());
        int result3 = -1;

        try{
            result3 = preparedStatement3.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }

        String sql4 = "INSERT INTO users (lastname, firstname, username, email , password, phone_num, title, address_address_id, address_city_city_id) VALUES (?, ?, ?, ?, ?, ?, ?, (SELECT address_id FROM address WHERE streetname = ? AND postalcode = ? AND housenumber = ? AND address.city_city_id = (SELECT city_id FROM city  WHERE cityname = ?)), (SELECT city_id FROM city  WHERE cityname = ?))";
        PreparedStatement preparedStatement4 = connection.prepareStatement(sql4);
        preparedStatement4.setString(1, user.getLastname());
        preparedStatement4.setString(2, user.getFirstname());
        preparedStatement4.setString(3, user.getUsername());
        preparedStatement4.setString(4, user.getEmail());
        preparedStatement4.setString(5, hashedPassword);
        preparedStatement4.setString(6, user.getPhoneNum());
        preparedStatement4.setString(7, user.getTitle());
        preparedStatement4.setString(8, user.getStreetname());
        preparedStatement4.setInt(9, user.getPostalcode());
        preparedStatement4.setInt(10, user.getHouseNum());
        preparedStatement4.setString(11, user.getCity());
        preparedStatement4.setString(12, user.getCity());
        int result4 = -1;

        try{
            result4 = preparedStatement4.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closePrepStatement(preparedStatement2);
        DBManager.closePrepStatement(preparedStatement3);
        DBManager.closePrepStatement(preparedStatement4);
        DBManager.closeConnection(connection);

        return result;
    }
    // updates entity which exists by key
    @Override
    public int update(User user) throws SQLException{
        Connection connection = DBManager.getConnection();
        // validate Password
        ValidationService validationService = new ValidationService();
        validationService.validatePassword(user.getPassword());

        // hash password
        PasswordService passwordService = new PasswordService();
        String hashedPassword = passwordService.hashPassword(user.getPassword());

        String sql = "UPDATE users set firstname = ?, lastname = ?, email = ?, password =? , username =? , phone_num =? , title =? WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, hashedPassword);
        preparedStatement.setString(5, user.getUsername());
        preparedStatement.setInt(6, user.getId());
        preparedStatement.setString(7, user.getPhoneNum());
        preparedStatement.setString(8, user.getTitle());

        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return result;
    }
    public int updateManagedUsers(User user) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE users set firstname = ?, lastname = ? , phone_num =? WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getPhoneNum());
        preparedStatement.setInt(4, user.getId());

        int result = -1;
        try{
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());

        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return result;
    }

    // deletes entity by id
    @Override
    public int delete(User user) throws SQLException {
        Connection connection = DBManager.getConnection();

        String sql = "DELETE FROM users WHERE user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, user.getId());
        int result = -1;
        try {
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public User findUserByEMail(String eMail) throws SQLException{
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title  FROM users WHERE email = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, eMail);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String username = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");

                user = new User(oid, username, firstName, lastName, email, password, phoneNum, title);
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    public User findUserByUserName(String username) throws SQLException {
        Connection connection = DBManager.getConnection();
        User user = null;

        String sql = "SELECT user_id, firstname, lastname, email, password, username, phone_num, title FROM users WHERE username = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String userName = resultSet.getString("username");
                String phoneNum = resultSet.getString("phone_num");
                String title = resultSet.getString("title");

                user = new User(oid, userName, firstName ,lastName ,email , password, phoneNum, title);
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return user;
    }

    public List<User> getNotValidatedUsers() throws SQLException{
        Connection connection = DBManager.getConnection();
        List<User> foundUsers = new ArrayList<>();

        String sql = "SELECT user_id, firstname, lastname, email, username, is_activated FROM users WHERE is_activated = 0";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int oid = resultSet.getInt("user_id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String userName = resultSet.getString("username");
                int isActivated = resultSet.getInt("is_activated");

                User user = new User(oid, userName, firstName, lastName, email, isActivated);

                foundUsers.add(user);
            }
            DBManager.closeResultSet(resultSet);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return foundUsers;
    }

    public void validateUsers(User user) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "UPDATE users set is_activated = 1 WHERE user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, user.getId());
        int result = -1;
        try {
            result = preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public String getUserRole(int id) throws SQLException{
        Connection connection = DBManager.getConnection();

        String sql = "SELECT rolename FROM users INNER JOIN roles ON users.roles_role_id = roles.role_id WHERE users.user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        String roleName = null;
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                roleName = resultSet.getString("rolename");
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return roleName;
    }

public List<User> getAllUsersWithRoles() throws SQLException{
        Connection connection = DBManager.getConnection();

        List<User> allUsers = new ArrayList<>();

        String sql = "SELECT users.user_id, users.username, users.lastname, users.firstname, users.email, roles.rolename FROM users INNER JOIN roles ON users.roles_role_id = roles.role_id ORDER BY users.user_id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("user_id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String username = resultSet.getString("username");
                String role = resultSet.getString("rolename");
                User user = new User( username, id, firstname,  lastname,  email, role );
                allUsers.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        return allUsers;
    }

    public void setUserRoles(List<User> users) throws SQLException{
        Connection connection = DBManager.getConnection();

        for (int i = 0 ; i < users.size() ; i++){
            String sql = "UPDATE users set roles_role_id = ? WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int roleNum = 0;
            switch(users.get(i).getRole()){
                case "admin":
                    roleNum = 1;
                    break;
                case "user":
                    roleNum = 2;
                    break;
                case "doctor":
                    roleNum = 3;
                    break;
                case "nurse":
                    roleNum = 4;
                    break;
                default:
                    roleNum = 2;
                    break;
            }

            preparedStatement.setInt(1, roleNum);
            preparedStatement.setInt(2, users.get(i).getId());

            try{
                preparedStatement.executeUpdate();
                connection.commit();
            } catch (SQLIntegrityConstraintViolationException e){
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());

            }
            DBManager.closePrepStatement(preparedStatement);

        }
        DBManager.closeConnection(connection);
    }

    public boolean getUserActivationStatus(int id) throws SQLException {

        Connection connection = DBManager.getConnection();

        String sql = "SELECT is_activated FROM users WHERE user_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int isAcivated = 2;
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                isAcivated = resultSet.getInt("is_activated");
                DBManager.closeResultSet(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);

        if (isAcivated == 0) {
            return false;
        } else if (isAcivated == 1){
            return true;

        }
        return false;
    }
    public List<User> getAllManagedUsers() throws SQLException {
        Connection connection = DBManager.getConnection();

        List<de.srh.model.User> users = new ArrayList<>();

        String sql = "SELECT users.user_id, users.username, users.lastname, users.firstname, users.email, roles.rolename, users.phone_num, is_activated FROM users INNER JOIN roles ON users.roles_role_id = roles.role_id WHERE users.is_activated = 1 ORDER BY users.user_id";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("user_id");
                String username = resultSet.getString("username");
                String lastname = resultSet.getString("lastname");
                String firstname = resultSet.getString("firstname");
                String email = resultSet.getString("email");
                String role = resultSet.getString("rolename");
                String phoneNum = resultSet.getString("phone_num");
                // TODO: add department
                // TODO: add specialization
                String department = "Department";
                String specialization = "Specialization";

                int isActivatedVal = resultSet.getInt("is_activated");
                boolean isActivated = false;
                if (isActivatedVal == 1) {
                    isActivated = true;
                } else if (isActivatedVal == 0) {
                    isActivated = false;
                }
                int emplid = 1;
                de.srh.model.User user = new de.srh.model.User( id, emplid,  username,  firstname,  lastname, email , phoneNum, isActivated, role );

                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBManager.closePrepStatement(preparedStatement);
        DBManager.closeConnection(connection);
        return users;
    }
}
