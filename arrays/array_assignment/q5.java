import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        if (n>=3){
            int arr[]= new int[n];
            System.out.println("Enter the elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }

            for (int i = 0; i < arr.length-2; i++) {
                for (int j = i+1; j < arr.length-1; j++) {
                    for (int j2 = j+1; j2 < arr.length; j2++) {
                        if (arr[i]+arr[j]+arr[j2]==0){
                            System.out.println("["+arr[i]+","+arr[j]+","+arr[j2]+"]");
                        }
                    }
                }
            }
        }
        else{
            System.out.println("[]");
        }
        sc.close();
    }
}
