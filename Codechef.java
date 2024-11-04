// import java.util.*;

// class Codechef
// {
    
//     public static boolean check(int e,int l,int r,int a[]){
//         while(l != 0 || r != a.length-1){
//             if (l!=0){
//                 l--;
//                 if (a[l]==e){
//                     return false;
//                 } 
//             }else if(r != a.length-1){
//                 r++;
//                 if (a[r]==e){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner sc = new Scanner(System.in);
//         // int t = sc.nextInt();
//         // while (t-- > 0) {
//             int n = sc.nextInt(), a[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 a[i] = sc.nextInt();
//             }
//             long total = (n * (long) (n + 1)) / 2;
//             ArrayList<Integer> list= new ArrayList<>();
//             for (int i =0; i<n;i++ ){
//                 for (int j =i;j<n ;j++ ){
//                     for (int k = i;k<=j ;k++ ){
//                         list.add(a[k]);
//                     }
//                     boolean b1 = false,b2 = false,b3=false;
//                     if (!list.contains(1)) {
//                     b1 = check(2,i,j,a);
//                     }
//                     if (!list.contains(2)) {
//                     b2 = check(3,i,j,a);
//                     } 
//                     if (!list.contains(3)) {
//                     b3 = check(1,i,j,a);
//                     }
//                     if (b1||b2||b3) {
//                         total --;
//                     }
                    
//                     list.clear();
                    
//                 } 
//             } 
//             System.out.println(total);
//         // }
//         sc.close();
// 	}
// }
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[]= new int[n+1];
		    int sum =0;
		    for(int i = 0; i < n+1;i++){
		        arr[i]=sc.nextInt();
		        sum+=arr[i];
		    }
		    int last = arr[n];
		  //  System.out.println(list);
		    Arrays.sort(arr,0,n);
		  //  System.out.println(list);
		    for(int i = 0;i<n;i++){
		        if(arr[i]<last){
		            continue;
		        }
		        while(i<n && last*2 >= arr[i]){
		            i++;
		        }
		        if (i > 0) {
                        last = arr[i-1];
                }
		            i--;
		        
		    }
		    System.out.println(sum-last);
		    
		}

	}
}
