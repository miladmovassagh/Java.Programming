import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array: ");
        for(i = 0; i < n; i++)
            arr[i] = input.nextInt();
        System.out.print("enter the number for search in array: ");
        int a = input.nextInt();
        for(i = 0; i < n; i++)
            if(arr[i] == a)
                c++;
        if(c > 0) {
            System.out.println("true");
            System.out.println("the number of repetitions: " + c);
        }
        else
            System.out.println("false");
    }
}