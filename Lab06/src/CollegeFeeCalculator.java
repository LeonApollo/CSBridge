import java.util.*;

public class CollegeFeeCalculator {


    // Constants
    //private static final int inState = 1;
    //private static final int outOfState = 2;
    // private static final int international = 3;
    //private static final int onCampus = 1;
    // private static final int offCampus = 2;
    //private static final int earhart = 1;
    //private static final int hillenbrand = 2;
    //private static final int owen = 3;
    //private static final int windsor = 4;




    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String residencyString = "";
        String housingString = "";
        String mealPlanString = "";
        System.out.println("Welcome to CollegeFeeCalculator!");
        System.out.println("Please enter your name");
        String userName = s.nextLine();
        System.out.println("Please enter the no. of credit hours");
        int creditHours = s.nextInt();

        if (creditHours < 1 || creditHours > 21) {
            return;
        }

        System.out.println("Please select the appropriate residency \n1. In-state \n2. Out-of_state \n3. International");
        int residency = s.nextInt();
            if (residency < 1 || residency > 3) {
                return;
            } else if ( residency == 1) {
                residencyString = "In-state";
            } else if (residency == 2) {
                residencyString = "Out-of-state";
            } else if (residency == 3) {
                residencyString = "International";
            }

        System.out.println("Please select your housing \n1.ON-Campus \n2.OFF-Campus");
        int housing = s.nextInt();
            if (housing < 1 || housing > 2) {
                return;
            } else {
                switch (housing) {
                    case 1:
                        System.out.println("Please select the residence hall");
                        System.out.println("\n1. Earhart \n2.Hillenbrand \n3.Owen \n4.Windsor");
                        int housing2 = s.nextInt();
                            if (housing2 < 1 || housing2 > 4) {
                                return;
                            } else if (housing2 == 1) {
                                housingString = "ON-Campus";
                            } else if (housing2 == 2) {
                                housingString = "ON-Campus";
                            } else if (housing2 == 3) {
                                housingString = "ON-Campus";
                            } else if (housing2 == 4){
                                housingString = "ON-Campus";
                            }
                        break;

                    case 2:
                        System.out.print("Please input your monthly rent:");
                        break;

                }
            }
            //s.nextInt();
        System.out.println("Are you purchasing a meal plan?");
        System.out.println("\n1. Yes \n2. No");
        int mealPlan = s.nextInt();
            if (mealPlan < 1 || mealPlan > 2) {
            return;
        } else if (mealPlan == 1) {
                mealPlanString = "Yes";
        } else if (mealPlan == 2) {
                mealPlanString = "No";
        }








       System.out.println("\nName: " + userName + "\nCredit Hours: " + creditHours + "\nResidency: " + residencyString + "\nHousing: " + housingString + "\nMeal Plan: " + mealPlanString);






        }                               //ignore these 2
    }

