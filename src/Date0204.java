import java.util.Stack;

public class Date0204 {
    public static void main(String[] args){

        //alg3();//1
        //alg4();//todo
        //alg11();//2
        //alg19();//3
        alg20();//4
    }
    public static void alg3(){
        //String s = "abcabcbb";
        //String s = "bbbb";
        String s = "pwwkew";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);
    }
    public static void alg4(){
        String s = "babad";
        String res = longestPalindrome(s);
        System.out.println(res);
    }
    public static void alg11(){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(nums);
        System.out.println(res);
    }
    public static void alg19(){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        //倒数第一个呢？
        removeNthFromEnd(p1,  2);
        while (p1 !=null){
            System.out.println(p1.val);
            p1 = p1.next;
        }
    }
    public static void alg20(){
        //String s = "()[]{}";
        //String s = "([]{}";
        String s = "[]({}";
        boolean res = isValid(s);
        System.out.println(res);
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        String[][] dp = new String[len][len];
        char[] c = s.toCharArray();
        for(int i = 0;i<len;i++){
            dp[i][i] = ""+c[i];
        }
        return "";

    }
    public static int lengthOfLongestSubstring(String str){
        int maxLen = 0;
        if(str.length() == 0) return maxLen;
        int pre = 0;int last = 0;
        int i = 0;
        while (pre<=last && i<str.length()){
            String subStr = str.substring(pre,last);
            if(!subStr.contains(str.substring(i,i+1))){
                i++;
                last++;
            }else {
                maxLen = Math.max(maxLen,last - pre);
                pre++;
            }
        }
        return Math.max(maxLen,last-pre);
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int pre = 0;
        int last = height.length-1;
        while (pre<last){
            int width = last-pre;
            int high = Math.min(height[pre],height[last]);
            max =  Math.max(max,width*high);
            if(height[pre]<height[last]){
                pre++;
            }else {
                last--;
            }
        }
        return max;
    }
    //0->1,2,3,4,5 null
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast =dummyHead;
        ListNode slow =dummyHead;
        for(int i=0;i<n+1;i++){
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }

    public static boolean isValid(String s) {
        if(s.length() == 0 || s == null) return true;
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<c.length;i++){
            if(stack.empty()){
                stack.push(c[i]);
                continue;
            }
            if((stack.peek() == '(' && c[i] == ')')
            || (stack.peek() == '[' && c[i] == ']')
            || (stack.peek() == '{' && c[i] == '}')){
                stack.pop();
            }else {
                stack.push(c[i]);
            }
        }
        return stack.empty();
    }
}
