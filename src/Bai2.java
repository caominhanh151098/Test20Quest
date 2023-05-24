package test20;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, 100, 1000);
        System.out.println(Arrays.toString(arrayNumber));

        for (int i = 0; i < arrayNumber.length; i++) {
            if (checkPrimeNum(arrayNumber[i]))
                System.out.println(arrayNumber[i]);
        }
    }

    public static boolean checkPrimeNum(int number) {
        if (number == 1)
            return false;
        if (number == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
