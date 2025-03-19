package exercises.porgramming.exercises.ex10_4;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0,0);
        MyPoint myPoint1 = new MyPoint(10,30.5);
        System.out.println(myPoint.distance(myPoint1));

    }
}
