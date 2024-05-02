package psoop;

public class que3_2 {
    int a;
    int b;

    que3_2(){
        a = 10;
        b = 20;
    }
    que3_2(int a){
        this.a = a;
        b = a;
    }
    que3_2(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+" + "+b+"i");
    }

    public static void main(String args[]){
        que3_2 q1 = new que3_2();
        que3_2 q2 = new que3_2(5);
        que3_2 q3 = new que3_2(5, 10);
        q1.display();
        q2.display();
        q3.display();
    }
}
