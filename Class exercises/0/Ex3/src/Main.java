import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first integer number: ");
        int a = input.nextInt();
        System.out.print("enter the second integer number: ");
        int b = input.nextInt();
        System.out.println("1:namayeshe hasele jame 2adad");
        System.out.println("2:namayeshe hasele ekhtelafe adade bozorgtar az kochiktar");
        System.out.println("3:namayeshe hasele zarbe 2adad");
        System.out.println("4:namayeshe hasele taghsime 2adad");
        System.out.print("gozine morede nazar ra vared konid: ");
        int gozine = input.nextInt();
        switch(gozine) {
            case 1:
                int c = a + b;
                System.out.println(a + "+" + b + "=" + c);
                break;
            case 2:
                int d;
                if(a >= b) {
                    d = a - b;
                    System.out.println(a + "-" + b + "=" + d);
                }
                else {
                    d = b - a;
                    System.out.println(b + "-" + a + "=" + d);
                }
                break;
            case 3:
                int e = a * b;
                System.out.println(a + "*" + b + "=" + e);
                break;
            case 4:
                double f = (double) a / b;
                double g = (double) b / a;
                System.out.println(a + "/" + b + "=" + f);
                System.out.println(b + "/" + a + "=" + g);
                break;
            default:
                System.out.println("gozine eshtebah ast.");
        }
    }
}
