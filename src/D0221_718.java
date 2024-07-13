public class D0221_718 {
    public static void main(String[] args){
        //int[] nums = {1,1,1,2,2,3};
        //int[] nums1 = {1,2,3,2,1};int[] nums2 = {3,2,1,4,7};
        int[] nums1 = {0,1,1,1,1};int[] nums2 = {1,0,1,0,1};
        int res  = findLength(nums1,nums2);
        System.out.println(res);

    }
    public static int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1+1][len2+1];
        //dp[i][j] 0～i-1位和 0-j-1位的最长重复子数组的长度
        //dp[i][0],是[0,i-1]的nums1和[] 组比较
        //dp[0][j],是[]和[0，j-1] nums2组比较
        for(int i=1;i<=len1;i++){
            for(int j = 1;j<=len2;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
