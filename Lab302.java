import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.)"));

        int male = JOptionPane.showConfirmDialog(null, "\nAre your biological gender is Male?", "Gender", JOptionPane.YES_NO_OPTION);
        if (male == 0) { //if (JOptionPane.YES_OPTION)

            int weight = height - 100;

            JOptionPane.showMessageDialog(null, "Hello, Mr. " + name + "\nif your height is" +
                    height + "cm. " + "\nYour weight should be " + weight + " kg.");
        } else {
            if (male == 1) {
                int female = JOptionPane.showConfirmDialog(null, "\nAre your biological gender is Female?", "Gender", JOptionPane.YES_NO_OPTION);
                if (female == 0) {
                    int weight = height - 110;

                    JOptionPane.showMessageDialog(null, "Hello, Mrs. " + name + "\nif your height is" +
                            height + "cm. " + "\nYour weight should be " + weight + " kg.");
                }else {
                    JOptionPane.showMessageDialog(null, "You can use BMI to measure your weight and height.");
                }
            }


        }


    }

}