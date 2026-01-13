import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop");
        System.out.println("-----------------------------------------");
        System.out.println("Press [1] to buy Pen" + "\nPress [2] to buy Notebook");
        int choice;
        do{
            System.out.print("Enter a number: ");
            choice = sc.nextInt();
        }while (choice != 1 && choice != 2);
            Product selected = (choice == 1 )? product1 : product2;
            selected.showInfo();
        System.out.println("-----------------------------------------");
            System.out.print("How many quantity to buy? ");
            int amount = sc.nextInt();
            selected.sell(amount);
        System.out.println("-----------------------------------------");
        selected.showInfo();


    }

}
