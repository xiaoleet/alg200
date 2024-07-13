public class D0324_29 {
    public static void main(String args[]){
        int dividend =10;int divisor=3;
        //int dividend =7;int divisor=-3;
        //int dividend =-2147483648;int divisor=-1;
       int res =  divide(dividend,divisor);
       System.out.println(res);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }else if (divisor == 1) {
            return dividend;
        }else if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return -dividend;
            }
        }

        int res = 0;
        boolean flag=true;//标记结果是正整数
        if((dividend<0 && divisor>0)||(dividend>0 && divisor<0)) flag = false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend>=divisor){
            int tmp = divisor;
            int multi = 1;
            while (dividend>=(tmp<<1)){
                tmp = tmp<<1;
                multi <<= 1;
            }
            dividend = dividend-tmp;
            res = res+multi;
        }
        return flag?res:-res;
    }
}
