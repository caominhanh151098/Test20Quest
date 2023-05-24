package test20;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, 100, 1000);
        System.out.println(Arrays.toString(arrayNumber));

        int count = 0;
        for (int number : arrayNumber) {
            if (number % 10 == 5)
                count++;
        }

        System.out.println(count);
    }
}
