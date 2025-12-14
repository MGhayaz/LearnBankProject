package BankManagmentSystem;

import java.sql.*;
//import java.sql.Statement;


public class DataBaseConnection {


    Connection connection;
    Statement st;
    public DataBaseConnection() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql:///BankManagmentSystem","root","120604");
            st = connection.createStatement();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
