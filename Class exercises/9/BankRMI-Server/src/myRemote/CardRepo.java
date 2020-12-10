package myRemote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CardRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CardRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "miladmovassagh", "mehr1379");
    }

    public void insert(Card card) throws Exception {
        preparedStatement = connection.prepareStatement("insert into card(fullName,cardNumber,secondPassword,balance) values (?,?,?,?)");
        preparedStatement.setString(1,card.getFullName());
        preparedStatement.setString(2,card.getCardNumber());
        preparedStatement.setInt(3,card.getSecondPassword());
        preparedStatement.setLong(4,card.getBalance());
        preparedStatement.executeUpdate();
    }

    public void update (Card card) throws Exception{
        preparedStatement = connection.prepareStatement("update card set balance = ? where cardNumber = ?");
        preparedStatement.setLong(1,card.getBalance());
        preparedStatement.setString(2,card.getCardNumber());
        preparedStatement.executeUpdate();
    }

    public List<Card> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from card");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Card> cardList = new ArrayList<>();
        while(resultSet.next()) {
            Card card = new Card();
            card.setFullName(resultSet.getString("fullName"));
            card.setCardNumber(resultSet.getString("cardNumber"));
            card.setSecondPassword(resultSet.getInt("secondPassword"));
            card.setBalance(resultSet.getLong("balance"));
            cardList.add(card);
        }
        return cardList;
    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
