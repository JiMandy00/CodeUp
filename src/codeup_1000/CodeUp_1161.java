package codeup_1000;

import java.util.Scanner;

public class CodeUp_1161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1%2 != 0) {
            System.out.print("홀수+");
        } else {
            System.out.print("짝수+");
        }

        if (num2%2 != 0 ) {
            System.out.print("홀수=");
        } else {
            System.out.print("짝수=");
        }

        if ((num1+num2)%2 != 0) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
