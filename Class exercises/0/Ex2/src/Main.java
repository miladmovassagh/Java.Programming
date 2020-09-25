import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array: ");
        for(i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("the maximum of elements is: " + max);
    }
}
