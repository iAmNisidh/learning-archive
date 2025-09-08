package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/fertilizer_db";
        String username = "root"; 
        String pass = "Mysql@7004"; 
        String query = "SELECT name FROM crops";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection com = DriverManager.getConnection(url, username, pass);
        Statement st = com.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String cropName = rs.getString("name");
            System.out.println(cropName);
        }

        rs.close();
        st.close();
        com.close();
    }
}
