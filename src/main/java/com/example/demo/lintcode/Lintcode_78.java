package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 *
 * 哎惭愧  为了每天一个的诺言  今天这个写的有点low
 *
 * 思路：只拿第一个数组中的数据进行比较，无论第一个最长或者最短无影响，因为最顶最长公共受最短影响。
 * 然后与数组的另外数据进行同位置对比，b与数组的大小进行对比，如果相同则说明，是与全部数据进行了对比，反之说明直接跳出循环了。因此a就是相同的长度
 */

public class Lintcode_78 {

    public String longestCommonPrefix(String[] strs) {
        // write your code here

        if (strs.length == 0) {
            return "";
        }
        Integer a = 0;
        try {


            for (int i = 0; i < strs[0].length(); i++) {
                Character start = strs[0].charAt(i);
                int b = 0;
                for (int j = 1; j < strs.length; j++) {

                    if (!start.equals(strs[j].charAt(i))) {
                        break;
                    } else {
                        b++;
                    }
                }
                if (b == strs.length - 1) {
                    a++;
                }
            }
        } finally {
            return strs[0].substring(0, a);
        }
    }


}
