public class D0212_198 {
    public static void main(String[] args){
        //int[] prices = {1,2,3,1};
        int[] prices = {2,7,9,3,1};
        int res = rob(prices);
        System.out.println(res);
    }

    public static int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        //dp[i]:偷到第i家时，偷到的最高金额
        //状态方程：dp[i] = max(dp[i-2]+nums[i],dp[i-1]);
        //初始化：dp[0] = nums[0],dp[1] = Math.max(nums[0],nums[1]);
        //遍历：一层，从前往后
        //打印
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i<len;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];
    }
}
