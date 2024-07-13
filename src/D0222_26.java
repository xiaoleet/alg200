public class D0222_26 {
    public static void main(String[] args){
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1};
        //int[] nums = {1,1,1};
        int res = removeDuplicates(nums);
        for(int i = 0;i<res;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1) return len;
        int slow = 0;
        int fast = 1;
        while (fast<len){
            while (fast<len && nums[slow] == nums[fast]){
                fast++;
            }
            if(fast<len){
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
}
