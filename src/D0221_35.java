public class D0221_35 {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};int target = 2;
        int res = searchInsert(nums,target);
        System.out.print(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while (left<right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return mid;
    }
}
