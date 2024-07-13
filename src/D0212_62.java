public class D0212_62 {
    public static void main(String[] args){
        int m = 3, n = 7;
        int res = uniquePaths(m,n);
        System.out.println(res);
    }

    public static int uniquePaths(int m, int n) {
        //dp含义：dp[i][j] 到达dp[i][j]的路径总数
        //dp状态方程：dp[i][j] = dp[i-1][j]+dp[i][j-1]
        //遍历方式：i，从上往下遍历，j从左往右遍历
        //初始化：dp[0][j] = 1;dp[i][0] = 1;
        //打印：dp[m-1][n-1]
        int[][] dp = new int[m][n];
        for(int j = 0;j<n;j++){
            dp[0][j] = 1;
        }
        for(int i = 0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
