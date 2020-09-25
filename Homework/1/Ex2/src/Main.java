import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, c = 0;
        double s = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of grade: ");
        int n = input.nextInt();
        for(i = 0; i < n; i++) {
            System.out.print("enter the grade: ");
            double a = input.nextDouble();
            System.out.print("enter the ratio of grade: ");
            int b = input.nextInt();
            s += (a*b);
            c += b;
        }
        Average average = new Average(s, c);
        average.calculateAverage();
    }
}