public class D0315_55 {
    public static void main(String args[]){
        //int[] nums = {2,3,1,1,4};
        //int[] nums = {0};
        int[] nums = {1,2,3};
        boolean res = canJump(nums);
        System.out.println(res);
    }

    public static boolean canJump(int[] nums) {
        if(nums == null || nums.length == 1) return true;
        int cover = nums[0];
        for(int i = 0;i<=cover;i++){
            cover = Math.max(cover,nums[i]+i);
            System.out.println(cover);
            if(cover>=nums.length-1) return true;
        }
        return false;
    }
}
