package com.example.demo.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 *
 * 这道题目求最大长度，首先我们记录每个数字出现的位置，然后去记录他的最大不同字符的长度。
 * 当出现重复的时候，我们就拿下面这个举例子。当a这个重复出现的时候，我们从map中的到a这个
 * 字符的初始位置是小于我们的start的这时候我们是不用管的。只有它在我们maxLength这个范围
 * 里面的时候我们会把a的下一个位置重新定义为start，然后再次去计算maxLength，知道循环的
 * 次数减去start+1（因为从0开始  要+1）大于原有maxLength重新更新它的值。
 *
 *
 *            开始
 * ------------a|-------------|a---------------
 *
 *             开始
 * ------------|-------a------|a---------------
 *
 *                    ↓
 *                      新开始的位置
 * ------------|-------a|------|a---------------
 *
 */
public class Lintcode_384 {
    public int lengthOfLongestSubstring(String s) {
        // write your code here

        Map<Character,Integer> lastOccurred = new HashMap<>();
        Integer maxLength = 0;
        Integer start = 0;

        for (int i = 0; i <s.length() ; i++) {
            if (lastOccurred.get(s.charAt(i))!=null&&lastOccurred.get(s.charAt(i))>=start){
                start = lastOccurred.get(s.charAt(i))+1;
            }
            if (i-start+1>maxLength ){
                maxLength = i-start+1;
            }
            lastOccurred.put(s.charAt(i),i);
        }
        return maxLength;
    }
}
