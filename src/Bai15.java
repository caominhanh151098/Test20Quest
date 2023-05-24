package test20;

import java.util.Arrays;

public class Bai15 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, 0, 10);
        System.out.println(Arrays.toString(arrayNumber));
        doSomething(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }

    public static void doSomething(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = i; j > 0; j--)
                    arr[j] = arr[j - 1];
                arr[0] = 1;
            }
        }
    }
}
