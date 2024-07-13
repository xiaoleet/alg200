import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D0220_438 {
    public static void main(String[] args){
        //String s = "cbaebabacd", p = "abc";
        String s = "abab", p = "ab";
        List<Integer> res = findAnagrams(s,p);
        System.out.println(res);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        //滑动窗口法
        List<Integer> res = new ArrayList<>();
        int plen = p.length();
        int pre = 0;int last = plen-1;
        while (pre<=last && last<s.length()){
            String sub = s.substring(pre,last+1);
            if(isEquals(sub,p)){
                res.add(pre);
            }
            pre++;last++;
        }
        return res;
    }

    public static boolean isEquals(String x,String y){
        char[] cx = x.toCharArray();
        char[] cy = y.toCharArray();
        Arrays.sort(cx);
        Arrays.sort(cy);
        return String.valueOf(cx).equals(String.valueOf(cy));
    }
}
