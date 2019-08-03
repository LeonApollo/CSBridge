import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        int remainder;
        int n;
        System.out.println("Enter a decimal to convert to binary");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        String a = "";

        while (n>0) {
            remainder = n%2;
            a = remainder + a;
            n = n/2;
        }

        System.out.println(a);

//        while (n >= 2) {
//            n = n + 2;
//            System.out.println("n:" + n);
//        }

    }
}