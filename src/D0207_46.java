import java.util.ArrayList;
import java.util.List;

public class D0207_46 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);
        for(int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList();
        int[] used = new int[len];
        backtrack(res,new ArrayList<>(),used,0,nums);
        return res;
    }

    public static void backtrack(List<List<Integer>> res,List<Integer> item,int[] used,int index,int[] nums){
        if(item.size() == nums.length){
            res.add(new ArrayList<>(item));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i] == 1) continue;
            item.add(nums[i]);
            used[i] = 1;
            backtrack(res,item,used,i,nums);
            item.remove(item.size()-1);
            used[i] = 0;
        }
    }
}
