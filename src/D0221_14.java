import java.util.Arrays;

public class D0221_14 {
    public static void main(String[] args){
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"flower","flow","flight","fla"};
        //String[] strs = {"flower","flow","flight","floooooo"};
        String res  = longestCommonPrefix(strs);
        System.out.print(res);
    }

    public static String longestCommonPrefix(String[] strs) {
       //排序+夹逼
        StringBuilder sb = new StringBuilder();
        int len = strs.length;
        Arrays.sort(strs);
        for(int i = 0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        String first = strs[0];
        String last = strs[len-1];
        int size = Math.min(first.length(),last.length());
        for(int i = 0;i<size;i++){
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }

}

