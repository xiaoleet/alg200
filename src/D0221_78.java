import java.util.ArrayList;
import java.util.List;

public class D0221_78 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> res  = subsets(nums);
        for(int i = 0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i = 0;i<nums.length;i++){
            int size = res.size();
            for(int j = 0;j<size;j++){
                List<Integer> item = new ArrayList<>(res.get(j));
                item.add(nums[i]);
                res.add(item);
            }
        }
        return res;
    }
}
