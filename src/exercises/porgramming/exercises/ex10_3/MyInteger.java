package exercises.porgramming.exercises.ex10_3;

public class MyInteger {
    private int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        if(value % 2 == 1){
            for(int i =2; i < value/2; i++){
                if(value % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static boolean isOdd(int n){
        return n % 2 != 0;
    }
    public static boolean isPrime(int n){
        if(n % 2 == 0){
            for(int i =2; i < n/2; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger n){
        return n.isEven();
    }
    public static boolean isOdd(MyInteger n){
        return n.isOdd();
    }
    public static boolean isPrime(MyInteger n){
        return n.isPrime();
    }
    public boolean equals(int n){
        return this.value == n;
    }
    public boolean equals(MyInteger n){
        return this.value == n.getValue();
    }
    public static int parseInt(char[] charArray){
        return Integer.parseInt(new String(charArray));
    }
    public static int parseInt(String string){
        return Integer.parseInt(string);
    }

}

