package com.example.demo.lintcode;

/**
 * @author jiahaowei
 * @date： 2018/6/28 0028
 * @time： 16:27
 * @project_name： demo
 * @Description ：
 *
 *[3,2,3,1,2,1,3,5,10,20]
 *
 * 第一种，这道题主要的点就是找出最大值与最小值。通过循环我们可以得到最大与最小值。
 * 最大值是肯定没问题的，容易出错的是最小值。因为不论是n  还是n/2 他们的时间复杂度
 * 都是一样的。所以当我选择从一个梳子开始 那么他的最小比对就是它本身，也就是说最小值
 * 当时就是零，这时候就出现了一个问题 当一定要有卖操作的时候这时候我的这种写法就是错误的，
 * 单纯的考虑利益问题那么这样写便是没错的，因为明知道肯定涨，在整个数组里全都是跌的数据
 * 还卖个啥劲儿啊。
 *
 * 循环n次，找出最大差值，与最小值。最大差值是根据当前值减去最小值所得。
 *
 *
 *
 * 第二种是别人的思路  因为自己的潜意识总是不习惯这种写法，所以特意考下来给自己看看
 */
public class Lintcode_149 {

    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length<2) {
            return 0;
        }
        int low=prices[0];
        //代表买卖股票的差价
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            low=Math.min(low, prices[i]);
            max=Math.max(max, prices[i]-low);
        }
        return max;
    }



    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        //just remember the smallest price
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }

        return profit;
    }

    public static void main(String[] args) {

    }


}
