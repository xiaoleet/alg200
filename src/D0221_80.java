public class D0221_80 {
    public static void main(String[] args){
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int res  = removeDuplicates(nums);
        for(int i = 0;i<res;i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        int cur = 0;
        int count = 1; // 初始计数为1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[cur] && count < 2) {
                cur++;
                nums[cur] = nums[i];
                count++;
            } else if (nums[i] != nums[cur]) {
                cur++;
                nums[cur] = nums[i];
                count = 1; // 更新计数为1
            }
        }
        return cur + 1; // 返回新数组的长度
    }
}
