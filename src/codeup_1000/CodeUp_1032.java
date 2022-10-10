package codeup_1000;

import java.util.Scanner;

public class CodeUp_1032 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int num = scr.nextInt();

        String hex = Integer.toHexString(num);

        System.out.println(hex);
    }
}
