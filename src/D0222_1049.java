public class D0222_1049 {
    public static void main(String[] args){
        int[] stones = {2,7,4,1,8,1};
        //int[] stones = {31,26,33,21,40};
        int res = lastStoneWeightII(stones);
        System.out.println(res);
    }
    public static int lastStoneWeightII(int[] stones) {
        //这个题目的目的就是找加减法，让数组的差最小。而加减让数组的差最小的办法其实是，凑出一个最接近sum的一半的数，这样才能让数组的值最小
        int sum = 0;
        for(int stone:stones){
            sum+=stone;
        }
        int target = sum/2;//凑出一个最接近target的值出来
        int[] dp = new int[target + 1];
        //转成背包问题了，就是把stones选择后，放到背包target里面，让背包尽量满。就转化成，石头是固定的大小，求背包最多能装的最大的重量总和。
        //dp[i] = dp[j],dp[j-stone[j]]+stone[i]；容量为i的背包，装满后的重量为dp[i];
        dp[0] = 0;//装满容量为0的背包，重量为0

        for(int i = 0;i<stones.length;i++){
            System.out.println("石头"+i+"的重量为"+stones[i]);
            for(int j = target; j >= stones[i]; j--){//从大往小遍历，这样保证每个物品只放了一次
                //两种情况，要么放，要么不放
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
                System.out.print("dp["+j+"]=" +dp[j]+" ");
            }
            System.out.println();
        }
//        for(int i = 0;i<dp.length;i++){
//            System.out.println("i:"+dp[i]+" ");
//        }
        return sum - 2*dp[target];
    }
}
