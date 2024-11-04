package stacks;
/**
 * practise4
 * 
 */
public class practise4 {
    public static int area(int arr[]){
        int left[]=new int[arr.length];
        int right[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j =i+1;
            while (j<arr.length && arr[j]>=arr[i]) {
                right[i]++;
                j++;
            }
            int k =i-1;
            while ( k>=0 && arr[k]>=arr[i]) {
                left[i]++;
                k--;
            }
        }
        int max_area = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = arr[i] * (left[i]+right[i]+1);
            max_area = Math.max(max_area, area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        // int arr[]= {2,1,5,6,2,3};
        int arr2[] = {8,3,9,2,4,5};
        System.out.println("the maximum rec area in the histogram  is "+ area(arr2));
    }
}