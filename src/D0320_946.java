import java.util.Stack;

public class D0320_946 {
    public static void main(String args[]){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
//        int[] pushed = {1,2,3,4,5};
//        int[] popped = {4,3,5,1,2};
        boolean res = validateStackSequences(pushed,popped);
        System.out.println(res);
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> res = new Stack<>();
        int len = pushed.length;
        int i = 1;//push指针
        int j = 0;//pop指针
        res.add(pushed[0]);
        while (i<len || j<len){
            if(j<len && !res.isEmpty() && res.peek() == popped[j]){
                res.pop();
                j++;
            }else if(i<len){
                res.add(pushed[i]);
                i++;
            }else {
                return false;
            }
        }
        return true;

    }
}
