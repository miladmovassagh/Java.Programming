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
        preparedStatement = connection.prepareStatement ("insert into useraccounts(name,username,password,email) values (?,?,?,?)");
        preparedStatement.setString(1,usersEnti.getName());
        preparedStatement.setString(2,usersEnti.getUsername());
        preparedStatement.setString(3,usersEnti.getPassword());
        preparedStatement.setString(4,usersEnti.getEmail());
        preparedStatement.executeUpdate();
    }

    public List<UsersEnti> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select * from useraccounts");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<UsersEnti> usersEntiList = new ArrayList<>();
        while(resultSet.next ()) {
            UsersEnti usersEnti = new UsersEnti();
            usersEnti.setName(resultSet.getString("name"));
            usersEnti.setUsername(resultSet.getString("username"));
            usersEnti.setPassword(resultSet.getString("password"));
            usersEnti.setEmail(resultSet.getString("email"));
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
