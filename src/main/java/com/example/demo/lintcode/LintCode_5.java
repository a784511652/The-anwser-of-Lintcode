package com.example.demo.lintcode;

import java.util.Arrays;

/**
 * @author jiahaowei
 * @version 1.0
 * @description
 * @Description 快速排序的基础实现
 * @date 2019-11-18 15:22
 **/
public class LintCode_5 {
    /**
     * 描述
     * 中文
     * English
     * 在数组中找到第 k 大的元素。
     * <p>
     * 你可以交换数组中的元素的位置
     * <p>
     * 您在真实的面试中是否遇到过这个题？
     * 样例
     * 样例 1：
     * <p>
     * 输入：
     * n = 1, nums = [1,3,4,2]
     * 输出：
     * 4
     * 样例 2：
     * <p>
     * 输入：
     * n = 3, nums = [9,3,2,4,8]
     * 输出：
     * 4
     * 挑战
     * 要求时间复杂度为O(n)，空间复杂度为O(1)。
     * <p>
     * 相关题目
     */
    private int kthLargestElement(int n, int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 1;

        }

        //快速排序
        Arrays.sort(nums);

        return nums[nums.length - n];

    }

    public static void main(String[] args) {
        LintCode_5 k = new LintCode_5();
        int a[] = {1, 3, 4, 2};
        int result = k.kthLargestElement(105, a);

        System.out.println(result);


    }

}
