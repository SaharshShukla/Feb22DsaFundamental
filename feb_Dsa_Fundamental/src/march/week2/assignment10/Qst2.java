/*2 .Implement a Merge sort to sort the input array of chars in descending order..
     arr = {'a','x','y','b','A','T','t'};*/

package march.week2.assignment10;

public class Qst2 {
    static  void merge(char arr[], int start, int end) {
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
            arr[i] = (char) tmp[i];
        }
    }


    static void sort(char arr[], int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, right);
        }

    }

    static void printArray(char arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        char arr[] = {'a','x','y','b','A','T','t'};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
