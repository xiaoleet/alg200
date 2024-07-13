public class D0212_338 {
    public static void main(String[] args){
        int n = 2;
        int[] res = countBits(n);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i = 1;i<=n;i++){
            int count = count(i);
            res[i] = count;
        }
        return res;
    }

    public static int count(int n){
        int count = 0;
        while (n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
