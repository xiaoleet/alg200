import java.util.Stack;

public class D0215_394 {
    public static void main(String[] args){
        //String s = "3[a]2[bc]";
        String s = "3[a2[c]]";
        //String res = decodeString(s);
       // System.out.print(res);
    }
//    public static String decodeString(String s) {
//        String[] strs = s.split("]");
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0;i<strs.length;i++){
//            String[] items = strs[i].split("\\[");
//            if(items.length==1){
//                sb.append(strs[0]);
//            }else {
//                int reply = Integer.parseInt(items[0]);
//                while (reply>0){
//                    sb.append(items[1]);
//                    reply--;
//                }
//            }
//
//        }
//        return sb.toString();
//    }
//    public static String decodeString(String s){
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0;i<s.length();i++){
//            stack.add(s.charAt(i));
//        }
//        StringBuilder sb = new StringBuilder();
//    }
}
