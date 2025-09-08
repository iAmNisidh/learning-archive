package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practic {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/vishalq";
        String username = "root";
        String password = "Mysql@7004";
        String query =  "SELECT email FROM rand";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println("there is ans error 1 "+ e.getMessage());
        }
        try {
            Connection com = DriverManager.getConnection(url,username,password);
            Statement st = com.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String name = rs.getString("email");
                System.out.println(name);
            }
            
        } 
        catch (Exception e) {
            System.out.println("there is an error 3 "+e.getMessage());

        }
    }
    
}
