package psoop;

import java.util.*;


class Home{
    int rooms;
    int size;

    Home(int rooms, int size){
        this.rooms = rooms;
        this.size = size;
    }

    void display(){
        System.out.println("Rooms: "+rooms);
        System.out.println("Size: "+size);
    }
}

class Car extends Home{
    int carNumber;
    String carName;
    int seatCapacity;

    Car(int rooms, int size, int carNumber, String carName, int seatCapacity){
        super(rooms, size);
        this.carNumber = carNumber;
        this.carName = carName;
        this.seatCapacity = seatCapacity;
    }
}


public class que7_1 {
    
}
