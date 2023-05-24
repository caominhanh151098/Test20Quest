package test20;

import java.util.Arrays;

public class Bai12 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));
        doSomething(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));

    }

    public static void doSomething(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                arr[arr.length - 1] = 0;
                i--;
            }
        }
    }
}
