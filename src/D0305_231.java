public class D0305_231 {
    public static void main(String args[]){
        int num = 16;
        System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        int count = 0;
        while (n>0){
            if((n&1) != 0){
                count++;
                if(count>1) return false;
            }
            n = n>>1;
        }
        return true;
    }
}
