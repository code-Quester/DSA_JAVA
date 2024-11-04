public class compare_to {
    public static void main(String[] args) {
        String str[] = {"apple","banana","mango"};
        // if (str[0].compareTo(str[1])>0 && str[0].compareTo(str[2])>0){
        //     System.out.println("largest "+str[0]);

        // }
        // else if (str[1].compareTo(str[2])>0) {
        //     System.out.println("largest "+str[1]);
        // }
        // else{
        //     System.out.println("largest "+str[2]);
        // }


        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
}
