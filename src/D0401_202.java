import java.util.HashSet;

public class D0401_202 {
    public static void main(String args[]){
        int n = 2;
        boolean res = isHappy(n);
        System.out.println(res);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n); // 将当前数字加入到集合中
            int newN = 0;
            while (n != 0){
                int res  = n % 10;
                newN = newN + res * res;
                n = n / 10;
            }
            if(newN == 1)
                return true;
            else
                n = newN; // 更新n为新数字继续循环
        }
        return false;
    }
}