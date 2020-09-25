public class Average {
    private double sumGrade;
    private int sumRatio;

    public Average() {
        System.out.println("object is created.");
    }
    public Average(double g, int r) {
        setAverage(g, r);
    }
    public void setAverage(double g, int r) {
        sumGrade = g;
        sumRatio = r;
    }
    public void calculateAverage() {
        double avg;
        avg = sumGrade / sumRatio;
        System.out.println("your average is: " + avg);
        if(avg >= 10)
            System.out.println("you are passed");
        else
            System.out.println("you are failed");
    }
}