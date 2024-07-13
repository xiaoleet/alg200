public class D0220_581 {
    public static void main(String[] args){
        //int[] nums = {2,6,4,8,10,9,9,15};
        //int[] nums = {1,2,3,4};
        int[] nums = {2,1};
        //int[] nums = {1,3,2,3,3};
        //int[] nums = {1,2,3,3,3};
        int res  = findUnsortedSubarray(nums);
        System.out.println(res);
    }
    public static int findUnsortedSubarray(int[] nums){
        int first = 0;
        while (first<nums.length-1 && nums[first]<=nums[first+1]){
            first++;
        }
        if(first == nums.length-1) return 0;//完全升序
        //first 是否需要往左收缩?[0,first] （first,nums.length)这段的最小值应该大于[0,first]的nums[first]这个最大值
        for(int i = first+1;i<nums.length;i++){
            while (first>=0 && nums[i]<nums[first]){
                first--;
            }
        }

        int last = nums.length-1;
        while (last>0 && nums[last]>=nums[last-1]){
            last--;
        }
        if(last==0) return nums.length-1;//完全降序
        //last 是否需要往右收缩?[last,nums.length-1] （0,last)这段的最大值应该小于[last,nums.length-1]的nums[last]这个最小值
        for(int j = last-1;j>=0;j--){
            while (last<nums.length && nums[j]>nums[last]) {
                last++;
            }
        }
        System.out.println("last:"+last);
        System.out.println("first:"+first);
        return last-first-1;
    }
}
