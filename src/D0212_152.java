public class D0212_152 {
    public static void main(String[] args){
        int[] prices = {2,3,-2,4};
        //int[] prices = {-2,3,-4};
        int res = maxProduct(prices);
        System.out.println(res);
    }
    public static int maxProduct(int[] nums) {
        //含义：dp[i]，到nums[i]的乘积最大的非空连续子数组的乘积
        //状态方程：
        // dp[i][0] = Math.max(dp[i-1][0]*nums[i],dp[i-1][1]*nums[i]),
        // dp[i][0] = Math.max(dp[i][0],nums[i])
        // dp[i][1] = Math.min(dp[i-1][0]*nums[i],dp[i-1][1]*nums[i])
        // dp[i][1] = Math.min(dp[i][1],nums[i])
        //初始化：dp[0][0] = nums[0];dp[0][1] = nums[0];
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int maxProduct = dp[0][0];
        for(int i = 1;i<len;i++){
            dp[i][0] = Math.max(dp[i-1][0]*nums[i],dp[i-1][1]*nums[i]);
            dp[i][0] = Math.max(dp[i][0],nums[i]);
            dp[i][1] = Math.min(dp[i-1][0]*nums[i],dp[i-1][1]*nums[i]);
            dp[i][1] = Math.min(dp[i][1],nums[i]);
            maxProduct = Math.max(dp[i][0],maxProduct);

        }
        return maxProduct;
    }
}
