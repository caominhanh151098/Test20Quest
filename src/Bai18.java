package test20;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "Helloworld";
        int start = 3;
        int end = 7;

        String result = S.substring(start,end);
        System.out.println(result);
    }
}
