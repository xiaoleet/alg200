public class D0208_53 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        //定义dp:dp[i],以i结尾的子数组的和
        //状态方程：dp[i] = Math.max(dp[i]+nums[i],nums[i])
        //初始化： dp[0] = nums[0];
        //遍历：1层，从前往后
        //打印：
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1;i<len;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
