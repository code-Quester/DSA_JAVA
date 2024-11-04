package backtracking;

public class nqueens {
    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void n_queens(char board[][],int row)
    {
        if (row==board.length) {
            print(board);
            System.out.println();
            return;
        }
        for (int i = 0; i < board.length; i++) {
            board[row][i]='Q';
            if (checkboard(board, row, i)==true) {
                n_queens(board, row+1);
            }
            board[row][i]='.';

        }
    }
    public static boolean checkboard(char board [][],int row,int col){
        int i;int j;
        //up- check 
        for(i=row-1;i>=0;i--){
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //top=left diagonal
        for(i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //top-right diagonal
        for(i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int n =8 ;
        char board[][]= new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]='.';
            }
        }
        n_queens(board,0);

    }
}
