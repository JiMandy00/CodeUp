package codeup_1000;

import java.util.Scanner;

public class CodeUp_1034 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String num8 = scr.nextLine();

        int num10 = Integer.parseInt(num8, 8);
        // num8이 8진수입니다. 이것 parseInt(10진수 int)로 변형해 주세요.

        System.out.println(num10);

    }
}
