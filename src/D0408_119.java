import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D0408_119 {
    public static void main(String args[]){
        int rowIndex = 3;
        List<Integer> res = getRow(rowIndex);
        System.out.println(res);
    }
    public static List<Integer> getRow(int rowIndex) {
        int[] dp = new int[rowIndex+1];
        Arrays.fill(dp,1);
        for(int i = 2;i<=rowIndex;i++){
            for(int j = i - 1;j > 0;j--){
                dp[j] = dp[j]+dp[j-1];
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int item:dp){
            res.add(item);
        }
        return res;
    }
}
