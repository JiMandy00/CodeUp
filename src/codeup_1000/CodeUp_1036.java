package codeup_1000;
// 영문자 1개를 입력받아 아스키 코드표의 10진수 값을 출력

import java.util.Scanner;

public class CodeUp_1036 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        char letter = scr.next().charAt(0);

        System.out.println((int)letter);
    }
}
