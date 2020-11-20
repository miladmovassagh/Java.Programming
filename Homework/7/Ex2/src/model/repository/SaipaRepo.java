package model.repository;

import model.entity.SaipaEnti;

import java.util.*;
import java.sql.*;

public class SaipaRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SaipaRepo() throws Exception {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
        connection.setAutoCommit (false);
    }

//    public void insert(SaipaEnti saipaEnti) throws Exception {
//        preparedStatement = connection.prepareStatement ("insert into saipacars(id,model,color,maxspeed,year,price) values (?,?,?,?,?,?)");
//        preparedStatement.setInt(1,saipaEnti.getConstructionYear());
//        preparedStatement.setString(2, saipaEnti.getModel());
//        preparedStatement.setString(3,saipaEnti.getColor());
//        preparedStatement.setInt(4,saipaEnti.getMaxSpeed());
//        preparedStatement.setInt(5,saipaEnti.getConstructionYear());
//        preparedStatement.setString(6,saipaEnti.getPrice());
//        preparedStatement.executeUpdate();
//    }

    public List<SaipaEnti> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select * from saipacars");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<SaipaEnti> saipaEntiList = new ArrayList<>();
        while(resultSet.next ()) {
            SaipaEnti saipaEnti = new SaipaEnti();
            saipaEnti.setCarId(resultSet.getInt("id"));
            saipaEnti.setModel(resultSet.getString("model"));
            saipaEnti.setColor(resultSet.getString("color"));
            saipaEnti.setMaxSpeed(resultSet.getInt("maxspeed"));
            saipaEnti.setConstructionYear(resultSet.getInt("year"));
            saipaEnti.setPrice(resultSet.getString("price"));
            saipaEntiList.add(saipaEnti);
        }
        return saipaEntiList;
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
