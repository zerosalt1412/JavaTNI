import javax.swing.*;
import java.util.Locale;

public class Lab401 {
    public static void main(String[] args) {
        Boolean bool = true;



            String name = (JOptionPane.showInputDialog(null,"Enter your full name: "));
            name= name.trim();
            String part[] = name.split(" ");

            while (part.length<2) {
                name = (JOptionPane.showInputDialog(null, "Enter your full name: "));
                part = name.split(" ");
                if (name == null) break;



            }
            int space = name.indexOf(" ");
        String first = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String last = name.substring(space + 1).toUpperCase();
        JOptionPane.showMessageDialog(null, "Welcome, " + first + " ");





    }
}
