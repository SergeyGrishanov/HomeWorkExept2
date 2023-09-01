package work2;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new Random().nextInt(0, 10);
            
        }
        System.out.println(Arrays.toString(intArray));
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }         
    }
}