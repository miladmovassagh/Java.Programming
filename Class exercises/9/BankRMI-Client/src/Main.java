import myRemote.Card;
import myRemote.CardService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            CardService cardService = (CardService) Naming.lookup("//localhost/BANKService");
            List<Card> cardList = cardService.report();
            System.out.println("1:Show inventory");
            System.out.println("2:Card to card");
            System.out.println("Register new customer");
            System.out.print("enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch(choice) {
                case 1:
                    boolean check = false;
                    System.out.print("enter your card number: ");
                    String cardNumber = input.nextLine();
                    System.out.print("enter your second password: ");
                    int secondPassword = Integer.parseInt(input.nextLine());
                    for (Card card : cardList) {
                        if(cardNumber != null && cardNumber.equals(card.getCardNumber()) && secondPassword == card.getSecondPassword()) {
                            check = true;
                            System.out.println("your balance is: " + card.getBalance());
                        }
                    }
                    if(!check)
                        System.out.println("invalid information");
                    break;
                case 2:
                    boolean check1 = false;
                    System.out.print("enter your card number: ");
                    String cardNumber1 = input.nextLine();
                    System.out.print("enter the destination card number: ");
                    String cardNumber2 = input.nextLine();
                    System.out.print("enter the desired amount: ");
                    long amount = Long.parseLong(input.nextLine());
                    System.out.print("enter your second password: ");
                    int secondPassword1 = Integer.parseInt(input.nextLine());
                    for(Card card : cardList) {
                        if(card.getCardNumber().equals(cardNumber1) && card.getSecondPassword() == secondPassword1) {
                            check1 = true;
                            if(card.getBalance() < amount)
                                System.out.println("inventory is not enough");
                            else {
                                cardService.edit(new Card().setCardNumber(cardNumber1).setBalance(card.getBalance() - amount));
                                cardService.edit(new Card().setCardNumber(cardNumber2).setBalance(card.getBalance() + amount));
                                System.out.println("card to card successfully");
                            }
                        }
                    }
                    if(!check1)
                        System.out.println("invalid information");
                    break;
                case 3:
                    boolean check2 = false;
                    System.out.print("enter full name: ");
                    String fullName = input.nextLine();
                    System.out.print("enter card number (16 digits): ");
                    String cardNumber3 = input.nextLine();
                    System.out.print("enter second password: ");
                    int secondPassword2 = Integer.parseInt(input.nextLine());
                    System.out.print("enter balance: ");
                    long balance = Long.parseLong(input.nextLine());
                    for(int i = 0; i < cardNumber3.length(); i++) {
                        if(!Character.isDigit(cardNumber3.charAt(i)))
                            check2 = true;
                    }
                    if(cardNumber3.length() != 16)
                        check2 = true;
                    for(int i = 0; i < fullName.length(); i++) {
                        if(!Character.isLetter(fullName.charAt(i)) && !Character.isSpaceChar(fullName.charAt(i)))
                            check2 = true;
                    }
                    if(check2)
                        System.out.println("invalid information");
                    else {
                        cardService.save(new Card().setFullName(fullName).setCardNumber(cardNumber3).setSecondPassword(secondPassword2).setBalance(balance));
                        System.out.println("register successfully");
                    }
                    break;
                default:
                    System.out.println("invalid choice number");
            }
        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (NotBoundException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
