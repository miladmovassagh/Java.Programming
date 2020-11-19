package com.usc;

import java.sql.*;

public class UserAccount implements AutoCloseable {
    private String name;
    private String username;
    private String password;
    private String email;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserAccount() {

    }

    public UserAccount(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public UserAccount setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserAccount setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAccount setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserAccount setEmail(String email) {
        this.email = email;
        return this;
    }

    public void connection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void signUp() throws Exception {
        preparedStatement = connection.prepareStatement ("insert into users(name, username, password, email) values (?,?,?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, password);
        preparedStatement.setString(4, email);
        try {
            preparedStatement.executeUpdate ();
            System.out.println("sign up successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void login() throws Exception {
        boolean check = false;
        String username , password;
        preparedStatement = connection.prepareStatement ("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next ()) {
            username = resultSet.getString("username");
            password = resultSet.getString("password");
            if(username != null && username.equals(this.username) && password != null && password.equals(this.password)) {
                check = true;
                break;
            }
        }
        if(check)
            System.out.println("login successfully.");
        else
            System.out.println("invalid username or password.");
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
