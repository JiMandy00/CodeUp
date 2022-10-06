package codeup_1000;

import java.util.Scanner;

public class CodeUp_1024 {
    public static void main(String[] args) {
        // 단어 1개를 입력 받는다.
        // 입력 받은 단어의 각 문자를 한 줄에 한 문자씩 분리해서 출력한다.

        Scanner scr = new Scanner(System.in);

        String string = scr.nextLine();

        String[] stringArray = string.split("");

        for (int i=0; i<stringArray.length; i++) {
            System.out.println("'" + stringArray[i] + "'");
        }
    }
}
