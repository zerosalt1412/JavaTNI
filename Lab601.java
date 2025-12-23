import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.print("Enter number" + (i + 1) + ": ");
            int num = sc.nextInt();
            while (num <= 0) {
                System.out.print("The number must be positive! Enter number again: ");
                num = sc.nextInt();
            }
            number[i] = num;
            i++;
        }
        System.out.print("\nList of even number: ");
        i=0;
        while (i<5){
            if (number[i] % 2 == 0){
                System.out.print(number[i] + " ");
            }
            i++;

        }
        System.out.print("\nList of odd number: ");
        i=0;
        while (i<5) {
            if (number[i] % 2 != 0) {
                System.out.print(number[i] + " ");
            }
            i++;
        }
    }



}
