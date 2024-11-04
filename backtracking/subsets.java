package backtracking;

/**
 * subsets
 */
public class subsets {
    public static void  form_subsets(String str,String subset,int i){
        if (i==str.length()){
            if(subset.length()==0){
                System.out.println("null");
            }else{
                System.out.println(subset);
            }
            return;
        }
        //if choice is yes
        form_subsets(str, subset+str.charAt(i), i+1);
        //if choice is no
        form_subsets(str, subset, i+1);
        

    }

    public static void main(String[] args) {
        String str ="abc";
        form_subsets(str,new String(),0);
    }
}