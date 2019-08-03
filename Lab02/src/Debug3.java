import java.util.*;
import javax.swing.*;

public class Debug3 {
    public static void main(String[] args){
        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("Enter your first name: ");
        lastName = JOptionPane.showInputDialog("Enter your last name: ");

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
    }
}