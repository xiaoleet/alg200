public class D0226_28 {
    public static void main(String args[]){
        String haystack = "leetcode", needle = "leeto";
        int res = strStr(haystack,needle);
        System.out.println(res);
    }
    public static int strStr(String haystack, String needle) {
        int len = haystack.length();
        int lenNeed = needle.length();
        int pre = 0;int last = lenNeed-1;
        while (last< len){
            String sub = haystack.substring(pre,last+1);
            if(sub.equals(needle)) {
                return pre;
            } else {
                pre++;
                last++;
            }
        }
        return -1;
    }
}
