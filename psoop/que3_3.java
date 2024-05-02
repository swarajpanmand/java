package psoop;

public class que3_3 {
    que3_3(double a){
        System.out.println("Area of circle: " + (3.142*a*a));
    }

    que3_3(double a, double b){
        System.out.println("Area of rectangle: " + a*b);
    }

    que3_3(double a, double b, double c){
        System.out.println("Volume of cuboid: " + a*b*c);
    }

    public static void main(String[] args){
        que3_3 q1 = new que3_3(5);
        que3_3 q2 = new que3_3(5, 10);
        que3_3 q3 = new que3_3(5, 10, 15);
    }

}
