public class D0212_283 {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int flag = 0;//标记0的边界
        for(int i = 0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[flag] = nums[i];
                flag++;
            }
        }
        while (flag<nums.length){
            nums[flag] = 0;
            flag++;
        }
    }
}
