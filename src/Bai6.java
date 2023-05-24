package test20;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        int[] arrayNumberA = new int[20];
        int[] arrayNumberB = {20,10,5};

        Input.inputRandom(arrayNumberA, 0, 30);
        System.out.println(Arrays.toString(arrayNumberA));
        System.out.println(Arrays.toString(arrayNumberB));
        String result = "Có";
        for (int number : arrayNumberB) {
            boolean cache = false;
            for (int i = 0; i < arrayNumberA.length; i++) {
                if (number == arrayNumberA[i]) {
                    cache = true;
                    break;
                }
            }
            if (cache == false) {
                result = "Không";
                break;
            }
        }

        System.out.println(result);
    }
}
