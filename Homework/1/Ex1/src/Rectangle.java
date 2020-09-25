public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        System.out.println("object is created.");
    }
    public Rectangle(double l, double w) {
        setRectangle(l, w);
    }
    public void setRectangle(double l, double w) {
        length = l;
        width = w;
    }
    public double calculateEnvironment() {
        double p;
        p = 2 * (length+width);
        return p;
    }
    public double calculateArea() {
        double s;
        s = length * width;
        return s;
    }
}
