package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{
    public OpenNewAccount(String accID, double accBalance) {
        super(accID, accBalance);
    }
    public boolean isExistingAccount(){
        try{
            File file = new File(filename);
            if(!file.exists()) return false;
            Scanner sc = new Scanner(filename);
            String line;
            while ((line = sc.nextLine()) != null){
                String[] data = line.split(",");
                if(data[0].equals(accID)){
                    sc.close();
                    return true;
                }
            }
            sc.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    public String recordAccount(){
        try {
            if (isExistingAccount()){
                return "This account has been created!!";
            }
            FileWriter fw = new FileWriter(filename);
            fw.write(toString() + "\n");
            fw.close();
            return "Created account success!!";
        } catch (IOException e) {
            return "Error!!";
        }
    }

}
