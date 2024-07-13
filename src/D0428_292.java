public class D0428_292 {
    public static void main(String args[]){
        int n = 4;
        boolean res = canWinNim(n);
        System.out.println(res);
    }
    public static boolean canWinNim(int n) {
        //dp[i-1]=false、dp[i-2]=false、dp[i-3]=false;//朋友出手
        //dp[i] = true;//我出手
        //dp[0] = false;
        //dp[i] = (!dp[i-1])||(!dp[i-2])||(!dp[i-3])
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 0;i<=n;i++){
            if(i-1>=0){
                dp[i] = (!dp[i-1])||(dp[i]);
            }else if(i-2>=0){
                dp[i] = (!dp[i-2])|| dp[i];
            }else if(i-3>=0){
                dp[i] = (!dp[i-3])|| dp[i];
            }
        }
        return dp[n];
    }
}
