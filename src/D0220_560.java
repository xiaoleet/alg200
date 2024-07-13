import java.util.HashMap;
import java.util.List;

public class D0220_560 {
    public static void main(String[] args){
        int[] nums = {1,2,3};int k = 3;
        int res  = subarraySum(nums,k);
        System.out.println(res);
    }
    public static int subarraySum2(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//前缀和是0的子数组个数为1,[]
        for(int i = 0;i<nums.length;i++) {//我们要找的是和为 k 的子数组个数。对于一个位置 i，其前缀和 sum[i] 表示从开头到位置 i 的元素和。如果存在一个位置 j（j < i），使得 sum[j] = sum[i] - k，那么从 j+1 到 i 的子数组和就是 k
            sum = sum+nums[i];
            if(map.containsKey(sum-k)){
                count = count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
