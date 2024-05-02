package psoop;


abstract class Vehicle{
    int wheels;
    int engineCapacity;
    Vehicle(){
        wheels = 0;
        engineCapacity = 0;
    }

    void setWheels(int wheels){
        this.wheels = wheels;
    }

    public abstract void spec(int wheels, int engineCapacity);

    void display(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Engine Capacity: "+ engineCapacity);
    }
}

class LMV extends Vehicle{
    int speed;
    int mileage;

    LMV(){
        speed = 0;
        mileage = 0;
    }

    public void spec(int wheels, int engineCapacity) {
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
    }

    void display(){
        super.display();
        System.out.println("speed: "+ speed);
        System.out.println("Mileage: "+ mileage);

    }
}
class HMV extends Vehicle{
    int weight;
    int loadCapacity;
    int rpm;

    HMV(){
        weight = 0;
        loadCapacity = 0;
        rpm = 0;
    }

    public void spec(int wheels, int engineCapacity) {
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
    }

    void display(){
        super.display();
        System.out.println("Weight: "+ weight);
        System.out.println("Load Capacity: "+ loadCapacity);
        System.out.println("RPM: "+ rpm);

    }
}
class TW extends Vehicle{
    int weight;
    int loadCapacity;
    int rpm;

    TW(){
        weight = 0;
        loadCapacity = 0;
        rpm = 0;
    }

    public void spec(int wheels, int engineCapacity) {
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
    }

    public void display(){
        super.display();
        System.out.println("Weight: "+ weight);
        System.out.println("Load Capacity: "+ loadCapacity);
        System.out.println("RPM: "+ rpm);

    }
}

public class que8_3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new LMV();
        vehicles[1] = new HMV();
        vehicles[2] = new TW();

        for (Vehicle v : vehicles) {
            v.spec(4, 2000);
            v.display();
        }
    }
}
