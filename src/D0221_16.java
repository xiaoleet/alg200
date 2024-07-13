public class D0221_16 {
    public static void main(String[] args){
        //String[] strs = {"flower","flow","flight"};
        //String strs = "abcabcbb";
        //String strs = "bbbbbbbb";
        String strs = "pwwkew";
        int res  = lengthOfLongestSubstring(strs);
        System.out.print(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) return s.length();
        int first = 0;int last = 0;
        int max = 1;
        while (first<=last && last<s.length()){
            if(s.substring(first,last).indexOf(s.charAt(last)) !=-1){
                max = Math.max(last-first,max);
                first++;
            }else {
                last++;
            }
        }
        max = Math.max(last-first,max);
        return max;
    }
}
