package test20;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));

        String result = "Có";
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            if (arrayNumber[i] < arrayNumber[i + 1])
                result = "Không";
        }

        System.out.println(result);
    }
}
