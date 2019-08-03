import java.util.Scanner;

/**
 *GabbyMatthew, matthe50@purdue.edu, 08/01/19
 */

public class MathTools {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        /*Here are prompts and outputs for this lab. Build your program around them. */

        while(true) {


            System.out.println("#######################################");
            System.out.println("1 - Absolute Value");
            System.out.println("2 - Power");
            System.out.println("3 - Scientific Notation");
            System.out.println("4 - isPrime");
            System.out.print("Select a number from the menu choices: ");
            int answer1 = s.nextInt();
            if (answer1 > 4 || answer1 < 1) {
                return;
            } else {
                switch (answer1) {
                    case 1:
                        System.out.println("#######################################");
                        System.out.println("***Absolute Value***");
                        System.out.print("Enter the number: ");

                        double x = s.nextDouble();
                        if (x < 0)
                            x = -x;

                        System.out.println("Result:" + " " + x);
                        System.out.println("Return to the menu? (yes/no): ");
                        String menu = s.nextLine();

                        if (menu.equalsIgnoreCase("yes")) {
                            return;
                        }
                        if (menu.equalsIgnoreCase("no")) {
                            break;
                        }

                    case 2:
                        System.out.println("#######################################");
                        System.out.println("***Power***");
                        System.out.print("Enter the base: ");
                        double y = s.nextDouble();
                        System.out.print("Enter the exponent: ");
                        int z = s.nextInt();

                        double result = 1.0;

                        for (int i = 0; i < Math.abs(z); i++) {
                            result = result * y;
                        }

                        if (z < 0) {
                            result = 1 / result;
                        }

                        System.out.println("Result: " + result);


                    case 3:
                        System.out.print("#######################################");
                        System.out.print("Enter the number: ");
                        double number = s.nextDouble();

                        String result1 = "";
                        String result2 = "";


                        System.out.println("Result: " + result1 + " x 10 ^ " + result2);


                    case 4:
                        System.out.println("#######################################");
                        System.out.print("Enter the integer: ");
                        int prime = s.nextInt();

                        if (prime <= 0) {
                            System.out.println(prime + " is not Prime");
                        } else {
                            System.out.println(prime + " is Prime");
                        }
                }
            }
            System.out.print("Return to the menu? (yes/no): ");
            s.nextLine();
            String end = s.nextLine();
            if (end.equalsIgnoreCase("Yes")){
                continue;
            }
            else{
                break;
            }

        }
        //choice = s.nextInt();
        //System.out.println("#######################################");
        //System.out.println("***Absolute Value***");
        //System.out.print("Enter the number: ");
        //System.out.println("Result:" + " "  + /*your variable here*/);
        //System.out.println("***Power***");
        //System.out.print("Enter the base: ");
        //System.out.print("Enter the exponent: ");
        ////System.out.print("Enter the number: ");
        //System.out.println("Result: " + /*your variable here*/ + " x 10 ^ " + /*your variable here*/);
        //System.out.print("Enter the integer: ");
        //System.out.println(/*your variable here*/ + " is Prime");
        //System.out.println(/*your variable here*/ + " is not Prime");
        //System.out.println("Invalid option.");
        //System.out.print("Return to the menu? (yes/no): ");
        //System.out.println("Exiting MathToolsClient...");
    }
}
