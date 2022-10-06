package codeup_1000;

import java.util.Scanner;

public class CodeUp_1025 {
    public static void main(String[] args) {
        // 다섯자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.

        Scanner scr = new Scanner(System.in);

        int num = scr.nextInt();
        String numToString = Integer.toString(num);

        String[] nums = numToString.split("");

        // String zero = "0";

        // 반복문을 통한 것은 포기..! sout로 시도
/*        for (int i=0; i<nums.length; i++) {
            // String repeated = zero.repeat(nums.length-i);
            System.out.println(nums[i] + "0".repeat(nums.length-i));
        }*/

        // 나영님 코드 참고해서 이중 for문을 사용 가능하다!!
        // repeat을 다시 찾아봐서 내가 구현한 for문이 사용 가능한지 알아봐야겠다.
        /*import java.util.Scanner;

        public class Codeup_1025 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String a = sc.next();
                char[] A = a.toCharArray();

                for (int i = 0; i<A.length; i++){
                    System.out.print("["+A[i]);
                    for (int j = A.length; j > i; j--){
                        System.out.print("0");
                    }
                    System.out.println("]\n");
                }
            }
        }*/

        System.out.println("[" + nums[0] + "0000]");
        System.out.println("[" + nums[1] + "000]");
        System.out.println("[" + nums[2] + "00]");
        System.out.println("[" + nums[3] + "0]");
        System.out.println("[" + nums[4] + "]");

    }
}
