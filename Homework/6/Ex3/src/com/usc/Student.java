package com.usc;

import java.sql.*;

public class Student implements AutoCloseable {
    private long studentId;
    private String name;
    private int entryYear;
    private String average;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Student() {

    }

    public Student(long studentId, String  name, int entryYear, String average) {
        this.studentId = studentId;
        this.name = name;
        this.entryYear = entryYear;
        this.average = average;
    }

    public long getStudentId() {
        return studentId;
    }

    public Student setStudentId(long studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public Student setEntryYear(int entryYear) {
        this.entryYear = entryYear;
        return this;
    }

    public String getAverage() {
        return average;
    }

    public Student setAverage(String average) {
        this.average = average;
        return this;
    }

    public void connection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert() throws Exception {
        preparedStatement = connection.prepareStatement ("insert into students(id, name, entryyear, average) values (?,?,?,?)");
        preparedStatement.setLong(1, studentId);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, entryYear);
        preparedStatement.setString(4, average);
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
                preparedStatement = connection.prepareStatement("update students set name = ?, entryyear = ?, average = ? where id = ?");
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, entryYear);
                preparedStatement.setString(3, average);
                preparedStatement.setLong(4, studentId);
                preparedStatement.executeUpdate ();
                System.out.println("update successfully.");
            }
            else
                System.out.println("invalid student id.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() throws Exception {
        try {
            if(select()) {
                preparedStatement = connection.prepareStatement("delete from students where id = ?");
                preparedStatement.setLong(1, studentId);
                preparedStatement.executeUpdate();
                System.out.println("delete successfully.");
            }
            else
                System.out.println("invalid student id.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean select() throws Exception {
        boolean check = false;
        long studentId;
        preparedStatement = connection.prepareStatement ("select * from students");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next ()) {
            studentId = resultSet.getLong("id");
            if(studentId == this.studentId) {
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
