public class D0421_2909 {
    public static void main(String args[]){
        //int[] nums = {1,1,3,2};
        int[] nums = {8,6,1,5,3};
        int res = minimumSum(nums);
        System.out.println(res);
    }

    public static int minimumSum(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = nums[0];
        for(int i = 1;i<len;i++){
            left[i] = Math.min(nums[i],left[i-1]);
        }
        right[len-1] = nums[len-1];
        for(int j = len-2;j>=0;j--){
            right[j] = Math.min(nums[j],right[j+1]);
        }
        int minSum = Integer.MAX_VALUE;
        for(int k = 1;k<len-1;k++){
            if(nums[k]>left[k] && nums[k]>right[k]){
                int sum = left[k] + nums[k] + right[k];
                minSum = Math.min(minSum, sum);
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
