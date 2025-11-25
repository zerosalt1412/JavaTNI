import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Enter minutes: "));
        int hour = min / 60;
        int minute = min % 60;
        JOptionPane.showMessageDialog(null, min + "minutes is " + hour + " hour"
                + minute + " minute");
    }
}
