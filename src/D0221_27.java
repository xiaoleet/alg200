public class D0221_27 {
    public static void main(String[] args){
        int[] nums = {3,2,2,3}; int val = 3;
        int res  = removeElement(nums,val);
        System.out.print(res);
    }
    public static int removeElement2(int[] nums, int val) {
        int len = nums.length;
        //快慢指针，快指针查找新数组所需要的元素，慢指针指向更新新数组元素
        for(int i = 0;i<len;i++){
            if(nums[i] == val){
                for(int j = i+1;j<nums.length;j++){
                    nums[j-1] = nums[j];
                }
                i--;
                len--;
            }
        }
        return len;
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int fast = 0;int slow = 0;
        for(;fast<len;fast++){
            if(nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
