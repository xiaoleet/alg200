import java.util.HashMap;

public class D0322_36 {
    public static void main(String args[]){
//        char[][] board = {
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };
        char[][] board = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        boolean res = isValidSudoku(board);
        System.out.println(res);

    }
    public static boolean isValidSudoku(char[][] board) {
        //按照行扫
        for(int i = 0;i<9;i++){
            int[] res = new int[9];
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.'){
                    continue;
                }else if(res[board[i][j] - '0'-1] == 1){
                    return false;
                }else if(res[board[i][j] - '0'-1] == 0){
                    res[board[i][j] - '0'-1] = 1;
                }
            }
        }
        //按照列扫
        for(int j = 0;j<9;j++) {
            int[] res = new int[9];
            for(int i = 0;i<9;i++){
                if(board[i][j] == '.'){
                    continue;
                }else if(res[board[i][j] - '0'-1] == 1){
                    return false;
                }else if(res[board[i][j] - '0'-1] == 0){
                    res[board[i][j] - '0'-1] = 1;
                }
            }
        }
        //按照9宫格扫
        int[][] range = {
                {0,2},
                {3,5},
                {6,8}
        };
        for(int k = 0;k<range.length;k++){
            for(int m = 0;m<range.length;m++){
                int[] res = new int[9];
                for(int i = range[k][0];i<=range[k][1];i++){
                    for(int j = range[m][0];j<=range[m][1];j++){
                        System.out.print(board[i][j]);
                        if(board[i][j] == '.'){
                            continue;
                        }else if(res[board[i][j] - '0'-1] == 1){
                            return false;
                        }else if(res[board[i][j] - '0'-1] == 0){
                            res[board[i][j] - '0'-1] = 1;
                        }
                    }
                    System.out.println();
                }

                System.out.println("========");

            }
        }
        return true;
    }
}
