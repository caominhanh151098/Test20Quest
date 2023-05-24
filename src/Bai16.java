package test20;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai16 {
    public static void main(String[] args) throws IOException {
        File path = new File("src\\test20\\dataBai16.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.printf("%s ", arr.get(i).get(j));
            System.out.println();
        }

        System.out.println(checkMax(arr));
    }

    public static int checkMax(List<List<Integer>> arr) {
        int max = -100;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = checkSum(arr, i, j);
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }

    public static int checkSum(List<List<Integer>> arr, int x, int y) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr.get(x).get(y + i) + arr.get(x + 2).get(y + i);
        }
        sum += arr.get(x + 1).get(y + 1);
        return sum;
    }

}
