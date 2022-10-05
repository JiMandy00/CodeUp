package codeup_1000;

import java.util.Scanner;

public class CodeUp_1012 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        float x = scr.nextFloat();

        // 컴파일이 오류가 나는데...
        // System.out.println(x);

        // 이렇게 하니까 되네..?
        System.out.printf("%f", x);
    }
}
