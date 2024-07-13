public class D0312_215 {
    public static void main(String args[]){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int res = findKthLargest(nums,k);
    }
    public static int findKthLargest(int[] nums, int k) {
        int povit = nums[0];
        int low = 1;
        int high = nums.length-1;
        int res = quickSelect(nums,k,low,high);
        return  res;

    }

    public static int quickSelect(int[] nums,int k,int low,int high){
        return 0;
    }

    public static int swap(int[] nums,int low,int high){
        int povit = nums[low];
        int i = low;
        for(int j = low+1;j<high;j++){
            if(nums[j]<=povit){
                i++;
                int tmp = nums[low];
                nums[i]  = nums[low];
                high  = nums[low];
            }
        }
        return i;
    }

}
