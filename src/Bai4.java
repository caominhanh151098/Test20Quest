package test20;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));


        System.out.println(checkNum(arrayNumber) ? true : false);
    }

    public static boolean checkNum(int[] arr) {
        for (int number : arr) {
            if (number == 0)
                return true;

        }
        return false;
    }
}
