package codeup_1000;

import java.util.Scanner;

public class CodeUp_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();

        System.out.println(num1 | num2); // '|' : 두 정수를 비트단위로 or 연산 후 그 결과를 정수로 출력

    }
}

