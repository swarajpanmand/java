package psoop;

public class que4_3 {
    int funct(int a){
        return a;
    }
     
    double funct(double a){
        return a;
    }

    float funct(float a){
        return a;
    }
    public static void main(String[] args){
        que4_3 q = new que4_3();
        System.out.println(q.funct(10));
        System.out.println(q.funct(10.5));
        System.out.println(q.funct(10.5f));
    }
}
