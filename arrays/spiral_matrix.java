public class spiral_matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int start_row= 0;
        int start_column= 0;
        int end_row = a.length-1;
        int end_column= a[0].length-1;

        while (start_row<=end_row && start_column<=end_column) {
            //top-print
            for (int j = start_column; j <=end_column; j++) {
                System.out.print(a[start_row][j]+" ");
            }

            //right-print
            for (int i = start_row+1; i <= end_row; i++) {
                System.out.print(a[i][end_column]+" ");
            }
            //bottom-print
            for (int j = end_column-1; j >= start_column; j--) {
                System.out.print(a[end_row][j]+" ");
            }
            //left-print
            for (int i = end_row-1; i >= start_row+1; i--) {
                System.out.print(a[i][start_column]+" ");
            }
            start_row++;
            end_row--;
            start_column++;
            end_column--;


        }


    }
}
