package com.example.demo.lintcode;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author jiahaowei
 * @version 1.0
 * @description 给一个单词列表，求出这个列表中出现频次最高的K个单词。
 * 输入:
 * [
 * "yes", "lint", "code",
 * "yes", "code", "baby",
 * "you", "baby", "chrome",
 * "safari", "lint", "code",
 * "body", "lint", "code"
 * ]
 * k = 3
 * 输出: ["code", "lint", "baby"]
 * @company 好未来-爱智康
 * @mobile 15822798805
 * @date 2019-11-25 14:31
 **/
public class LintCode_471 {


    public String[] topKFrequentWords(String[] words, int k) {
        Map<String, Long> b = Arrays.asList(words).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        sortByValueAscending(b).keySet().toArray();

        return (String[]) Arrays.copyOfRange(sortByValueAscending(b).keySet().toArray(), 0, k);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueAscending(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            int compare = (o2.getValue()).compareTo(o1.getValue());
            return compare;
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
