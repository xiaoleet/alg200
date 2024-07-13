import java.util.ArrayList;
import java.util.List;

public class D0320_260 {
    public static void main(String args[]){
        int[] nums = {1,2,1,3,2,5};
        int[] res = singleNumber(nums);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int split = 0;
        for(int i = 0;i<nums.length;i++){
            split = nums[i]^split;
        }
        System.out.println(split);
        int splitByte = 1;
        while ((splitByte & split) == 0){
            splitByte<<=1;
        }
        for(int i = 0;i<nums.length;i++){
            if((nums[i]&splitByte)!=0){
                res[0] = res[0]^nums[i];
            }else {
                res[1] = res[1]^nums[i];
            }
        }
        return res;
    }
}
