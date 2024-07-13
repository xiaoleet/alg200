public class D0222_209 {
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};int target = 7;
        int res = minSubArrayLen(nums,target);
        System.out.println(res);
    }

    public static int minSubArrayLen(int[] nums,int target) {
        int i = 0;int j = 0;
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        //int sum = add(nums,i,j);
        int sum = nums[0];
        while (j<len){
            if(sum<target){
                j++;
                if(j<len) sum = sum+nums[j];
            }else if(sum>=target){
                res = Math.min(res,j-i+1);
                sum = sum-nums[i];//先减去，再挪动i的指针
                i++;
                if(j<i){
                    j++;
                    if(j<len) sum = sum+nums[j];
                }
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }

//    public static int add(int[] nums,int start,int end){
//        int sum = 0;
//        for(int i = start;i<=end;i++){
//            sum = sum+nums[i];
//        }
//        return sum;
//    }
}
