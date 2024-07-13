public class D0306_122 {
    public static void main(String args[]){
        int[] nums = {7,1,5,3,6,4};
        int res = maxProfit(nums);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        /**
         * dp[i]的含义：dp[i][0] 第i天，持有股票的最大利润,dp[i][1] 第i天，不持有股票的最大利润
         * 初始化：dp[0][0] = -prices[0],dp[0][1] = 0;
         * 状态方程： dp[i][0] = max(dp[i-1][0]-prices[i],dp[i-1][1]-prices[i]) 这个表达式是错的，因为一次，只能持有一只股票。
         * 第i-1天持有了，那就必须卖掉再持有，所以只有i-1不持有，才能再第i天持有
         * （第i-1天卖了，今天第i天刚买的），或者第i-1天持有了，一直不卖，第i天不主动持有，也算持有（第i天之前买的，没卖）。
         *
         *也就是dp[i][0] = max(第i天之前买的，没卖；第i-1天卖了，今天第i天刚买的)
         * dp[i][0] = max(dp[i-1][0],dp[i-1][1]-prices[i])
         *
         * dp[i][1] = max(dp[i-1][1],dp[i-1][0]+prices[i]),dp[i-1][1]
         * 没有可以卖的股票，所以等于不持有的前一天的最大利润
         * dp[i-1][0]+nums[i] 按照今天的价格卖了，赚今天的钱，就是加上prices[i]
         */
        dp[0][0] = -prices[0];dp[0][1] = 0;
        for(int i = 1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i][0]+prices[i]);
        }
//        for(int i = 0;i<dp.length;i++){
//            System.out.println(dp[i][0]+","+dp[i][1]);
//        }
        return dp[prices.length-1][1];
    }
}
