import java.util.Scanner;

public class debug {

    public static void main(String[] args){
        int userChoice; // Holds the user's choice from the Main menu
        int checkoutChoice = 0; // Holds the user's choice when checking out a book
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Library! What would you like to do?");
        System.out.println("\n1.Checkout a Book" + "\n2.Check-in a Book" + "\n3.Mystery Choice" + "\n4.Request a tutor");

        userChoice = s.nextInt();

        if(userChoice < 1 || userChoice > 5) {
            System.out.println("That choice is not on the menu, try again next time");
        }
        else {switch (userChoice) {
            case 1:
                System.out.println("What Book would you like to Checkout?");
                System.out.println("\n1.History of Computer Science" + "\n2.Computer Science 2" +
                        "\n3.Even More Computer Science" +
                        "\n4.The Sequel to Computer Science" + "\n5.A List of Everything in the " +
                        "\n6.World that isn't a Computer");
                userChoice = s.nextInt();
                System.out.println("#" + userChoice + " is a great Choice!");
                break;
            case 2:
                System.out.println("Checking In. Is the book overdue?");
                System.out.println("\n1.Yes" + "\n2.No");
                int overDue = s.nextInt();
                if (overDue > 1 && overDue <= 2)
                    return;
                if (overDue == 1) {
                    System.out.println("You can pay your fine in community service or canned " +
                            "goods.");
                } else
                    System.out.println("Thank you for checking the book in on time.");


            case 3:
                System.out.println("Mysterious, isn't it?");

            case 4:
                System.out.println("A tutor will be with you shortly.");
                break;
            default:
                System.out.println("That choice is not on the menu, try again next time");
        }
        }


        System.out.println("Thanks for visiting your local library.");

    }
}
