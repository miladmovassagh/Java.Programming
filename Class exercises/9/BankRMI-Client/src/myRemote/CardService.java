package myRemote;

import java.rmi.Remote;
import java.util.List;

public interface CardService extends Remote {
    void save(Card card) throws Exception;
    void edit(Card card) throws Exception;
    List<Card> report() throws Exception;
}
