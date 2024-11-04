public class dp {

    // public static int fib(int n,int f[]){
    //     if (n==0||n==1) {
    //         return n;
    //     }
    //     if (f[n]!=0) {
    //         return f[n];
    //     }
    //     f[n]= fib(n-1,f)+fib(n-2, f);
    //     return f[n];
    // }

    // public static int climbing_stairs(int n,int f[]){
    //     if (n==0||n==1) {
    //         return 1;
    //     }
    //     if(f[n]!=0){
    //         return f[n];
    //     }
    //     f[n]=(climbing_stairs(n-1,f)+climbing_stairs(n-2,f));
    //     return f[n];
    // }
    public static void fib(int n,int f[],int current_idx){

        f[current_idx]=f[current_idx-1]+f[current_idx-2];
        if (current_idx == n) {
            for (int i=0;i<f.length;i++) {
                System.out.print(f[i]+" ");
            }
            return;
        }
        fib(n, f, current_idx+1);
    }

    public static void main(String[] args) {
        int n= 8;
        int f[]=new int[n+1];
        f[0]=0;
        f[1]=1;
        fib(n,f,2);
        // int n=4;
        // int f[]= new int[n+1];
        // System.out.println(climbing_stairs(n,f));
    }
}
