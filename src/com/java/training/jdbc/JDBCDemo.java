package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String args[]) throws Exception {

        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://108.175.13.142:3306/employee_db?useSSL=false";
        String username = "root";
        String password = "Srr@1216it";
        String query = "INSERT INTO employee (employee_id, first_name, last_name, email_id) " +
                "VALUES (5,'Srini', 'Komatipally', 'kpsvas@gmail.com')";

        // Load driver class
        Class.forName(driverClassName);

        // Obtain a connection
        Connection con = DriverManager.getConnection(url, username, password);

        // Obtain a statement
        Statement st = con.createStatement();

        // Execute the query
        int count = st.executeUpdate(query);
        System.out.println("number of rows affected by this query= " + count);
        // Closing the connection as per the
        // requirement with connection is completed
        con.close();
    }
}
