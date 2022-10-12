// 22 10 13 4주차 수업로그 참고
// 아침 수업시간에 했던 문제
// 데이터 가공하고 어쩌고...
// 이건 내가 풀었던 방식

package codeup_1000;

import java.util.Arrays;

class Max {
    int[][] arr;
    int max = 0;
    Max(int[][] arr) {
        this.arr = arr;
    }
    int getMax() {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

public class CodeUp_4596 {

    public static void main(String[] args) {
        int[][] arr = {
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80},
        };
        Max max = new Max(arr);

        System.out.println(max.getMax());
    }

}
