/*3. Write a vanilla Quick sort algorithm.*/

package march.week2.assignment10;

public class Qst3 {
    static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int j = start;
        int p = arr[end];

        for (; j < end; j++) {
            if (arr[j] < p) {
                ++i;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[++i];
        arr[i] = arr[end];
        arr[end] = tmp;
        return i;
    }

    static void quicksort(int arr[], int start, int end) {
        //Base case.
        if (start >= end) return;
        int pivot_idx = partition(arr, start, end);
        quicksort(arr, start, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, end);
    }

    public static void main(String[] args) {
        int a[] = { 10, -1, -9, 2, 4, 5, 6, 8, 10, 11, 15 };
        quicksort(a, 0, a.length - 1);

        // display
        for (int i = a.length - 1; i >=0 ; i--) {
            System.out.print(a[i] + ",");
        }
    }
}
