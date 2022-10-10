package codeup_1000;
// 16진수로 입력된 정수 1개를 8진수로 변경

import java.util.Scanner;

public class CodeUp_1035 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String num16 = scr.nextLine();

        int num8 = Integer.parseInt(num16, 16);
        // num16이 16진수입니다. 8진수로 변경해 주세요.

        System.out.printf("%o", num8);
    }
}
