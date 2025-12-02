import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        boolean bool = true;
        double total = 0;
        while (bool){
            int price = Integer.parseInt(JOptionPane.showInputDialog("Input price [press 0 to stop] : "));
            total += price;
            if (price == 0){

                break;
            }else if (price < 0){
                price = Integer.parseInt(JOptionPane.showInputDialog("Invalid price!!\nInput price [press 0 to stop] : "));
            }


        }
        JOptionPane.showMessageDialog(null, "Total price is " + total + " baht.");
    }
}
