import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to in put :");
        int num0=0,min=0,max=0,even=0,odd=0;
        int num = scanner.nextInt();

        for (int i = 1; i<=num;i++) {
            System.out.print("Enter number " + i + " : ");
            num0 = scanner.nextInt();
            if (num0 < max){
                max = num0;

            }if (num0 > min){
                min = num0;

            }if (num0%2== 0){
                even++;

            }if (num0%2!= 0){
                odd++;

            }

        }
        System.out.println("\n\nMaximum = " + max + "\nMinimum = " + min + "\nEven number = " + even + "\nOdd number = " + odd);


    }
}
