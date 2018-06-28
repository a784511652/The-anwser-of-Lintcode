package com.example.demo.lintcode;

import java.util.Arrays;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 15:16
 * @project_name： demo
 * @Description ：
 *
 * 解法分两种
 *
 * 第一种 双指针指向
 * 在这里我们定死了第一个数，也就是说开头第一个数会循环nums.length - 2，而我们这时候操作第一个数字的下一个
 * 以及最后一个数字，start + end < newTarget, count += end - start, start++。
 * 如果start+ end >= newTarget, end--
 *
 *
 * 第二种是以两数之和为基础 相当于固定中间指针，从而挪动左右的指针。最右条件符合时，直接做减。
 * 最后由于第二种方法效率高于第一种  所以只贴出第二种的代码
 */
public class Lintcode_918 {
    private int count = 0;

    public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            helper(nums, i, 0, nums.length - 1, target);
        }
        return count;
    }

    private void helper(int[] nums, int mid, int left, int right, int target) {
        int sum = target - nums[mid];
        while (left < mid && mid < right) {
            if (nums[left] + nums[right] >= sum) {
                right--;
            } else {
                count += right - mid;
                left++;
            }
        }
    }
}
