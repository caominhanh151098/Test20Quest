package test20;

import java.util.Arrays;

public class Bai11 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));
        sortArray(arrayNumber);
        System.out.println(insertNumber(arrayNumber, 20, positionNumber(arrayNumber,20)));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
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

    public static int[] insertNumber(int[] arr, int number, int index) {
        int[] cloneArray = new int[arr.length + 1];
        for (int i = 0; i < cloneArray.length; i++) {
            if (i < index)
                cloneArray[i] = arr[i];
            else
                cloneArray[i] = number;
            if (i > index)
                cloneArray[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(cloneArray));
        return cloneArray;
    }

    public static int positionNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++)
            if (number < arr[i])
                return i;
        return -1;
    }
}
