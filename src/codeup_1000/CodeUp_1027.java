package codeup_1000;

import java.util.Scanner;

public class CodeUp_1027 {
    public static void main(String[] args) {

        // 년원일을 yyyy.mm.dd로 받고
        // dd-mm-yyyy로 출력하자

        Scanner scr = new Scanner(System.in);

        String date = scr.nextLine();

        String[] dateArray = date.split("[.]");

        // for문으로 구현 하는 것 보다 sout로 표현하는 것이 깔끔할 것 같아서 변경
        /*for (int i=2; i>=0; i--) {
            System.out.print(dateArray[i]);
        }*/

        System.out.printf("%s-%s-%s", dateArray[2], dateArray[1], dateArray[0]);
    }
}
