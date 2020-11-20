package model.repository;

import model.entity.CarSellEnti;

import java.util.*;
import java.sql.*;

public class CarSellRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CarSellRepo() throws Exception {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

    public void insert(CarSellEnti carSellEnti) throws Exception {
        preparedStatement = connection.prepareStatement ("insert into carsell(id,username) values (?,?)");
        preparedStatement.setInt(1,carSellEnti.getCarId());
        preparedStatement.setString(2, carSellEnti.getUsername());
        preparedStatement.executeUpdate();
    }

    public List<CarSellEnti> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select * from carsell");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<CarSellEnti> carSellEntiList = new ArrayList<>();
        while(resultSet.next ()) {
            CarSellEnti carSellEnti = new CarSellEnti();
            carSellEnti.setCarId(resultSet.getInt("id"));
            carSellEnti.setUsername(resultSet.getString("username"));
            carSellEntiList.add(carSellEnti);
        }
        return carSellEntiList;
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
