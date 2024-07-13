import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class D0207_39 {
    public static void main(String[] args){
        int[] nums = {2,3,6,7};
        int target = 7;

        List<List<Integer>> res = combinationSum(nums,target);
        for(int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);//用于剪枝
        backtracking(res,new ArrayList<>(),candidates,0,target);
        return res;
    }

    public static void  backtracking(List<List<Integer>> res,List<Integer> item,int[] candidates,int index,int target){
        System.out.println("target:"+target);
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(item));
            return;
        }
        for(;index<candidates.length;index++){
            if(target<0) return;
            item.add(candidates[index]);
            backtracking(res,item,candidates,index,target-candidates[index]);
            item.remove(item.size()-1);
        }
    }

//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> res = new ArrayList();
//        Stack<Integer> stack = new Stack<>();
//        Arrays.sort(candidates);
//        backtrack(candidates,target,res,stack,0);
//        return res;
//    }
//
//    public static void backtrack(int[] candidates, int target, List<List<Integer>> res, Stack<Integer> stack,int start) {
//        System.out.println("target:"+target);
//        if(target == 0){
//            List<Integer> item = new ArrayList<>();
//            for (int j = 0;j<stack.size();j++){
//                item.add(stack.get(j));
//            }
//            res.add(item);
//            return;
//        }
//        if(target < 0){
//            return;
//        }
//        for(;start<candidates.length;start++){
//            if(target<0) break;
//            stack.add(candidates[start]);
//            backtrack(candidates,target-candidates[start],res,stack,start);
//            if(!stack.isEmpty())stack.pop();
//        }
//    }
}
