public class D0408_518 {
    public static void main(String args[]){
        int amount = 5;
        int[] coins = {1, 2, 5};
        int res = change(amount,coins);
        System.out.println(res);
    }

    public static int change(int amount, int[] coins){
        int[] dp = new int[amount+1];//装满背包容量为j的背包，有dp[j]种方法
        dp[0] = 1;
        for(int i = 0;i<coins.length;i++){
            //for(int j = amount;j-coins[i]>=0;j--){
            for(int j = coins[i];j<=amount;j++){
                dp[j] = dp[j]+dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
