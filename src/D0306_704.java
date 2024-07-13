public class D0306_704 {
    public static void main(String args[]){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int res = search(nums,target);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        int len = nums.length;
        int l = 0;int r = len-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l = mid+1;
            }else if(nums[mid]>target){
                r = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
