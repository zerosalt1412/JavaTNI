import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = Integer.parseInt(scanner.next());
        System.out.print("Enter number 2: ");
        double num2 = Integer.parseInt(scanner.next());

        DecimalFormat frm = new DecimalFormat("#,###.00");
        System.out.println("\nSummation = " + (num1 + num2));
        System.out.println("Summation = " + (num1 - num2));
        System.out.println("Summation = " + (num1 * num2));
        System.out.println("Summation = " + frm.format(num1 / num2));
        System.out.println("Summation = " + (num1 % num2));
    }

}

