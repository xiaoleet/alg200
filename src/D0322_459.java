public class D0322_459 {
    public static void main(String args[]){
        String s = "aba";
        boolean res = repeatedSubstringPattern(s);
        System.out.println(res);
    }
    public static boolean repeatedSubstringPattern(String s) {
        String ds = s+s;
        ds = ds.substring(1,ds.length()-1);
        return ds.contains(s);
    }
}
