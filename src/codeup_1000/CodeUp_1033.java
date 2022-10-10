package codeup_1000;

import java.util.Scanner;

public class CodeUp_1033 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int num = scr.nextInt();

        String hex = Integer.toHexString(num);

        String hex_upper = hex.toUpperCase();

        System.out.println(hex_upper);
    }
}
