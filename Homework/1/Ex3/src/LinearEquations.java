public class LinearEquations {
    private double a;
    private double b;
    private final double E = 2;
    private double c;
    private double d;
    private final double F = 3;

    public LinearEquations() {
        System.out.println("object is created.");
    }
    public LinearEquations(double a1, double b1, double c1, double d1) {
        setLinearEquations(a1, b1, c1, d1);
    }
    public void setLinearEquations(double a1, double b1, double c1, double d1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
    }
    public void solveEquations() {
        if(a/c == b/d && a/c != E/F) {
            System.out.println("the equation has no answer.");
        }
        else {
            double x, y;
            x = (E*d - b*F) / (a*d - b*c);
            y = (a*F - E*c) / (a*d - b*c);
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}
