import java.util.*;
import javax.swing.*;

public class TaskOneChallenge {
    public static void main(String[] args){
        String fullName;        //enter your name after initial Welcome
        String greeting;        //Hello [full name] !
        String lastName;
        String className;
        int classAmount;
        int cookieAmount;
        int result;
        int result2;
        double result3;

        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Class Cookie Calculator!");

        System.out.println("Please enter your full name:");
        fullName = scan.nextLine();


        int startIndex = fullName.indexOf(" ") + 1;
        int stopIndex = fullName.length();
        lastName = fullName.substring(startIndex, stopIndex);
        //System.out.println(lastName);


        greeting = "Hello Dr. " +lastName+ " !";
        System.out.println(greeting);


        System.out.print("Enter the name of the class you want to calculate:");
        className = scan.nextLine();

        System.out.print("How many students are in the class?");
        classAmount = scan.nextInt();

        System.out.print("How many cookies do you have?");
        cookieAmount = scan.nextInt();

        result = cookieAmount/classAmount;
        //System.out.println(result);

        result2 = cookieAmount%classAmount;




        System.out.println("Finished calculating, Dr."+ lastName +"!");

        System.out.println("Each " + className + " student will get "+ result +" cookies if each student wants a whole cookie, with " + result2 +" left over!");

        result3 = (double) cookieAmount/classAmount;

        System.out.printf("Each " + className + " student will get %.2f cookies if students are willing to split cookies!", result3);

    }
}
