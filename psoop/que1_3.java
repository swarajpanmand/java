package psoop;
import java.util.ArrayList;
import java.util.Scanner;

class Shopping {
    int codeNumber;
    String name;
    double price;

    Shopping(int codeNumber, String name, double price) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Code: " + codeNumber);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class que1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shopping> items = new ArrayList<>();
        int k = 1;

        while (k == 1) {
            System.out.println("1. Add Item\n2. Display Item\n3. Delete Item");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the code of the item: ");
                    int codeNumber = sc.nextInt();
                    System.out.println("Enter the name of the item: ");
                    String name = sc.next();
                    System.out.println("Enter the price of the item: ");
                    double price = sc.nextDouble();
                    items.add(new Shopping(codeNumber, name, price));
                    break;
                case 2:
                    System.out.println("Enter the code of the item you want to buy: ");
                    int codeNumber2 = sc.nextInt();
                    boolean found = false;
                    for (Shopping item : items) {
                        if (item.codeNumber == codeNumber2) {
                            item.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the code of the item you want to delete: ");
                    int codeNumber1 = sc.nextInt();
                    boolean deleted = false;
                    for (int i = 0; i < items.size(); i++) {
                        if (items.get(i).codeNumber == codeNumber1) {
                            items.remove(i);
                            System.out.println("Item deleted");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Item not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (1/0)");
            k = sc.nextInt();
        }
    }
}
