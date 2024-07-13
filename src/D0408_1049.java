public class D0408_1049 {
    public static void main(String args[]){
        //int[] stones = {2,7,4,1,8,1};
        //int[] stones = {31,26,33,21,40};
        int[] stones = {4,3,4,3,2};
        int res = lastStoneWeightII(stones);
        System.out.println(res);
    }
    public static int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int stone:stones){
            sum = sum+stone;
        }

        int target = sum/2;
        int[] dp = new int[target+1];//装满容量j的背包的最大重量
        for(int i = 0;i<stones.length;i++){
            for(int j = target;j-stones[i]>=0;j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return  sum - 2*dp[target];
    }
}

