import java.util.*;

public class D0305_904 {
    public static void main(String args[]){
        //int[] nums = {3,3,3,1,2,1,1,2,3,3,4};
        int[] nums = {0,1,6,6,4,4,6};
        System.out.println(totalFruit(nums));
    }
    //找到最多包含2个元素的最长连续子数组
    public static int totalFruit(int[] fruits) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        int len = fruits.length;
        int ans = 0;
        for(int i = 0;i<len;i++){
            if(count<2){
                if(!st.contains(fruits[i])){
                    count++;
                }
                st.add(fruits[i]);

            }else if(count==2){
                if(st.contains(fruits[i])){
                    st.add(fruits[i]);
                } else {
                    ans = Math.max(st.size(),ans);
                    int top = st.pop();
                    int halCount = 1;
                    while (true){
                        if (st.pop() == top){
                            halCount+=1;
                        }else {
                            break;
                        }
                    }
                    st = new Stack<>();
                    while (halCount>0){
                        st.add(top);
                        halCount--;
                    }
                    st.add(fruits[i]);
                    count = 2;
                }
            }
        }
        ans = Math.max(st.size(),ans);
        return ans;
    }
}
