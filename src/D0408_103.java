import java.util.Arrays;

public class D0408_103 {
    public static void main(String args[]){
        int[] coins = {1, 2, 5};
        int amount = 11;
        int res = coinChange(coins,amount);
        System.out.println(res);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;//凑够金额i，所需要的最少的硬币个数dp[i];
        for(int i = 0;i<coins.length;i++){//物品
            for(int j = coins[i];j<=amount;j++){//背包
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE?-1:dp[amount];
    }
}
