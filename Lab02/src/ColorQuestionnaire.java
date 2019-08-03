import javax.swing.*;
public class ColorQuestionnaire {

        public static void main(String[] args) {
            String color;
            String response;

            color = JOptionPane.showInputDialog("What is your favorite color?");

            response = "Nice! I think "+ color + " is a great color too";
            JOptionPane.showMessageDialog(null, response);
        }
}
