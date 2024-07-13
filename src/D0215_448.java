import java.util.ArrayList;
import java.util.List;

public class D0215_448 {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        int k = 2;
        List<Integer> res = findDisappearedNumbers(nums);
        System.out.print(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] newNums = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            newNums[nums[i]-1] = nums[i];
        }
        for(int i = 0;i<newNums.length;i++){
            if(newNums[i] == 0){
                res.add(i+1);
            }
        }
        return res;
    }
}
