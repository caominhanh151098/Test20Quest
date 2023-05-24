package test20;

import java.util.Scanner;
import java.util.Stack;

public class Bai20 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(check(input));
        }

    }

    public static boolean check(String input) {
        Stack stack = new Stack();
        String[] ctr = input.split("");
        for (int i = 0; i < ctr.length; i++) {
            if (ctr[i].equals("{") || ctr[i].equals("(") || ctr[i].equals("[")) {
                stack.push(ctr[i]);
            }

            if (ctr[i].equals("}") || ctr[i].equals(")") || ctr[i].equals("]")) {
                String ctr1;
                if (!stack.isEmpty()) {
                    ctr1 = stack.pop().toString();
                }else return false;

                if (ctr[i].equals("}") && !ctr1.equals("{"))
                    return false;
                if (ctr[i].equals(")") && !ctr1.equals("("))
                    return false;
                if (ctr[i].equals("]") && !ctr1.equals("["))
                    return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
