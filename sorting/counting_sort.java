package sorting;
public class counting_sort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2,7,7,10,4};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int c[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
        }
        int j =0;
        for (int i = 0; i < c.length; i++) {
            while (c[i]>0) {
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
