package br.mv.test.dbutlis;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String ORACLE_DB_URL="jdbc:oracle:thin:SYS/123C@//localhost:1521:xe";
    private static final String ORACLE_DB_USERNAME="SYS";
    private static final String ORACLE_DB_PASSWORD="123C";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(ORACLE_DB_URL, ORACLE_DB_USERNAME,ORACLE_DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

}
