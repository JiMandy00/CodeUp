package codeup_1000;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1026 {
    public static void main(String[] args) {
        // 입력되는 시:분:초에서 분만 출력하기

        Scanner scr = new Scanner(System.in);

        String time = scr.nextLine();

        String[] timeString = time.split(":");

        //System.out.println(Arrays.toString(timeString));

        // String을 비교할 땐 .equals를 사용합니다.
        if (timeString[1].equals("00")) {
            System.out.println("0");
        } else {
            System.out.println(timeString[1]);
        }



    }
}
