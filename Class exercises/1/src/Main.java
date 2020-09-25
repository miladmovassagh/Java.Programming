import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Borrowing book");
        System.out.println("2: Return the book");
        System.out.println("3: Register a new book");
        System.out.print("enter your option: ");
        int n = input.nextInt();
        switch(n) {
            case 1:
                Scanner input1 = new Scanner(System.in);
                System.out.print("enter the name of book: ");
                String a = input1.nextLine();
                System.out.print("enter the author name of book: ");
                String b = input1.nextLine();
                System.out.print("enter your name: ");
                String c = input1.nextLine();
                System.out.print("enter your membership code: ");
                int d = input1.nextInt();
                Library library1 = new Library(a, b, c, d);
                library1.borrowingBook();
                break;
            case 2:
                Scanner input2 = new Scanner(System.in);
                System.out.print("enter the name of book: ");
                String e = input2.nextLine();
                System.out.print("enter the author name of book: ");
                String f = input2.nextLine();
                System.out.print("enter your name: ");
                String g = input2.nextLine();
                System.out.print("enter your membership code: ");
                int h = input2.nextInt();
                Library library2 = new Library(e, f, g, h);
                library2.returnBook();
                break;
            case 3:
                Scanner input3 = new Scanner(System.in);
                System.out.print("enter the name of book: ");
                String i = input3.nextLine();
                System.out.print("enter the author name of book: ");
                String j = input3.nextLine();
                Library library3 = new Library(i, j);
                library3.registerBook();
                break;
            default:
                System.out.println("invalid option.");
        }
    }
}