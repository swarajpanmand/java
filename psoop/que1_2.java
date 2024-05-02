package psoop;


class Bank{
    String name;
    int accNumber;
    String type;
    double balance;

    Bank(String name, int accNumber, String type){
        this.name = name;
        this.accNumber = accNumber;
        this.type = type;
        this.balance = 0;
    }

    void deposit(double amount){
        this.balance += amount;
    }
    void withdraw(double amount){
        if (this.balance - amount < 0){
            System.out.println("Insufficient balance");
        }
        else{
            this.balance -= amount;
        }
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }
}
public class que1_2 {
    public static void main(String[] args){
        Bank b = new Bank("John", 1234, "Savings");
        b.deposit(1000);
        b.withdraw(500);
        b.display();
    }
}
