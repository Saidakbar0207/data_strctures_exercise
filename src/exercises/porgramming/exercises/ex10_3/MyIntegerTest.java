package exercises.porgramming.exercises.ex10_3;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(7);
        System.out.println("Value: " + num.getValue());
        System.out.println("isEven: " + num.isEven());
        System.out.println("isOdd: " + num.isOdd());
        System.out.println("isPrime: " + num.isPrime());

        System.out.println("Static isEven(10): " + MyInteger.isEven(10));
        System.out.println("Static isOdd(11): " + MyInteger.isOdd(11));
        System.out.println("Static isPrime(13): " + MyInteger.isPrime(13));

        char[] charArray = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArray));
        System.out.println("parseInt(String): " + MyInteger.parseInt("456"));
    }
}
