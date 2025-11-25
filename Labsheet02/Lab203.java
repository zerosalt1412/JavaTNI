import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###.00");
        System.out.print("Enter product id  : ");
        String id = scanner.next();
        scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product item: ");
        int item = Integer.parseInt(scanner.next());
        System.out.print("Enter price per piece item: ");
        double price = Integer.parseInt(scanner.next());
        System.out.println("---------------------------------------------------");
        double total = item * price;

        System.out.println("Product name: " + name + " (" + id +")");
        System.out.println("Product item: " + item + " (" + price +" + baht/piece)");
        System.out.println("Total price : " + frm.format(total) + " bath");

    }
}
