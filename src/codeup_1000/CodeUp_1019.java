package codeup_1000;

import java.util.Scanner;

public class CodeUp_1019 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String date = scr.next();
        // .을 기준으로 split 할 때는 [.] 또는 \\. 을 사용한다.
        String[] arr = date.split("[.]");

        // 왜 안 됨?
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        // 무슨 의미?
        System.out.printf("%04d.%02d.%02d", a, b, c);
    }
}
