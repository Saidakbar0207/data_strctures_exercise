package exercises.porgramming.exercises.ex10_4;

public class MyPoint {
    private double x;
    private double y;
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint() {
        x=0.0;
        y=0.0;
    }
    public double distance(MyPoint point) {
        return Math.abs(x - point.x) + Math.abs(y - point.y);
    }
    public static double distant(MyPoint point1, MyPoint point2) {
        return Math.abs(point1.x - point2.x) + Math.abs(point1.y - point2.y);
    }

}
