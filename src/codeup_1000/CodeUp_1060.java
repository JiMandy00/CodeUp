package codeup_1000;

import java.util.Scanner;

public class CodeUp_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1&num2); // '&' : 자동으로 비트로 변환해서 계산

    }
}
