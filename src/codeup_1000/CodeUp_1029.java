package codeup_1000;

import java.util.Scanner;

public class CodeUp_1029 {
    public static void main(String[] args) {
        // 실수를 입력받아 출력하자

        Scanner scr = new Scanner(System.in);

        double num = scr.nextDouble();

        // format함수
        // %.011f == 소수점 11번째까지 나타냄
        System.out.println(String.format("%.011f", num));
    }
}
