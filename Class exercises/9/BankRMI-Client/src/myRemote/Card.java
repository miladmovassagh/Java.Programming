package myRemote;

import java.io.Serializable;

public class Card implements Serializable {
    private String fullName;
    private String cardNumber;
    private int secondPassword;
    private long balance;

    public Card() {

    }

    public Card(String fullName, String cardNumber, int secondPassword, long balance) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.secondPassword = secondPassword;
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public Card setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public int getSecondPassword() {
        return secondPassword;
    }

    public Card setSecondPassword(int secondPassword) {
        this.secondPassword = secondPassword;
        return this;
    }

    public long getBalance() {
        return balance;
    }

    public Card setBalance(long balance) {
        this.balance = balance;
        return this;
    }
}
