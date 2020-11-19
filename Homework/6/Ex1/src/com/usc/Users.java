package com.usc;

import java.sql.*;

public class Users implements AutoCloseable {
    private int userId;
    private String userName;
    private String password;
    private String email;
    private int age;
    private String educationLevel;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Users() {

    }

    public Users(int userId, String userName, String password, String email, int age, String educationLevel) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
        this.educationLevel = educationLevel;
    }

    public int getUserId() {
        return userId;
    }

    public Users setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Users setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Users setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Users setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public Users setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    public void connection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert() throws Exception {
        preparedStatement = connection.prepareStatement ("insert into siteUsers(userid, username, password, email, age, educationlevel) values (?,?,?,?,?,?)");
        preparedStatement.setInt(1, userId);
        preparedStatement.setString(2, userName);
        preparedStatement.setString(3, password);
        preparedStatement.setString(4, email);
        preparedStatement.setInt(5, age);
        preparedStatement.setString(6, educationLevel);
        try {
            preparedStatement.executeUpdate ();
            System.out.println("insert successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void update() throws Exception {
        try {
            if(select()) {
                preparedStatement = connection.prepareStatement("update siteusers set username = ?, password = ?, email = ?, age = ?, educationlevel = ? where userid = ?");
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, email);
                preparedStatement.setInt(4, age);
                preparedStatement.setString(5, educationLevel);
                preparedStatement.setInt(6, userId);
                preparedStatement.executeUpdate ();
                System.out.println("update successfully.");
            }
            else
                System.out.println("invalid user id.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean select() throws Exception {
        boolean check = false;
        int userId;
        preparedStatement = connection.prepareStatement ("select * from siteusers");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next ()) {
            userId = resultSet.getInt("userid");
            if(userId == this.userId) {
                check = true;
                break;
            }
        }
        return check;
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
