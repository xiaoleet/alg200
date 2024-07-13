public class D0428_1668 {

    public static void main(String args[]){
        String s = "a";
        String word = "a";
        int count = maxRepeating(s,word);
        System.out.println(count);
    }
    public static int maxRepeating(String sequence, String word) {
        int[] dp = new int[sequence.length()+1];
        int max= 0;
        int m = word.length();
        int n = sequence.length();
        for(int i = 0;i<=n;i++){
            if(i-m>=0){
                if(sequence.substring(i-m,i).equals(word)){
                    dp[i]  = dp[i-word.length()]+1;
                }else {
                    dp[i] = 0;
                }
                max = Math.max(dp[i],max);
            }
        }
        return max;
    }


}
