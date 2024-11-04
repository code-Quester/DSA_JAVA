package recursion;
public class digits_to_words {
    public static void convert(String str ,String arr[],int i,StringBuilder sb){
        if(i==str.length()){
            System.out.println(sb);
            return;
        }
        char ch= str.charAt(i);
        Integer digit = Integer.valueOf(String.valueOf(ch));
        sb.append(arr[digit]+" ");
        convert(str, arr, i+1, sb);
    }
    public static void convert2(int n,String arr[]){
        if (n==0){
            return;
        }
        int ld = n%10;
        convert2(n/10, arr);
        System.out.print(arr[ld]+" ");
    }
    public static void main(String[] args) {
        int n=1947;
        String str = String.valueOf(n);
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        convert(str,arr,0,new StringBuilder(""));
        convert2(n,arr);
    }
}
