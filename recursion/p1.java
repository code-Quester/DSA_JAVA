package recursion;
/**
 * p1
 */
public class p1 {
    public static void print(int n){
        if (n!=0){
            System.out.print(n+ " ");
            print(n-1);
        }
        return; 
    }
    public static void print_inc(int n){
        if (n!=1){
            print_inc(n-1);
        }
        System.out.print(n+ " ");
        return;
    }
    public static int factorial(int n){
        if (n==1){  //base condition
            return 1;
        }
        return (n * factorial(n-1));
    }

    public static int sum(int n){
        if (n==1){  //base condition
            return 1;
        }
        return (n + sum(n-1));
    }

    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 1; i < n-1; i++) {
            int c =  a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }

    public static int nth_fibo(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        int r = nth_fibo(n-1) + nth_fibo(n-2);
        return r;

    }
    public static boolean sorted(int arr[], int a){
        if (a == arr.length-1){
            return true;
        }
        if(arr[a]<= arr[a+1]){
            a= a+1;
            return sorted(arr, a);
        }
        else{
            return false;
        }

    }
    public static int first_occurence(int arr[],int key,int i){
        if (i== arr.length){return -1;}
        if (arr[i]== key){
            return i;
        }
        return first_occurence(arr, key, i+1);
    }
    public static int last_occurence(int arr[],int key,int i){
        if (i< 0){return -1;}
        if (arr[i]== key){
            return i;
        }
        return last_occurence(arr, key, i-1);
    }

    public static int last_occur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = last_occur(arr, key, i+1);
        if(isfound!=-1){
            return isfound;
        }
        if( arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static int xpowern(int x,int n ){
        if (n==1){
            return x;
        }
        return x * xpowern(x, n-1);
    }
    public static int xpn(int x,int n){
        if (n==1){
            return x;
        }
        int p = n/2;
        return (xpn(x,p)*xpn(x, n-p));
    }
    public static void main(String[] args) {
        // print(10);
        // System.out.println();

        // print_inc(10);

        // int a =factorial(6);
        // System.out.println(a);

        // System.out.println(sum(10));

        // fibonacci(15);

        // System.out.println(nth_fibo(15));

        // int arr[]= {1,2,3,5,4,5,5,4,4};
        // System.out.println(sorted(arr,0));

        // int arr[]= {1,2,3,5,4,5,5,4,4};
        // int key = 4;
        // int a = first_occurence(arr,key,0);
        // System.out.println(a);

        // int arr[]= {1,2,3,5,4,5,5,4,4};
        // int key = 4;
        // System.out.println(last_occur(arr,key,0));

        int x=2;
        int n=5;
        // System.out.println(xpowern(x,n));
        System.out.println(xpn(x,n));
    }
}