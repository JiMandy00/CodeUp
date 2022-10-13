package codeup_1000;

import java.util.Scanner;

public class CodeUp_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long jumsu = sc.nextInt();


        if (jumsu >= 90) {
            System.out.println("A");
        } else if (jumsu >= 70) {
            System.out.println("B");
        } else if (jumsu >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}