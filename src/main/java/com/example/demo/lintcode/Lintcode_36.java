package com.example.demo.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 */

public class Lintcode_36 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if (m >= n || head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        for (int i = 1; i < m; i++) {
            head = head.next;
        }
        ListNode p_pre = head;
        ListNode p_end = head.next;

        // m<-->n 互换
        ListNode w1 = head.next;
        ListNode w2 = w1.next;
        for (int i = m; i < n; i++) {
            if (w2 == null) {
                return null;
            }
            ListNode temp = w2.next;
            w2.next = w1;
            w1 = w2;
            w2 = temp;
        }
        p_pre.next = w1;
        p_end.next = w2;
        return dummy.next;
    }

    private ListNode outlianbina(List<Integer> gaga) {

        if (gaga.isEmpty()) {
            return null;
        }
        ListNode first = new ListNode(gaga.get(0));
        ListNode head = outlianbina(gaga.subList(1, gaga.size()));
        first.next = head;
        return first;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Lintcode_36 a = new Lintcode_36();
        ListNode.print(a.reverseBetween(a.outlianbina(list), 1, 4));
    }

    public ListNode reverseBetween2(ListNode head, int m, int n) {
        if (m > n || head == null) {
            return null;
        }

        ListNode listNode = new ListNode(0);
        return new ListNode(0);
    }


}
