public class D0315_746 {
    public static void main(String args[]){
        //int[] nums = {10,15,20};
        int[] nums = {0,0,2,3};
        //int[] nums = {0,1,2,2};
        //int[] nums = {1,100,1,1,1,100,1,1,100,1};
        //
        int res = minCostClimbingStairs(nums);
        System.out.println(res);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            dp[i] = Math.min(dp[i-2],dp[i-1])+cost[i];
        }
        return Math.min(dp[n-2],dp[n-1]);
    }
}
