package de.srh.config;

import java.sql.*;
import java.util.Properties;

/**
 * Database Connector
 * Holds a static Database(MySQL) connection as singleton
 * -> Stolen from <a href="https://github.com/sdp-srh/course2022/blob/main/ProjectWorkSample/src/main/java/application/DBHandler.java">...</a>
 * edited by
 * @author Andreas Lakus
 */
public class DBManager {
    private static Connection connection = null;

    public DBManager() {

    }
    // TODO: PROD -> System exit (44) should be replaced -> Prompt Error to give further information
    public static Connection getConnection() throws SQLException{
        ConfigManager config = new ConfigManager();
        Properties dbConfigProps = ConfigManager.getDBConfigProps();
        String DB_URL = dbConfigProps.getProperty("DB_URL").toString();
        String DB_USER = dbConfigProps.getProperty("DB_USER").toString();
        String DB_PORT= dbConfigProps.getProperty("DB_PORT").toString();
        String DB_SCHEME= dbConfigProps.getProperty("DB_SCHEME").toString();
        String DB_PWD = dbConfigProps.getProperty("DB_PWD").toString();
        String constructedDBURL = "jdbc:mysql://"+DB_URL+":"+DB_PORT+"/"+DB_SCHEME;
        System.out.println("connection is: " + connection);

        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e){
                System.out.println(e);
            }
            try {

                System.out.printf("Connecting to DB: %s%n",constructedDBURL);
                connection = DriverManager.getConnection(constructedDBURL, DB_USER, DB_PWD );
                connection.setAutoCommit(false);
            } catch (SQLException e){
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
        }
        System.out.printf("Connection established to: %s%n",constructedDBURL);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static void closePrepStatement(PreparedStatement preparedStatement) throws SQLException{
        preparedStatement.close();
    }

    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    public static void closeResultSet(ResultSet resultSet) throws SQLException{
        resultSet.close();
    }

}
