public class twod_q3 {
    public static void main(String[] args) {
        int arr[][]={{1,2,7},{3,4,7},{1,2,3},{4,5,6}};
        int a[][] = new int[arr[0].length][arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    a[j][i]= arr[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
