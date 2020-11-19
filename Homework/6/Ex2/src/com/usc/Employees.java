package com.usc;

import java.sql.*;

public class Employees implements AutoCloseable {
    private int employeeId;
    private String name;
    private String id;
    private String fatherName;
    private String position;
    private String salary;
    private int workExperience;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Employees() {

    }

    public Employees(int employeeId, String name, String id, String fatherName, String position, String salary, int workExperience) {
        this.employeeId = employeeId;
        this.name = name;
        this.id = id;
        this.fatherName = fatherName;
        this.position = position;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employees setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employees setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public Employees setId(String id) {
        this.id = id;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Employees setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Employees setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public Employees setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public Employees setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
        return this;
    }

    public void connection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert() throws Exception {
        preparedStatement = connection.prepareStatement ("insert into employees(employeeid, name, id, fathername, position, salary, experience) values (?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, employeeId);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, id);
        preparedStatement.setString(4, fatherName);
        preparedStatement.setString(5, position);
        preparedStatement.setString(6, salary);
        preparedStatement.setInt(7, workExperience);
        try {
            preparedStatement.executeUpdate ();
            System.out.println("insert successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() throws Exception {
        try {
            if(select()) {
                preparedStatement = connection.prepareStatement("delete from employees where employeeid = ?");
                preparedStatement.setInt(1, employeeId);
                preparedStatement.executeUpdate();
                System.out.println("delete successfully.");
            }
            else
                System.out.println("invalid employee id.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean select() throws Exception {
        boolean check = false;
        int employeeId;
        preparedStatement = connection.prepareStatement ("select * from employees");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next ()) {
            employeeId = resultSet.getInt("employeeid");
            if(employeeId == this.employeeId) {
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
