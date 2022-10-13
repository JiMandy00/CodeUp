package codeup_1000;

import java.util.Scanner;

public class CodeUp_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long num3 = sc.nextInt();

        System.out.println((num1 < num2 ? num1 : num2) < num3 ? (num1 < num2 ? num1 : num2) : num3);
    }
}
