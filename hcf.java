public class hcf {
    public static int calc(int a,int b){
        if (a==0) {
            return b;
        }
        if (b>a){
            return calc(b-a, a);
        }
        return calc(a-b, b);
    }
    public static int calc2nd(int a,int b){
        if (a%b==0) {
            return b;
        }
        
        return calc2nd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(calc(735,280));
        System.out.println(calc2nd(735,280));
    }
}
