public class D0305_29 {
    public static void main(String args[]){
        //int x = 9;
        //int x = 0;
        //nt x = 1;
        int x = 2147395599;
        int res = mySqrt(x);
        System.out.println(res);
    }

    public static int mySqrt(int x) {
        int l = 0;int r = x;
        int ans = 0;
        while (l<=r){
            int mid = (l+r)/2;
            if((long) mid*mid >x){
                r = mid-1;
            }else {
                l = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
