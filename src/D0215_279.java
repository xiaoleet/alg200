public class D0215_279 {
    public static void main(String[] args){
        int n = 13;//4+9
        int res = numSquares(n);
        System.out.println(res);

    }
    //先遍历背包，再遍历物品更容易理解
    public static int numSquares(int n) {
        //装满背包最少需要多少件物品
        //外层遍历背包n
        //内层遍历物品1，4，9，，，，（物品是自己造的）
        //dp[i] 装满容量i的背包，所需要的最少的物品

        //dp[i] = Math.min(dp[j - i*i]+1,dp[i]); 1<j*j<=i
        int[] dp = new int[n+1];
        for(int i = 0;i<n+1;i++){
            dp[i]= Integer.MAX_VALUE;
        }
        dp[0] = 0;
        //先遍历背包，再遍历物品
        for(int i = 0;i<=n;i++){
            for(int j = 1;j*j<=i;j++){
                dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
            }
        }
//        for(int i = 0;i<dp.length;i++){
//            System.out.print(i+" ");
//            System.out.println(dp[i]);
//        }

        return dp[n];
    }

    //不懂，，，，，
    public static int numSquares2(int n) {
        //装满背包最少需要多少件物品
        //外层遍历物品，物品1，4，9，，，，（物品是自己造的）
        //内层遍历背包
        //含义：dp[i] 装满容量i的背包，所需要的最少的物品

        //状态方程：dp[i] = Math.min(dp[j - i*i]+1,dp[i]); 1<j*j<=i
        int[] dp = new int[n+1];
        for(int i = 0;i<n+1;i++){
            dp[i]= Integer.MAX_VALUE;
        }
        dp[0] = 0;
        //先遍历物品，再遍历背包
        for(int i = 1;i*i<=n;i++){
            for(int j = i*i;j<=n;j++){
                dp[j] = Math.min(dp[j-i*i]+1,dp[j]);
            }
        }
//        for(int i = 0;i<dp.length;i++){
//            System.out.print(i+" ");
//            System.out.println(dp[i]);
//        }

        return dp[n];
    }
}
