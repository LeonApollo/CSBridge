import java.util.*;

public class reverseNumber {
    public static void main(String[] args){

        int storage;

        System.out.println("Input a number to reverse");
        Scanner in = new Scanner(System.in);
        storage = in.nextInt();

        String a = "" + storage;
        String reverse = "";

        for (int i = a.length()-1; i >= 0 ; i--) {
            reverse = reverse + a.charAt(i);
        }
        System.out.println(reverse);


    }
}
