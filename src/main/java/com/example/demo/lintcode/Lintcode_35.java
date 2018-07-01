package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 *
 * 简单题  核心思想是递归的调用。
 *
 *
 *         1 → 2 → 3 → 4 → 5 → null
 *
 *  null ← 1 ← 2 ← 3 ← 4 ← 5
 *
 *   相当于从五开始  不断的更换数值指向null
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Lintcode_35 {


    public ListNode reverse(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }

        ListNode newhead = reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }


}


