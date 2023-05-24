package test20;

import java.util.Arrays;

public class Bai14 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -10, 10);
        System.out.println(Arrays.toString(arrayNumber));
        doSomething(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }

    public static void doSomething(int[] arr) {
        int[] arrNumber = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (contain(arrNumber, arr[i])) {
                for (int k = i; k < arr.length - 1; k++)
                    arr[k] = arr[k+1];
                arr[arr.length-1] = 0;
            }
            if (!contain(arrNumber, arr[i]))
                arrNumber[j++] = arr[i];
        }
    }

    public static boolean contain(int[] arr, int number) {
        for (int element : arr) {
            if (element == number)
                return true;
        }
        return false;
    }
}
