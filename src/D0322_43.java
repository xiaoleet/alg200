import java.util.ArrayList;
import java.util.List;

public class D0322_43 {
    public static void main(String args[]){
        String s1 = "498828660196";
        String s2 = "840477629533";
//        String s1 = "9";
//        String s2 = "99";
        String res = multiply(s1,s2);
        System.out.println(res);
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        List<StringBuilder> res = new ArrayList<>();
        int mutiply = 0;
        for(int i = num2.length()-1;i>=0;i--){
            StringBuilder item = new StringBuilder();
            int carray = 0;
            for(int j = num1.length()-1;j>=0;j--){
                int muti = (num1.charAt(j)-'0')*(num2.charAt(i)-'0')+carray;
                item.insert(0,muti%10);
                carray = muti/10;
            }
            if(carray>0){
                item.insert(0,carray);
            }
            int count = 0;
            while (count<mutiply){
                item.append('0');
                count++;
            }
            mutiply++;
            res.add(item);
        }
        String result = "0";
        for (StringBuilder sb:res){
            StringBuilder mresult = new StringBuilder();
            int i = result.length()-1;int j = sb.length()-1;
            int carr = 0;
            while (i>=0 || j>=0 || carr>0){
                int sum = 0;
                if(i>=0){
                    sum = result.charAt(i)-'0'+sum;
                    i--;
                }
                if(j>=0){
                    sum = sb.charAt(j)-'0'+sum;
                    j--;
                }
                if(carr>0){
                    sum = carr+sum;
                }
                mresult.insert(0,sum%10);
                carr = sum/10;
            }
            result = mresult.toString();
        }
        return result;
    }


}
