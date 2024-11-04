package Divide_and_Conquer;
public class merge_sort_forstrings {
    public static void merge (String arr[],int si,int ei,int mid){
        int i=si;
        int j=mid+1;
        int k=0;
        String a[]=new String[ei-si+1];
        while (i<=mid &&j<=ei) {
            if (arr[i].compareToIgnoreCase(arr[j])<0) {
                a[k]=arr[i];
                i++;
            }else{
                a[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            a[k++]=arr[i++];
        }
        while (j<=ei) {
            a[k++]=arr[j++];
        }
        k=0;
        for (int l = si; l <=ei; l++) {
            arr[l]=a[k++];
        }
    }
    public static void m_sort(String arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+ (ei-si)/2;
        m_sort(arr, si, mid);
        m_sort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }
    public static void main(String[] args) {
        String arr[]={"mango","hello","man","hell","good"};
        m_sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
