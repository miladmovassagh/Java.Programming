import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of rectangle: ");
        double a = input.nextDouble();
        System.out.print("please enter the width of rectangle: ");
        double b = input.nextDouble();
        Rectangle rectangle = new Rectangle(a, b);
        System.out.print("please enter the side of square: ");
        double c = input.nextDouble();
        Square square = new Square(c);
        System.out.println("environment of rectangle is: " + rectangle.calculateEnvironment());
        System.out.println("area of rectangle is: " + rectangle.calculateArea());
        System.out.println("environment of square is: " + square.calculateEnvironment());
        System.out.println("area of square is: " + square.calculateArea());
    }
}