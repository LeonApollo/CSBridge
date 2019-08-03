import java.util.Scanner;

public class sumArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


//array1
    int length1= s.nextInt();
        int[] values = new int[length1];

        for (int i = 0; i < values.length; i++){
            int num1 = s.nextInt();
            values[i] = num1;
        }



//array2
    int length2 = s.nextInt();
        int[] values1 = new int[length2];

        for(int i = 0; i < values1.length; i++) {
            int num2 = s.nextInt();
            values1[i] = num2;
        }



//array3
        int[] values2 = new int[10];

        for (int i = 0; i < values.length; i++) {
            values2[i] = values[i];
        }

        for (int i = 0; i < values1.length; i++) {
            values2[values2.length-1-i] = values1[i] + values2[values2.length-1-i];
        }

        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i]);
        }

    }
}