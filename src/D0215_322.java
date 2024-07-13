public class D0215_322 {
    public static void main(String[] args){
        //int[] coins = {1, 2, 5};
        //int[] coins = {2};
        int[] coins = {474,83,404,3};
        int amount = 264;
        int res = coinChange(coins,amount);
        System.out.println(res);

    }
    public static int coinChange(int[] coins, int amount) {
        //完全背包问题
        //dp[i] : 凑到金额i所需要的最少金币个数
        //dp[i] = dp[i-coin[j]]+1,coins[j]表示第j个硬币
        int[] dp =  new int[amount+1];
        dp[0] = 0;
        for(int i = 1;i<dp.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i = 1;i<=amount;i++){//背包
            for(int j = 0;j<coins.length;j++){//物品
                if(i>=coins[j] && dp[i-coins[j]]!=Integer.MAX_VALUE){//防止溢出
                    dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
//        for(int i = 0;i<dp.length;i++){
//            System.out.print(dp[i]);
//        }
        return dp[amount] == Integer.MAX_VALUE?-1:dp[amount];
    }
}
