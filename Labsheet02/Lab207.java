import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        double TAX = 7.50, tax_rate = 0.15;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        String name = (JOptionPane.showInputDialog("Enter employee name: "));
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee: "));
        double total = hour * TAX, totalTax = total * tax_rate, earn = total - totalTax;

        JOptionPane.showMessageDialog(null,
                String.format("Employee name: " + name +
                        "\nHour worked: " + hour +
                        "\nHourly wage: " + "$" + frm.format(TAX) + "\nGross earnings: " + "$" + frm.format(total)
                + "\nTax rate: " + tax_rate + "\nTax: " + "$" + frm.format(totalTax) + "\nNet earning: " +"$" + frm.format(earn)));
    }
}
