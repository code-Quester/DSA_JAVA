import java.util.Arrays;

public class majority_element {
    public static void major(int arr[]){
        int ele= 0;
        int c_max=0;
        for (int i = 0; i < arr.length-1; i++) {
            int c= 1;
            while (i< arr.length-1 && arr[i]==arr[i+1]) {
                c++;
                i++;
            }
            if (c_max<c) {
                c_max=c;
                ele = arr[i];
            }
        }
        System.out.println("majority element "+ ele);
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,3,2,3,3,2};
        Arrays.sort(arr);
        major(arr);
    }
}
