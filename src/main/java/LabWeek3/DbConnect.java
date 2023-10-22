package LabWeek3;

import java.sql.*;

import static com.mysql.cj.util.SaslPrep.StringType.QUERY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
    static final String DB_URL = "jdbc:mysql://localhost:3306/lab3";
    static final String USER = "root";
    static final String PASS = "avdo1234";
    static final String QUERY = "SELECT id, task_description, task_status FROM tasks";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            while(rs.next()){
                //Display values
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Task_Desk: " + rs.getString("task_description"));
                System.out.println("Task_Status: " + rs.getString("task_status"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}