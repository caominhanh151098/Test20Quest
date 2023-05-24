package test20;

import java.util.Arrays;

public class Bai8 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, 0, 100);
        System.out.println(Arrays.toString(arrayNumber));

        System.out.println(Arrays.toString(sortArray(arrayNumber)));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0)
                continue;
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] % 2 == 0)
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
}
