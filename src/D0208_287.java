import java.util.List;

public class D0208_287 {
    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        //int[] nums = {2,2,3,2,2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }

//    public static  int findDuplicate(int[] nums) {
//        int len = nums.length;
//        int[] a = new int[len];
//        for(int i =0;i<len;i++){
//            if(a[nums[i]] == 0){
//                a[nums[i]] = nums[i]+1;
//            }else if(a[nums[i]]>0){
//                return nums[i];
//            }
//        }
//        return -1;
//    }

    public static  int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(fast != slow){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while(slow!=fast){
            fast = nums[fast];
            slow = nums[slow];
        }
        return -1;
    }
}
