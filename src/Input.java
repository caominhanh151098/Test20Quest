package test20;

public class Input {
    public static void inputRandom(int[] arr, int min, int max) {
        for (int i = 0 ; i < arr.length;i ++) {
            arr[i] = (int) (Math.random() * (max - min)) + min;
        }
    }
}
