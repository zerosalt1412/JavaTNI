package Banking;

public class BankAccount {
    protected String accID;
    protected double accBalance;

    protected final String filename = "src/Banking/users_account.txt";

    public BankAccount(String accID, double accBalance){
        this.accID = accID;
        this.accBalance = accBalance;
    }
    public BankAccount(String accID){
        this.accID = accID;
    }
    public BankAccount(){

    }
    public String getAccID(){
        return accID;
    }
    public double getAccBalance(){
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return accID + "," + accBalance;
    }
}
