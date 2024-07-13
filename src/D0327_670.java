import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class D0327_670 {
    public static void main(String args[]){
        //int num = 2736;
        int num = 1993;//9913
        //int num = 9986;
        int res = maximumSwap(num);
        System.out.println(res);
    }
    //交换一次能返回的最大值
    public static int maximumSwap(int num) {
        char[] orig = String.valueOf(num).toCharArray();

        char[] sort = String.valueOf(num).toCharArray();
        //Arrays.sort(sort,(c1, c2) -> c2.compareTo(c1));
        Arrays.sort(sort);
        for(int i = sort.length-1,j=0;j<=i;i--,j++){
            char tmp = sort[i];
            sort[i] = sort[j];
            sort[j] = tmp;
        }
        int count = 1;
        for(int i = 0;i<orig.length;i++){
            if(count == 0) break;
            if(orig[i] != sort[i]){
                for(int j = orig.length-1;j>i;j--){
                    if(orig[j] == sort[i]){
                        char tmp = orig[j];
                        orig[j] = orig[i];
                        orig[i] = tmp;
                        count--;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<orig.length;i++){
            sb.append(orig[i]);
        }
        return Integer.valueOf(sb.toString());
    }
}
