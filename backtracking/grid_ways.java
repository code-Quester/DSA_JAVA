package backtracking;

/**
 * grid_ways
 */
public class grid_ways {
    static int c=0;
    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ways (char board[][],int row,int col){
        //base condition
        if (row==board.length && col==board[0].length-1) {
            print(board);
            c++;
            System.out.println();
            return;
        }
        if (row==board.length) {
            return;
        }
        //call by recursion
        for (int j = col; j < board[0].length; j++) {
            board[row][j]='.';
            ways(board, row+1, j);
        }
        for (int j = col; j < board[0].length; j++) {    
            board[row][j]='x'; //backtracking step
        }

    }
    public static void main(String[] args) {
        int n=5;int m=3;
        char board[][]=new char[n][m];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]='x';
            }
        }
        // print(board);
        ways(board,0,0);
        System.out.println("total number of ways "+ c);
    }
}