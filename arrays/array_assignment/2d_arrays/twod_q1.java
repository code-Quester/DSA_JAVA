public class twod_q1 {
    public static void main(String[] args) {
        int arr[][]={{1,2,7},{3,4,7}};
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==7){
                    c++;
                }
            }
        }
        System.out.println("number of 7's present "+ c);
    }
}
