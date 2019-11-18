package com.example.demo.lintcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jiahaowei
 * @date 2019-05-30 15:30
 **/
public class Lintcode_91 {

    public static int MinAdjustmentCost(List<Integer> A, int target) {
        // write your code here

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.size() - 1; i++) {

            list.add(A.get(i) - A.get(i - 1));
        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= list.size(); i++) {
            if (list.get(i) > target) {
                map.put(list.get(i), i);
            }
        }


      /*  for (int i = 0; i < A.size()- ; i++) {

        }*/



        return 1;
    }



    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(3);
        a.add(5);
        a.add(4);
        a.add(7);

        System.out.println(MinAdjustmentCost(a,2));



    }
}
