/*"1. Inversion count for a given array.*/
package march.week2.assignment9;
import java.util.*;
public class Qst1 {
    static int mergeAndCount(int[] arr, int l,int m, int r) {

            int[] left = Arrays.copyOfRange(arr, l, m + 1);
            int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

            int i = 0, j = 0, k = l, swaps = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                }else {
                    arr[k++] = right[j++];
                    swaps += (m + 1) - (l + i);
                }
            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
            return swaps;
        }

         static int mergeSortAndCount(int[] arr, int left, int right) {
            int count = 0;

            if (left < right) {
                int mid = (left + right) / 2;
                count += mergeSortAndCount(arr, left, mid);
                count += mergeSortAndCount(arr, mid + 1, right);
                count += mergeAndCount(arr, left, mid, right);
            }

            return count;
        }


        public static void main(String[] args){
            int[] arr = { 1, 20, 6, 4, 5 };
            System.out.println("Number of inversions are " + mergeSortAndCount(arr, 0, arr.length - 1));
        }
}



