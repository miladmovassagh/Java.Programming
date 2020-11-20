package model.repository;

import model.entity.UserAccountEnti;

import java.sql.*;
import java.util.*;

public class UserAccountRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserAccountRepo() throws Exception {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert(UserAccountEnti userAccountEnti) throws Exception {
        preparedStatement = connection.prepareStatement ("insert into usersAccount(name,username,password,email) values (?,?,?,?)");
        preparedStatement.setString(1,userAccountEnti.getName());
        preparedStatement.setString(2,userAccountEnti.getUsername());
        preparedStatement.setString(3,userAccountEnti.getPassword());
        preparedStatement.setString(4,userAccountEnti.getEmail());
        preparedStatement.executeUpdate();
    }

    public List<UserAccountEnti> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select * from usersAccount");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<UserAccountEnti> userAccountEntiList = new ArrayList<>();
        while(resultSet.next ()) {
            UserAccountEnti userAccountEnti = new UserAccountEnti();
            userAccountEnti.setName(resultSet.getString("name"));
            userAccountEnti.setUsername(resultSet.getString("username"));
            userAccountEnti.setPassword(resultSet.getString("password"));
            userAccountEnti.setEmail(resultSet.getString("email"));
            userAccountEntiList.add(userAccountEnti);
        }
        return userAccountEntiList;
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
