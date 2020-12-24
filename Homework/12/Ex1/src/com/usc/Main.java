package com.usc;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Employees employees = (int id, String name, String family, int workExperience) -> {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employeesInfo(id,name,family,workExperience) values (?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,family);
            preparedStatement.setInt(4,workExperience);
            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.close();
        };
        try {
            employees.insert(1, "milad", "movassagh", 0);
            employees.insert(2, "ali", "rahimi", 5);
            employees.insert(3, "reza", "karimi", 2);
            employees.insert(4, "saeed", "saadati", 0);
            employees.insert(5, "behnam", "baghi", 1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
