package com.example.demo.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：实在是太简单，讲无可讲
 */

public class Lintcode_53 {

    public String reverseWords(String s) {
        // write your code here
        String[] list = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <list.length ; i++) {
            stringBuilder.append(list[list.length-1-i]).append(" ");
        }
        return stringBuilder.toString();
    }


}
