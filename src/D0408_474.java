public class D0408_474 {
    public static void main(String args[]){
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5, n = 3;
        int res = findMaxForm(strs,m,n);
        System.out.println(res);
    }
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];//装满i个0，j个1 最多装的物品是dp[i][j];
        dp[0][0]  = 0;
        for(String str:strs){
            int oneNum = 0;
            int zeroNum = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '0') {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }
            for(int i = m;i-zeroNum>=0;i--){
                for(int j = n;j-oneNum>=0;j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
