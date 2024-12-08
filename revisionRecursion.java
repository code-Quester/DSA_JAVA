public class revisionRecursion {
    public static int factorial(int n){
        if (n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void increasingOrder(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
        return;
    }
    public static int sumN(int n){
        if (n==1) {
            return 1;
        }
        return (n+sumN(n-1));
    }
    public static int Nthfib(int n){
        if (n==1 || n==2) {
            return n-1;
        }
        return Nthfib(n-1) + Nthfib(n-2);
    }
    public static boolean check(int a[], int idx){
        if (idx==a.length-1) {
            return true;
        }
        if (a[idx]<= a[idx+1]) {
            return check(a,idx+1);
        }
        return false;
    }
    public static int lastOccurence(int a[], int key, int idx){
        if (idx == a.length) {
            return -1;
        }
        int isFound = lastOccurence(a, key, idx+1);
        if(isFound!=-1){
            return isFound;
        }
        if (a[idx]==key) {
            return idx;
        }
        return isFound;
    }
    public static int countWays(int n)
    {
        if(n==1||n==2){
            return n;
        }
        return (countWays(n-1)+countWays(n-2));
    }
    public static void removeDuplicates(String str, StringBuilder res, int idx, boolean arr[]){
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        char ch = str.charAt(idx);
        if (arr[ch-'a']== true) {
            removeDuplicates(str, res, idx+1, arr);
        }else{
            arr[ch-'a'] =true;
            removeDuplicates(str, res.append(ch), idx+1, arr);
        }
    }
    public static int ways(int n){
        if(n==1||n==2){
            return n;
        }
        return ways(n-1)+ (n-1)* ways(n-2);
    }
    public static int binaryStrings(int n){
        if (n==1 || n==0) {
            return n+1;
        }
        return binaryStrings(n-1)+ binaryStrings(n-2);
    }
    public static void printbinaryStrings(int n, String s , int idx,int lp){
        if (idx==n) {
            System.out.println(s);
            return;
        }
        printbinaryStrings(n, s+"0", idx+1, 0);
        if (lp==0) {
            printbinaryStrings(n, s+"1", idx+1, 1);
        }
    }
    public static void printSubsets(String str, String res, int idx){
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        char ch = str.charAt(idx);
        printSubsets(str, res+ch, idx+1);
        printSubsets(str, res, idx+1);
        return;
    }
    public static void findPermutations(String str, String res){
        if (str.length()==0) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String copy = str;
            str = str.substring(0, i) + str.substring(i+1, str.length());
            findPermutations(str, res+ch);
            // res = res.substring(0, res.length()-1);
            str = copy;
        }
        return;
    }
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // increasingOrder(20);
        // System.out.println(sumN(10));
        // System.out.println(Nthfib(8));
        // int a[]= {1,6,3,6,6,6,6,6};
        // System.out.println(check(a,0));
        // System.out.println(lastOccurence(a,6,0));
        //tiling problrm
        // System.out.println(countWays(5));
        // boolean arr[]= new boolean[26];
        // removeDuplicates("aabbceffg",new StringBuilder(""), 0, arr);
        // System.out.println(ways(5));
        // System.out.println(binaryStrings(4));
        // printbinaryStrings(4,new String(""), 0,0);
        // printSubsets("abc",new String(""),0);
        findPermutations("1234",new String(""));
    }
}
