import java.util.*;

public class Debug {
    public static void main(String args[]) {
        //*Variable declarations *//*
        String word1; String word2; String word3;
        String word4;String word5;
        String name;

        //*Assignments*//*
        word1 = "Purdue University";
        word2 = "Pot-boiler";
        word3 = "Newsgroup";
        word4 = "sledgehammers";
        word5= "Countdowns";

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");

        name = scan.nextLine();

        System.out.println("Hello, " + name + "!");

        word2 = word2.substring(4, 10);
        word2 = word2.substring(0, 1).toUpperCase() + word2.substring(1);
        word3 = word3.substring(7, 8).toUpperCase() + word3.substring(8);
        word4 = word4.substring(6, 7).toUpperCase() + word4.substring(7, 12);
        word5 = word5.substring(5, 9);

        System.out.println("We are " + word1 + ", " + word2 + " " + word3 + " " + word4 + " " + word5);
    }
    }
