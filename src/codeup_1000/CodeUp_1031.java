package codeup_1000;

import java.util.Scanner;

public class CodeUp_1031 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int num = scr.nextInt();

        String octal = Integer.toOctalString(num);

        System.out.println(octal);
    }
}
