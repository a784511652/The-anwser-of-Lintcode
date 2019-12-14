package com.example.demo.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiahaowei
 * @version 1.0
 * @description 给定一个文件的绝对路径(Unix - style)，请进行路径简化。
 * <p>
 * Unix中, . 表示当前目录, .. 表示父目录。
 * <p>
 * 结果必须以 / 开头，并且两个目录名之间有且只有一个 /。最后一个目录名(如果存在)后不能出现 / 。你需要保证结果是正确表示路径的最短的字符串。
 * @company 好未来-爱智康
 * @mobile 15822798805
 * @date 2019-12-07 14:43
 **/
public class Lintcode_421 {

    public String simplifyPath(String path) {
        String result = "/";
        String[] a = path.split("/+");
        List<String> paths = new ArrayList<>();
        for (String s : a) {
            if (s.equals("..")) {
                if (paths.size() > 0) {
                    paths.remove(paths.size() - 1);
                }
            } else if (!s.equals(".") && !s.equals("")) {
                paths.add(s);
            }
        }
        for (String s : paths) {
            result += s + "/";
        }
        if (result.length() > 1) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Lintcode_421 a = new Lintcode_421();
        System.out.println(a.simplifyPath("/a/./b/../../c/"));
    }
}
