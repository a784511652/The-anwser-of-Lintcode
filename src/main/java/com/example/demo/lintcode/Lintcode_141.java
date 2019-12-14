package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @version 1.0
 * @description 描述
 * 中文
 * English
 * 实现 int sqrt(int x) 函数，计算并返回 x 的平方根。
 * <p>
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例 1:
 * 输入:  0
 * 输出: 0
 * <p>
 * <p>
 * 样例 2:
 * 输入: 3
 * 输出: 1
 * <p>
 * 样例解释：
 * 返回对x开根号后向下取整的结果。
 * <p>
 * 样例 3:
 * 输入: 4
 * 输出: 2
 * @company 好未来-爱智康
 * @mobile 15822798805
 * @date 2019-12-13 18:34
 **/
public class Lintcode_141 {


    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public static int sqrt(int x) {
        double a = 1d;
        while (Math.abs(a * a - x) > 0.00001) {
            a = (x / a + a) / 2;

        }
        return (int) a;


    }

    public static void main(String[] args) {
        sqrt(0);
    }
}
