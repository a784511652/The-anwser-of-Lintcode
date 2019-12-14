package com.example.demo.lintcode;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 * <p>
 * 哎惭愧  为了每天一个的诺言  今天这个写的有点low  回头有时间再进行优化
 * <p>
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

    public static String longestCommonPrefix2(String[] strs) {
        if (ObjectUtils.isEmpty(strs)) {
            return "";
        }

        String a = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length() && j < a.length() && strs[i].charAt(j) == a.charAt(j)) {
                j++;
            }

            if (j == 0) {
                return "";
            }

            a = a.substring(0, j);
        }
        return a;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "dog,dox,car";
        System.out.println(longestCommonPrefix2(a.split(",")));


        String b = URLDecoder.decode("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxa99aef01c42d0ea5&redirect_uri=https://beta-izk-wx.izhikang.com/wxredirect/pay/wxa99aef01c42d0ea5&response_type=code&scope=snsapi_base&state=key%3D%3Dpay%3BredirectUrl%3D%3Dhttp%25253A%25252F%25252F10%2E25%2E40%2E222%25253A9000%25252Fh5pay%25252Findex%2Ehtml%25253ForderId%25253D20191212181856770011000000890207%252526type%25253D0%252526timestamp%25253D1576145971355&connect_redirect=1#wechat_redirect","UTF-8" );
        System.out.println(b);


    }

}
