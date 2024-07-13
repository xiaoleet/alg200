public class D0221_70 {
    public static void main(String[] args){
        //int[] nums = {1,1,2,3,3,4,4,8,8};
        int[] nums = {3,3,7,7,10,11,11};
        int res  = singleNonDuplicate(nums);
        System.out.print(res);

    }
    public static int singleNonDuplicate(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
}
