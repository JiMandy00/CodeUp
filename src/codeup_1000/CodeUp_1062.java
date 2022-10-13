package codeup_1000;

import java.util.Scanner;

public class CodeUp_1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();

        System.out.println(num1 ^ num2);
        // '^' : 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력

    }
}
