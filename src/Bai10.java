package test20;

import java.util.Arrays;

public class Bai10 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[20];

        Input.inputRandom(arrayNumber, -50, 50);
        System.out.println(Arrays.toString(arrayNumber));
        insertNumber(arrayNumber, 40, 2);
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
}
