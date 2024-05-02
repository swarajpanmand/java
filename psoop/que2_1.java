// In Java, `ArrayList`, `Collections`, and `Comparator` are part of the Java Collections Framework, which provides a set of classes and interfaces to handle collections of objects. Let's briefly describe each of them: 1. **ArrayList**: `ArrayList` is a resizable array implementation of the List interface. It allows dynamic resizing of the array as elements are added or removed. It provides methods to add, remove, access, and manipulate elements. 2. **Collections**: `Collections` is a utility class in Java that consists of static methods which operate on collections. It provides methods to perform various operations such as sorting, searching, shuffling, reversing, etc., on collections like `ArrayList`, `LinkedList`, etc.
//  3. **Comparator**: `Comparator` is an interface in Java that defines a comparison function that can be used to compare objects. It allows you to sort objects based on custom criteria. It provides a method `compare(T o1, T o2)` to compare two objects. The combination of these classes/interfaces allows you to work efficiently with collections of objects in Java. For example, you can use `ArrayList` to store a list of objects, `Collections` to sort or perform other operations on these collections, and `Comparator` to define custom sorting criteria. These classes/interfaces are part of the Java Standard Library, so you don't need to import any additional libraries to use them in your Java programs.

package psoop;

import java.util.*;

class Employee{
    int age;
    String name;
    double salary;

    Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    double getSalary(){
        return salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

    public static void printSorted(ArrayList<Employee> employees){
        Collections.sort(employees, Comparator.comparingInt(Employee::getAge));
        for(Employee employee: employees){
            employee.display();
        }
    }

}

class que2_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 50000.0));
        employees.add(new Employee("Jane", 30, 60000.0));
        employees.add(new Employee("Jack", 35, 70000.0));
        employees.add(new Employee("Jill", 40, 80000.0));
        employees.add(new Employee("James", 45, 90000.0));
        employees.add(new Employee("Jenny", 50, 100000.0));
        employees.add(new Employee("Jared", 55, 110000.0));
        employees.add(new Employee("Jasmine", 60, 120000.0));
    
        Employee.printSorted(employees);
    }
}