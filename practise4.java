// import java.util.ArrayList;

// public class practise4 {
//     public static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             arr.add(data);

//             int x = arr.size()-1;
//             int par = (x-1)/2;

//             while (arr.get(x)<arr.get(par)) {
//                 int temp =  arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x= par;
//                 par = (x-1)/2;
//             }

//         }    
//         public int peek(){
//             return arr.get(0);
//         }   
//         public void heapify(int i){
//             int left = 2*i +1;
//             int right = 2*i +2;
//             int minidx = i;
//             if(left<arr.size() && arr.get(left)< arr.get(minidx)){
//                 minidx = left;
//             }
//             if(right<arr.size() && arr.get(right) < arr.get(minidx)){
//                 minidx = right;
//             }
//             if (minidx!=i) {
//                 int temp = arr.get(i);
//                 arr.set(i,arr.get(minidx));
//                 arr.set(minidx,temp);

//                 heapify(minidx);
//             }
//         } 
//         public int remove(){
//             int data = arr.get(0);

//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1,temp);

//             arr.remove(arr.size()-1);

//             heapify(0);
//             return data;
//         }
//         public boolean isEmpty(){
//             return arr.size() ==0;
//         }
//     }
//     public static void main(String[] args) {
//         Heap heap = new Heap();
//         heap.add(2);
//         heap.add(3);
//         heap.add(4);
//         heap.add(5);
//         heap.add(10);
//         heap.add(1);
//         System.out.println(heap.arr);
//         while(!heap.isEmpty()){
//             System.out.println(heap.peek());
//             heap.remove();
//         }
//     }
// }


/**
 * practise4
 */
public class practise4 {
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minidx = i;

        if (left<size && arr[left]<arr[minidx]) {
            minidx = left;
        }
        if (right <size && arr[right]<arr[minidx]) {
            minidx = right;
        }
        if (minidx != i) {
            int temp = arr[minidx];
            arr[minidx]= arr[i];
            arr[i]= temp;

            heapify(arr, minidx, size);
        } 
    }

    public static void heapSort(int arr[]){
        //min heap to sort in descending order
        int n= arr.length;
        for (int i = n/2; i >=0 ; i--) {
            heapify (arr, i, n);
        }
        //swap the minimum element with the last element
        for(int i = n-1; i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;

            heapify(arr, 0, i);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,9,2,4,3};
        heapSort(arr);
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
