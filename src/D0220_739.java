import java.util.Stack;

public class D0220_739 {
    public static void main(String[] args){
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] res  = dailyTemperatures(nums);
        for(int r:res){
            System.out.print(r+" ");
        }

    }

    public static int[] dailyTemperatures2(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(temperatures[i]<temperatures[j]){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();//维护一个单调递减栈
        int i = 0;
        while (i<len){
            if(stack.isEmpty()){
                stack.add(i);
                i++;
                continue;
            }
            if(temperatures[stack.peek()]>=temperatures[i]){
                stack.add(i);
                i++;
            }else {
                int pre = stack.pop();
                res[pre] = i-pre;
            }

        }
        return res;
    }
}
