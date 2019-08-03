import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){
        int days = 0;
        int month = 0;

        Scanner in = new Scanner(System.in);
        month = in.nextInt();

        switch (month){
        case 1: days = 31; break;
        case 2: days = 29; break;
        case 3: days = 31; break;
        case 4: days = 30; break;
        case 5: days = 31; break;
        case 6: days = 30; break;
        case 7: days = 31; break;
        case 8: days = 31; break;
        case 9: days = 30; break;
        case 10: days = 31; break;
        case 11: days = 30; break;
        case 12: days = 31; break;
        default: days = 0; break;
    }
    System.out.print(days);
}}
