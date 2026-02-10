package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner sc = new Scanner(System.in);
    public static Espresso orderEspresso(){
        System.out.print("Enter a size : ");
        String size = sc.next();
        Espresso order1 = new Espresso(size);
        System.out.print("press 'y' or 'Y' for adding a shot");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("Y")){
            System.out.print("How many shots for adding in Espresso : ");
            int add = sc.nextInt();
            order1.addShot(add);
        }
        return order1;
    }
    public static Frappuccino orderFrappuccino() {
        boolean whipped;

        System.out.print("Enter a size : ");
        String size = sc.next();


        System.out.print("Do you would like to add whipped cream [y/Y]?");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            whipped = true;

        }
        else whipped = false;
        Frappuccino order2 = new Frappuccino(size,whipped);
        return order2;
    }

    public static void main(String[] args) {
        int order1 = 0;
        int order2 = 0;
        int total = 0;
        while(true){
            System.out.print("Press 1 for ordering Espresso \nPress 2 for ordering Frappuccino");
            int menu = sc.nextInt();
            if (menu == 1){
                Espresso e = orderEspresso();
                System.out.println(e);
                order1++;
                total += e.calculateFinalPrice();
            }
        }
    }

}
