package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @date 2019/3/30 7:07 PM
 **/
public class Lintcode_532 {


    /**
     * 第一次提交 处理时间超时  处理思想 强行算 两两比较
     * @param A
     * @return
     */
    public static long reversePairsFirst(int[] A) {
        // write your code here

        int a = 0;

        int b = 1;

        Long result = 0L;
        int y = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int x = 0; x < A.length - (y + 1); x++) {

                if (b + 1 > A.length) {
                    break;
                }
                if (A[b] < A[a]) {
                    System.out.println(String.valueOf(A[a]) + "   " + String.valueOf(A[b]));
                    result++;
                }
                b = b + 1;
            }
            a = a + 1;
            b = a + 1;
            y = y + 1;

        }

        return result;

    }


    public static void main(String[] args) {
        int[] a = {2, 4, 1, 3, 5};
        System.out.println(reversePairsFirst(a));
    }
}
