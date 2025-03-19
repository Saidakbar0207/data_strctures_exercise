package exercises.porgramming.exercises.ex10_5;

public class StackOfInteger {
    public void Factors(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.err.println("Invalid number");
    }

}
