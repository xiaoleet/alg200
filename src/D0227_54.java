import java.util.ArrayList;
import java.util.List;

public class D0227_54 {
    public static void main(String args[]){
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] matrix = {{3},{2}};
        int[][] matrix = {{6,9,7}};
        List<Integer> res = spiralOrder(matrix);
        System.out.println(res);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int offset = 0;
        int m = matrix.length; // 行
        int n = matrix[0].length; // 列
        if(m == 0 || n == 0 ){
            return res;
        }else if(m == 1){
            for(int i = 0;i<matrix[0].length;i++){
                res.add(matrix[0][i]);
            }
            return res;
        }else if(n == 0){
            for(int j = 0;j<matrix.length;j++){
                res.add(matrix[j][0]);
            }
            return res;
        }
        int circle = Math.max(m, n) / 2;
        while (circle > 0) {
            for (int i = offset; i < n - 1 - offset; i++) {
                res.add(matrix[offset][i]);
            }
            for (int j = offset + 1; j < m - 1 - offset; j++) {
                res.add(matrix[j][n - 1 - offset]);
            }

            for (int i = n - 1 - offset; i > offset; i--) {
                res.add(matrix[m - 1 - offset][i]);
            }
            for (int j = m - 1 - offset; j > offset; j--) {
                res.add(matrix[j][offset]);
            }
            circle--;
            offset++;
        }
        for (int i = offset; i <= n - 1 - offset; i++) {
            res.add(matrix[m - 1 - offset][i]);
        }

        return res;
    }
}
