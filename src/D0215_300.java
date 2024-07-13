import java.util.Arrays;

public class D0215_300 {
    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        //int[] nums = {0,1,0,3,2,3};
        //int[] nums = {7,7,7,7,7,7,7};
        int res = lengthOfLIS(nums);
        System.out.println(res);

    }

    public static int lengthOfLIS(int[] nums) {
        // 含义：dp[i],以i结尾的元素(nums[i])的最长递增子序列的长度
        // 状态方程：j<=i;
        // if(nums[i-1]>=nums[i]) dp[i] = dp[i-1]+1,else dp[i] =1;
        // 初始化：dp[i] =1;
        int max = 1;
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for(int i = 0;i<len;i++){
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
                max = Math.max(max,dp[i]);
            }
        }
        return max;
    }
}
