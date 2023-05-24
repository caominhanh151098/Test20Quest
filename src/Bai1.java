package test20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, 100, 1000);
        System.out.println(Arrays.toString(arrayNumber));

        for (int i = 0 ; i < arrayNumber.length; i++) {
            int number = arrayNumber[i];
            if (checkNum(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean checkNum(int number) {
        while (number > 0) {
            if (number % 2 == 0)
                return false;
            number /= 10;
        }
        return true;
    }
}
