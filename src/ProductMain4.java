import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product... products){
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("-----------------------------------------");
        Product[] products = new Product[4];
        setting_product(products);

        for(int i = 0; i < products.length;i++){
            System.out.println((i + 1) + ". " + products[i].name
                    + " (" + products[i].quantity + " item)");

        }
        System.out.println("-----------------------------------------");
        int choice;
        do {
            System.out.print("Enter a number: ");
            choice = sc.nextInt();
        }while (choice < 1 || choice > products.length);
        Product selected = products[choice];
        System.out.print("Invalid!! Enter a number: ");
        int amount = sc.nextInt();
        selected.sell(amount);
        selected.showInfo();



    }
}

