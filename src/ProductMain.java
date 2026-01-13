import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        JOptionPane.showMessageDialog(null,"Welcome to Product stock system");
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock"));
        product.showInfo();
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to add more item?");
        if (confirm == 0);
        {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            product.addstock(amount);
        }
        int change = JOptionPane.showConfirmDialog(null,"Do you want to change price?");
        if (change == 0);
        {
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            product.changePrice(newPrice);
        }
        product.showInfo();


    }

}
