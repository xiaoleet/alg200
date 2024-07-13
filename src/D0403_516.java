public class D0403_516 {
    public static void main(String args[]){
        String s = "abcdabcdabcdabcd";
        int res = longestPalindromeSubseq(s);
        System.out.println(res);
    }

    public static int longestPalindromeSubseq(String s) {
        int len = s.length();
        if(len == 1 || len == 0) return len;
        int[][] dp = new int[len][len];
        int max = 1;
        for(int i = len-1;i>=0;i--){
            dp[i][i] = 1;
            for(int j = i+1;j<len;j++){
                if(s.charAt(j) == s.charAt(i)) {
                    if(j-i==1){
                        dp[i][j] = 2;
                    }else {
                        dp[i][j] = 2+dp[i+1][j-1];
                    }
                }else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
