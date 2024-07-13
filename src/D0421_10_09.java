public class D0421_10_09 {
    public static void main(String args[]){
//        int[][] nums = {
//                {1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 1},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//        };
        int[][] nums = {
                {-5}
        };
        //int target = 5;
        //int target = 20;
        int target = -10;
        boolean res = searchMatrix(nums,target);
        System.out.println(res);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int i = matrix.length-1;
        int j = matrix[0].length-1;
        int k = 0;
        while (i>=0 && k<=j){
            if(matrix[i][k] == target) return true;
            while (i>=0 && matrix[i][k]>target) i--;
            while (i>=0 && k<=j && matrix[i][k]<target) k++;
        }
        return false;
    }
}
