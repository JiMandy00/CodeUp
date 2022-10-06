package codeup_1000;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1023 {
    public static void main(String[] args) {
        // 실수 한개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
        Scanner scr = new Scanner(System.in);

        double num = scr.nextDouble();
        String str = Double.toString(num);
        // 입력값이 10000을 넘지 않으며 소수점 이하는 최대 6자리
        // 여기서 10000을 넘지 않으려면 9999 = 4자리 + 6자리 == 10자리라고 생각함
        // 근데 뭐가 안 풀려서 그냥 split로 변경

        // split은 조건을 기준으로 나눠서 배열에 저장
        // .을 기준으로 나누겠다고 선언하면 배열은 [0], [1]이 나옴
        // .을 기준으로 한다면 양 옆에 대괄호 []를 넣어줘야 합니다.
        String[] strArray = str.split("[.]");

        // 소수점을 기준으로 출력
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);


    }
}
