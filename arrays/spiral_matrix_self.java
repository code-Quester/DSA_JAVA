import java.util.Scanner;
public class spiral_matrix_self {
    public static void right(int a[][],int si,int sj){
        while (sj<4 ) {
            System.out.print(a[si][sj]+" ");
            a[si][sj]=0; 
            if (sj!=3 && a[si][sj+1]!=0) {
                sj++;            
            }    
            else{
                if (a[si+1][sj]!=0) {
                    down(a,si+1,sj);
                    return;
                }
                else{
                    return;
                }
            }       
        }
    }
    public static void down(int a[][],int si,int sj){
        while (si<4) {
            System.out.print(a[si][sj]+" ");
            a[si][sj]=0;  
            if (si!=3 && a[si+1][sj]!=0) {
                si++;             
            }    
            else{
                if (a[si][sj-1]!=0) {
                    left(a,si,sj-1);
                    return;
                }
                else{
                    return;
                }
            }      
        }
    }
    public static void left(int a[][],int si,int sj){
        while (sj>=0) {
            System.out.print(a[si][sj]+" ");
            a[si][sj]=0;   
            if ( sj!=0 && a[si][sj-1]!=0) {
                sj--;        
            }  
            else{
                if (a[si-1][sj]!=0) {
                    up(a,si-1,sj);
                    return;
                }
                else{
                    return;
                }
            }       
        }
    }
    public static void up(int a[][],int si,int sj){
        while (si>=0 ) {
            System.out.print(a[si][sj]+" ");
            a[si][sj]=0;  
            if (si!=0 && a[si-1][sj]!=0) {
                si--;
            } 
            else{
                if (a[si][sj+1]!=0) {
                    right(a,si,sj+1);
                    return;
                }
                else{
                    return;
                }
            }         

        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting indexes");
        int si = sc.nextInt();
        int sj = sc.nextInt();

        if (si==0&&sj==0){
            right(a,si,sj);
        }
        else if (si==0&&sj==3) {
            down(a,si,sj);
        }
        else if (si==3&&sj==3) {
            left(a,si,sj);
        }
        else if (si==3&&sj==0) {
            up(a,si,sj);
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
