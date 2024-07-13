public class D0215_461 {
    public static void main(String[] args){
        //int x = 1, y = 3;
        int x = 1, y = 4;
        int res = hammingDistance(x,y);
        System.out.println(res);
    }

    public static int hammingDistance(int x, int y) {
        //两个等长字符串之间的汉明距离是两个字符串对应位置的不同字符的个数。换句话说，它就是将一个字符串变换成另外一个字符串所需要替换的字符个数
        int count = 0;
        while (x!=y){
            if((x&1) != (y&1)){
                count++;
            }
            x = x>>1;
            y = y>>1;
        }
        return count;
    }
}
