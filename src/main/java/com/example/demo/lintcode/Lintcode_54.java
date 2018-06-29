package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 *
 * 这个虽然是个困难题 但是对java来说  或者对我这种写法来说，毕竟我这花费了4000ms
 * 如果有大佬看见请加784511652   给我留下一个更好的答案
 */
public class Lintcode_54 {

    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        }
        if (str.charAt(0) == '-') {
            i++;
            flag = '-';
        }
        double res = 0;
        while (i < str.length() && str.charAt(i) <= '9' && str.charAt(i) >= '0') {
            res = res * 10 + str.charAt(i) - '0';
            i++;
        }
        if (flag == '-') {
            res = -1 * res;
        }
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;

    }


}
