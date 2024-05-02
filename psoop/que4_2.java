package psoop;

class Power{
    int a;
    int b;

    void raisePower(double a, int b){
        System.out.println(Math.pow(a, b));
    }

    void raisePower(int a, int b){
        System.out.println(Math.pow(a, b));
    }
}

public class que4_2 {
    public static void main(String[] args){
        Power p = new Power();
        p.raisePower(2, 3);
        p.raisePower(2.5, 3);
    }
}
