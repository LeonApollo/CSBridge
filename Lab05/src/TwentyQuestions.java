import java.util.*;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Is it an Animal, Mineral, or Vegetable?");
        String answer1 = in.nextLine().toLowerCase();


        if (answer1.equalsIgnoreCase("animal")) {
            System.out.println("mammal?");
            String answer2 = in.nextLine().toLowerCase();
            if (answer2.equalsIgnoreCase("yes")) {
                System.out.print("Lives on Land?");
            }
            String answer3 = in.nextLine().toLowerCase();
            if (answer3.equalsIgnoreCase("yes")) {
                System.out.print("Human");
            }
            if (answer3.equalsIgnoreCase("no")) {
                System.out.print("Dolphin");
            }
            if (answer2.equalsIgnoreCase("no")) {
                System.out.print("Flies?");
            }
            String answer4 = in.nextLine().toLowerCase();
            if (answer4.equalsIgnoreCase("yes")) {
                System.out.print("Eagle");
            }
            if (answer4.equalsIgnoreCase("no")) {
                System.out.print("Lizard");
            }
        }


            if (answer1.equalsIgnoreCase("Mineral")) {
                System.out.println("Hardest mineral??");
                String answer5 = in.nextLine().toLowerCase();
                if (answer5.equalsIgnoreCase("yes")) {
                    System.out.print("Diamond");
                }
                if (answer5.equalsIgnoreCase("no")) {
                    System.out.print("Lead");
                }
            }


        if (answer1.equalsIgnoreCase("Vegetable")){
            System.out.println("Fruit?");
            String answer6 = in.nextLine().toLowerCase();
            if (answer6.equalsIgnoreCase("yes")){
                System.out.print("Grows on a vine?");
                String answer7 = in.nextLine().toLowerCase();
            if (answer7.equalsIgnoreCase("yes")) {
                System.out.print("Tomato");
            }
            if (answer7.equalsIgnoreCase("no")) {
                System.out.print("Peach");
            }}
            if (answer6.equalsIgnoreCase("no")){
                System.out.print("Tree?");
                String answer8 = in.nextLine().toLowerCase();
            if (answer8.equalsIgnoreCase("yes")){
                System.out.print("Maple Tree");}
            if (answer8.equalsIgnoreCase("no")){
                System.out.print("Potato");
            }
            }

                }
            }

            }







