package sorting;
public class OptimizedBubbleSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Optimized bubble sort algorithm
        boolean swapped = true;
        int n = array.length;
        for (int i = 0; i < n - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] +" ");
        }
    }
}