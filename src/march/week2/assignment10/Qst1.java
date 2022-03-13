/*"1. Implement a Merge sort to sort the input array in asceding order..  */
package march.week2.assignment10;

public class Qst1 {
   static  void merge(int arr[], int start, int end) {
        int mid = (end + start) / 2;
        int i = start, k = start, j = mid + 1;

        int tmp[] = new int[arr.length];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]){
                tmp[k++] = arr[i++];
            } else {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= end) {
            tmp[k++] = arr[j++];
        }

        for (i = start; i <= end; i++) {
            arr[i] = tmp[i];
        }
    }


    static void sort(int arr[], int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, right);
        }

    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7, -1, 0 };
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        printArray(arr);
    }
}

