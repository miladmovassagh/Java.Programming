package myRemote;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CardServiceImplementor extends UnicastRemoteObject implements CardService {

    public CardServiceImplementor() throws Exception {

    }

    @Override
    public void save(Card card) throws Exception {
        CardRepo cardRepo = new CardRepo();
        cardRepo.insert(card);
        cardRepo.close();
    }

    @Override
    public void edit(Card card) throws Exception {
        CardRepo cardRepo = new CardRepo();
        cardRepo.update(card);
        cardRepo.close();
    }

    @Override
    public List<Card> report() throws Exception {
        CardRepo cardRepo = new CardRepo();
        List<Card> cardList = cardRepo.select();
        cardRepo.close();
        return cardList;
    }
}
