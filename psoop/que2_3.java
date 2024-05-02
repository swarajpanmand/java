package psoop;

class Fibonacci{
    int n;
    int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    Fibonacci(int n){
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}

public class que2_3 {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci(10);
    }
}
