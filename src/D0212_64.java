public class D0212_64 {
    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int res = minPathSum(grid);
        System.out.println(res);
    }

    public static int minPathSum(int[][] grid) {
        //dp含义：dp[i][j] 到达dp[i][j]的最小和
        //dp状态方程：dp[i][j] = Math.min(dp[i-1][j]+nums[i][j],dp[i][j-1]+nums[i][j]);
        //遍历方式：i，从上往下遍历，j从左往右遍历
        //初始化：dp[0][0] = nums[0][0],dp[0][j] = dp[0][j-1]+nums[0][j];dp[i][0] = dp[i-1][0]+nums[i][0];
        //打印：dp[m-1][n-1]
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int j = 1;j<n;j++){
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        for(int i = 1;i<m;i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for(int i = 1;i<m;i++){
            for(int j =1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[m-1][n-1];
    }
}
