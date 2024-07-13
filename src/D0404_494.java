import java.lang.reflect.Array;
import java.util.Arrays;

public class D0404_494 {
    public static void main(String args[]){
        int[] nums = {1,1,1,1,1};
        //int[] nums = {1,0};
        int target = 3;
        int res = findTargetSumWays(nums,target);
        System.out.println(res);
    }
    //用动态规划写，类似于分割子集，加法一个集合left，减法一个集合right，
    // left-right=target，left+right=sum==>left = (sum+target)/2,转换成背包问题
    public static int findTargetSumWays(int[] nums, int target){

        int sum = 0;
        for(int num:nums){
            sum = sum+num;
        }
        if(sum<target || -sum>target) return 0;
        sum = sum+target;
        if(sum%2 == 1) return 0;//不能整除，就表示没有这个组合
        int bagsize = sum/2;//装满newTarget有几种方法。
        int[] dp = new int[bagsize+1];
        /**
         * dp[j]装满容量j的背包，有dp[j]种装法
         * dp[j] = sum( dp[j-nums[i]]) j-nums[i]>=0;
         */
        dp[0] = 1;
        for(int i = 0;i<nums.length;i++){
            for(int j=bagsize;j-nums[i]>=0 && j>=0;j--){
                dp[j]  = dp[j]+dp[j-nums[i]];
            }
        }
        return dp[bagsize];
    }
    public static int findTargetSumWays2(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum = sum+nums[i];
        }
        if(sum == target) count =  1;
        if(sum < target) return 0;

        for(int i = 0 ;i<len;i++){
            int[][] muti = genMuti(i,i+1,len-i,len);
            System.out.println("index:"+i);
            print(muti);
            for(int j = 0;j<muti.length;j++){
                int res = 0;
                for(int k = 0;k<muti[0].length;k++){
                    res = res+muti[j][k]*nums[k];
                }
                if(target == res){
                    count++;
                }
            }
        }
        return count;

    }

    public static int[][] genMuti(int start,int end,int row ,int col){
        int[][] muti = new int[row][col];
        for(int i = 0;i<row;i++){
            Arrays.fill(muti[i],1);
        }

        for(int i = 0;i<row;i++){
            int count = end;
            for(int j = start;j<end && end<=col && count>0;j++){
                muti[i][j] = -1;
                count--;
            }
            end++;
        }
        return muti;
    }

    public static void print(int[][] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[0].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
