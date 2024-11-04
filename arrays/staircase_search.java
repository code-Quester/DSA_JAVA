import java.util.Scanner;

public class staircase_search {
    public static void main(String[] args) {
        int a[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int i=0;
        int j=a[0].length-1;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the element to be searched");
        int e = sc.nextInt();
        while (i<a.length && j>=0) {
            if( a[i][j] == e){
                System.out.println("found at index - ("+ i +","+ j+ ")");
                break;
            }
            else if(a[i][j]<e){
                i++;
            }
            else{
                j--;
            }
        }
        if ((i>=a.length || j<0)) {
            System.out.println("elemnt not found");
            
        }
        sc.close();
    }
}
