public class D0212_128 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
    //超时
    public static int maxProfit2(int[] prices) {
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                maxProfit = Math.max(prices[j] - prices[i],maxProfit);
            }
        }
        return maxProfit;
    }
    //动态规划
    public static int maxProfit(int[] prices) {
        //dp:在第i位置卖出所得到的最大利润
        //dp[i] = prices[i] - min;更新min = min(price[i],min);maxProfit = max(maxProfit,dp[i])
        //初始化:dp[0] = 0;min = prices[0]
        //打印：maxPorit
        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;
        int maxProfit = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
            dp[i] = prices[i] - min;
            min = Math.min(prices[i],min);
            maxProfit = Math.max(maxProfit,dp[i]);
        }
        return maxProfit;
    }
}
