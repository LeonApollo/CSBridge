/**
 * Bridge Session 02
 * Converting Fahrenheit and Celsius
 * @GabriellaMatthew, matthe50@purdue.edu, 07/29/19
 */
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        fahrenheit = s.nextDouble();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }
}
