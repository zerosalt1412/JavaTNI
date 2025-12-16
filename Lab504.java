import java.util.Scanner;

public class Lab504 {
    public static boolean check_password(String pass) {
        if(pass.length() < 8);
        return false;
    }

    public static boolean check_password (String pass, String confirm_pass){
        return pass.equals(confirm_pass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, confirm;
        while (true){
            System.out.print("Create pasword: ");
            password = sc.nextLine();
            if (check_password(password)){
                break;
            }
            else
                System.out.print("Invalid Password! Create password" + password);
        }
        while (true){
            System.out.print("\nEnter confirm password: ");
            confirm = sc.nextLine();
            if (check_password(password, confirm)){
                break;
            }
            else
                System.out.println("Password do not match! Enter confirm password: " + confirm);
        }
        System.out.println("\nPassword set successfully!!");
    }

}
