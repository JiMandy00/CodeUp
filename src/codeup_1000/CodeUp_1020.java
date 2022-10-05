package codeup_1000;

import java.util.Scanner;

public class CodeUp_1020 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String num = scr.nextLine();

        // .replace("바꾸고 싶은 문자", "바꿀 문자");
        // .replaceAll("바꾸고 싶은 문자", "바꿀 문자");
        // 차이점?? All은 바꾸고 싶은 문자가 포함됨 문자열을 바꿔버린다.
        num = num.replace("-","");

        System.out.println(num);
    }
}
