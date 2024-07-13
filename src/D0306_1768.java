
public class D0306_1768 {
    public static void main(String args[]){
        //int[] nums = {3,3,3,1,2,1,1,2,3,3,4};
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1,s2));
    }
    public static String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int i = 0;int j = 0;int k  = 0;
        StringBuilder sb = new StringBuilder();
        while (i<w1.length || j<w2.length){
            if(k%2==0){
                if(i<w1.length) {
                    sb.append(w1[i]);
                    i = i+1;
                }
            }else {
                if(j<w2.length) {
                    sb.append(w2[j]);
                    j = j+1;
                }
            }
            k++;
        }
        if(w1.length<w2.length){
            for(;j<w2.length;j++){
                sb.append(w2[j]);
            }
        }else {
            for(;i<w1.length;i++){
                sb.append(w1[i]);
            }
        }
        return sb.toString();
    }
}
