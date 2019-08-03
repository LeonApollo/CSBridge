import java.util.Scanner;

public class UserGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.nextLine();

        char firstChar = name.charAt(0);
        int startIndex = name.indexOf(" ") + 1;
        int stopIndex = name.length();
        String username = firstChar +

      name.substring(startIndex, stopIndex);
        username = username.toLowerCase();
        String email = username + "@purdue.edu";
        System.out.println(name);
        System.out.println("Usrname: " + username + "\nEmail: " + email);
    }
}
