import java.util.Arrays;

public class D0212_169 {
    public static void main(String[] args){
        int[] prices = {2,2,1,1,1,2,2};
        int res = majorityElement(prices);
        System.out.println(res);
    }
    //排序法
    public static int majorityElement2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len/2];
    }
    //摩尔投票
    public static int majorityElement(int[] nums) {
        int count = 1;
        int flag = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == flag){
                count++;
            }else{
                if(count>0) {
                    count --;
                } else {
                    flag = nums[i];
                    count = 1;
                }
            }
        }
        return flag;
    }
}
