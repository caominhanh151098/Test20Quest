package test20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bai17 {
    public static void main(String[] args) throws IOException {
//        File path = new File("src\\test20\\dataBai16.txt");
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        bufferedReader.close();
        int N = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s%n", N, i, N*i);
        }
    }
}
