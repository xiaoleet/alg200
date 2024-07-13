import java.util.HashMap;
import java.util.List;

public class D0304_16 {
    public static void main(String args[]){
        String s = "III";
        int res = romanToInt(s);
        System.out.println(res);
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] cStr = s.toCharArray();
        int len = cStr.length;
        int sum = 0;
        for(int i = 0;i<len-1;i++){
            if(map.get(cStr[i])>= map.get(cStr[i+1])){
                sum = sum+map.get(cStr[i]);
            }else {
                sum = sum-map.get(cStr[i]);
            }
        }
        sum = sum+map.get(cStr[len-1]);
        return sum;
    }
}
