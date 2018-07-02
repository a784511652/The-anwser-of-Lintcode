package com.example.demo.lintcode;

import lombok.Data;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 * <p>
 * 简单题  核心思想是递归的调用。
 * <p>
 * <p>
 * 1 → 2 → 3 → 4 → 5 → null
 * <p>
 * null ← 1 ← 2 ← 3 ← 4 ← 5
 * <p>
 * 相当于从五开始  不断的更换数值指向null
 */
@Data
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.getVal()+"→");
            node = node.getNext();
        }
        System.out.print("null");
        System.out.println();
    }
}

public class Lintcode_35 {


    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }


}


