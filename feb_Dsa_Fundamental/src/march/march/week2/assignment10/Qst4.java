/*4. Write a randomized quick sort, to sort the input arrays in descending order. */
package march.week2.assignment10;
import java.util.*;
public class Qst4 {
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    static int partition(int a[], int start, int end) {
        int i = start - 1;
        int j = start;
        int p = a[end];

        for (; j < end; j++) {
            if (a[j] < p) {
                ++i;

                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        int tmp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = tmp;
        return i + 1;
    }

    static void quicksort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pivot_idx = partition(arr, s, e);
        quicksort(arr, s, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, e);

    }

    public static void main(String args[]) {
        int arr[] = { 10, -1, -9, 2, 4, 5, 6, 8, 10, 11, 15 };
        shuffleArray(arr);
        quicksort(arr, 0, arr.length - 1);

        // display
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
