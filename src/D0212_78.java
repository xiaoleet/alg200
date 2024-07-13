import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class D0212_78 {
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        //int[] nums = {0,3,7,2,5,8,4,6,0,1};
        //int[] nums = {0,-1};
        //int[] nums = {1,2,0,1};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }

    public static int longestConsecutive2(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1) return len;
        Arrays.sort(nums);
        int[] dp = new int[len];
        dp[0] =1;
        int max = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]-nums[i-1] == 1){
                dp[i] = dp[i-1]+1;
                max = Math.max(max,dp[i]);
            }else if(nums[i]-nums[i-1] == 0){
                dp[i] = dp[i-1];
            }else {
                dp[i] = 1;
            }
        }
        return max;
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max = 1;
        for(int num:nums){
            int count = 1;
            if(!set.contains(num-1)){ //4 ->3?
                // 200 ->199 ?
                //2?->1?0
                while (set.contains(num+1)){//201?
                    //2,3,4

                    num = num+1;
                    count = count+1;
                }
                max = Math.max(max, count);
            }

        }
        return max;
    }


}

