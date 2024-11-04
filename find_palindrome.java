import java.util.Scanner;

public class find_palindrome {
    public static String odd_check(char arr[]){
        String str = new String("");
        if (arr.length<=2){
            return "";
        }
        int centre = 1;
        int max_length=0;int max_i=0;int max_y=0;
        while (centre<arr.length-1) {
            int i =1;
            int si=0;int ei=0;
            while (centre-i>=0 && centre+i<arr.length && arr[centre-i]==arr[centre+i]) {
                si=centre-i;
                ei=centre+i;
                i++;
            }
            if (ei-si>max_length) {
                max_length= ei -si;
                max_i=si;
                max_y=ei;
            }
            centre++;
        }
        for (int j = max_i; j <=max_y; j++) {
            str = str+arr[j];
        }
        return str;
    }
    public static String even_check(char arr[]){
        String str = new String("");
        if (arr.length==1){
            return "";
        }
        int max_length=0;int max_i=0;int max_y=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                int centre1 = i;
                int centre2 = i+1;
                int k =1;
                int si=0;int ei=0;
                while (centre1-k>=0 && centre2+k<arr.length && arr[centre1-k]==arr[centre2+k]) {
                    si=centre1-k;
                    ei=centre2+k;
                    k++;
                }
                if (ei-si>max_length) {
                    max_length= ei -si;
                    max_i=si;
                    max_y=ei;
                }
            }
        }
        for (int j = max_i; j <=max_y; j++) {
            str = str+arr[j];
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        
        String x = odd_check(arr);
        String y = even_check(arr);

        if (x.length()>y.length()){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
        sc.close();


    }
}
