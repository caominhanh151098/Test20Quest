package test20;

import java.util.Arrays;

public class Bai9 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println(Arrays.toString(sortArray(arrayNumber)));
    }
    public static int[] sortArray(int[] arr) {
        sortPositiveArray(arr);
        sortNegativeArray(arr);
        return arr;
    }


    public static int[] sortPositiveArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0)
                continue;
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < 0)
                    continue;
                if (arr[j] < arr[min])
                    min = j;
            }
            if (arr[min] < arr[i]) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
    public static int[] sortNegativeArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0)
                continue;
            int max = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > 0)
                    continue;
                if (arr[j] > arr[max])
                    max = j;
            }
            if (arr[max] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        return arr;
    }
}
