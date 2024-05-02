package psoop;


class Coworker{
    String name;
    String address;
    int division;

    Coworker(String name, String address, int division){
        this.name = name;
        this.address = address;
        this.division = division;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Division: "+division);
    }
    void computingIncome(){
        System.out.println("Income");
    }
}

class Laborer extends Coworker{
    int wages;
    int hours;

    Laborer(String name, String address, int division, int wages, int hours){
        super(name, address, division);
        this.wages = wages;
        this.hours = hours;
    }
    void display(){
        super.display();
        System.out.println("Wages: "+wages);
        System.out.println("Hours: "+hours);
    }
    
    void computingIncome(){
        System.out.println("Income: "+wages*hours);
    }
}

class Employee extends Coworker{
    int salary;

    Employee(String name, String address, int division, int salary){
        super(name, address, division);
        this.salary = salary;
    }
    void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
    void computingIncome(){
        System.out.println("Income: "+salary);
    
    }
}

public class que8_1 {
    public static void main(String args[]){
        Coworker c1 = new Coworker("John", "New York", 1);
        c1.display();
        c1.computingIncome();
        System.out.println();
        Laborer l1 = new Laborer("John", "New York", 1, 100, 10);
        l1.display();
        l1.computingIncome();
        System.out.println();
        Employee e1 = new Employee("John", "New York", 1, 1000);
        e1.display();
        e1.computingIncome();

        // Coworker[] c = new Coworker[3];
        // Coworker c2 = new Coworker("John", "New York", 1);
    }
}
