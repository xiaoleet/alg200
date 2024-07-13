public class D0221_1143 {
    public static void main(String[] args){
        String text1 = "abcde", text2 = "ace";
        int res = longestCommonSubsequence(text1,text2);
        System.out.println(res);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1+1][len2+1];
        //dp[i][j] 比较text1中[0,i-1] 和 text2中[0,j-1]的最长公共子序列
        //i = 0～len1-1，j=0~len2-1;
        int len = Math.min(len1,len2);
        for(int i = 1;i<=len1;i++){
            for(int j = 1;j<=len2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;//递推公式
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[len1][len2];
    }
}
