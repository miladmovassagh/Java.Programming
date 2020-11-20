package model.repository;

import model.entity.UsersEnti;

import java.util.*;
import java.sql.*;

public class UsersRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UsersRepo() throws Exception {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert(UsersEnti usersEnti) throws Exception {
        preparedStatement = connection.prepareStatement ("insert into useraccount(name,username,password,email,bill,internet) values (?,?,?,?,?,?)");
        preparedStatement.setString(1,usersEnti.getName());
        preparedStatement.setString(2,usersEnti.getUsername());
        preparedStatement.setString(3,usersEnti.getPassword());
        preparedStatement.setString(4,usersEnti.getEmail());
        preparedStatement.setLong(5,usersEnti.getBill());
        preparedStatement.setInt(6,usersEnti.getInternetPackage());
        preparedStatement.executeUpdate();
    }

    public void update (UsersEnti usersEnti) throws Exception {
        preparedStatement = connection.prepareStatement ("update useraccount set bill = ?, internet = ? where username = ? ");
        preparedStatement.setLong(1,usersEnti.getBill());
        preparedStatement.setInt(2,usersEnti.getInternetPackage());
        preparedStatement.setString(3,usersEnti.getUsername());
        preparedStatement.executeUpdate ();
    }

    public List<UsersEnti> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select * from useraccount");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<UsersEnti> usersEntiList = new ArrayList<>();
        while(resultSet.next ()) {
            UsersEnti usersEnti = new UsersEnti();
            usersEnti.setName(resultSet.getString("name"));
            usersEnti.setUsername(resultSet.getString("username"));
            usersEnti.setPassword(resultSet.getString("password"));
            usersEnti.setEmail(resultSet.getString("email"));
            usersEnti.setBill(resultSet.getLong("bill"));
            usersEnti.setInternetPackage(resultSet.getInt("internet"));
            usersEntiList.add(usersEnti);
        }
        return usersEntiList;
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
