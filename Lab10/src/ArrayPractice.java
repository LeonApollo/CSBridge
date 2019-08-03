import java.util.Scanner;

public class ArrayPractice {
    public static void main(String args[]) {
        double [] data = {18.3, 61.1, 80.9, 87.9, 43.0, 36.2, 8.6};
        double average = 0.0;

        Scanner s = new Scanner(System.in);


        for (int i = 0; i < data.length; i++) {
            average += data[i];
        }

        average = average/data.length;


        System.out.printf("Average = %f\n", average);
    }
}
