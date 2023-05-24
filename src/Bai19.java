package test20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String listNumber = scanner.nextLine();
        String[] arrNumber = listNumber.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String number : arrNumber)
            list.add(Integer.parseInt(number));
        int sizeQ = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizeQ; i++) {
            String quest = scanner.nextLine();
            if (quest.equals("Delete")) {
                int index = Integer.parseInt(scanner.nextLine());
                list.remove(index);
            } else if (quest.equals("Insert")) {
                String[] job = scanner.nextLine().split(" ");
                int index = Integer.parseInt(job[0]);
                int number = Integer.parseInt(job[1]);
                list.add(index, number);
            }
        }
        for (int number : list)
            System.out.print(number + " ");

    }
}
