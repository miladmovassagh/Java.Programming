import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the coefficient X of first equation: ");
        double a = input.nextDouble();
        System.out.print("enter the coefficient Y of first equation: ");
        double b = input.nextDouble();
        System.out.print("enter the coefficient X of second equation: ");
        double c = input.nextDouble();
        System.out.print("enter the coefficient Y of second equation: ");
        double d = input.nextDouble();
        LinearEquations linearEquations = new LinearEquations(a, b, c, d);
        linearEquations.solveEquations();
    }
}
