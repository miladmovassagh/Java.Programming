public class Square {
    private double side;

    public Square() {
        System.out.println("object is created.");
    }
    public Square(double x) {
        setSquare(x);
    }
    public void setSquare(double x) {
        side = x;
    }
    public double calculateEnvironment() {
        double p;
        p = 4 * side;
        return p;
    }
    public double calculateArea() {
        double s;
        s = side * side;
        return s;
    }
}
