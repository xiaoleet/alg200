import java.util.HashMap;
import java.util.Map;

public class D0424_168 {
    public static void main(String args[]){
        //int n = 701;
        int n = 2147483647;
        //int n = 28;
        //int n = 52;
        String res = convertToTitle(n);
        System.out.println(res);
    }

    public static String convertToTitle(int columnNumber) {
        int divisor = 26;
        Map<Integer,Character> map = getBaseMap();
        StringBuilder sb = new StringBuilder();
        while (columnNumber!=0){
            int item = columnNumber%divisor;
            char c = ' ';
            if(item!=0){
                c = map.get(item);
            }else {
                item = divisor;
                c = map.get(item);
                columnNumber = columnNumber -divisor;
            }
            sb.append(c);
            columnNumber = columnNumber/divisor;
        }
        if(columnNumber !=0) sb.append(map.get(columnNumber));
        return sb.reverse().toString();
    }

    public static Map getBaseMap(){
        char c = 'A';
        Map map = new HashMap<Integer,Character>();
        for(int i = 1;i<=26;i++){
            map.put(i,c);
            c++;
        }
        return map;
    }
}
