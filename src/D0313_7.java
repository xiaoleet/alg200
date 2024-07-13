public class D0313_7 {
    public static void main(String args[]){
        //int nums = 123;
        //int nums = -123;
        int nums = 1534236469;
        int res = reverse(nums);
        System.out.println(res);
    }
    public static int reverse(int x) {
        int max = Integer.MAX_VALUE/10;
        int min = Integer.MIN_VALUE/10;
        int res = 0;
        while (x!=0){
            if(res > max|| res<min){
                return 0;
            }
            res = res*10+x%10;
            x = x/10;
        }
        return res;
    }
}
