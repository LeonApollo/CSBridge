import java.util.*;
import java.io.*;

public class ArrayChallenge {

    //part 1
    public static int[] increaseOddValues(int[] array) {

        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] % 2 == 1) {
                array[i] = 1 + array[i];
            }
        }

        return array;

    }


    //part 2
    public static int [] increaseOddIndices(int [] array) {

        for (int i = 0; i < array.length; i = i + 1) {
            if (i % 2 == 1) {
                array[i] = 1 + array[i];
            }
        }

        return array;

    }



    public static void main(String args[]) {

        //Main method is empty. Please use to test your code, as needed.

    }
}