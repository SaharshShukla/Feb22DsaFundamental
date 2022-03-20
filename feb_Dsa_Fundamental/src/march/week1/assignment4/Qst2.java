//https://www.geeksforgeeks.org/sort-array-according-order-defined-another-array/
package march.week1.assignment4;
import java.util.*;
public class Qst2 {
    public static void main(String[] args) {
        int arrOne[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int arrTwo[] = { 2, 1, 8, 3 };
        int m = arrOne.length;
        int n = arrTwo.length;
        System.out.println("Sorted array is ");
        sortAccording(arrOne, arrTwo, m, n);
        printArray(arrOne, m);
    }
    static int first(int arr[], int start, int end, int x, int n)
    {
        if (end >= start){
            int mid = start + (end - start) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            if (x > arr[mid])
                return first(arr, (mid + 1), end,
                        x, n);
            return first(arr, start, (mid - 1), x, n);
        }
        return -1;
    }
    static void sortAccording(int arrOne[], int arrTwo[], int m, int n){

        int temp[] = new int[m], visited[] = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = arrOne[i];
            visited[i] = 0;
        }
        Arrays.sort(temp);
        int ind = 0;
        for (int i = 0; i < n; i++) {
            int f = first(temp, 0, m - 1, arrTwo[i], m);
            if (f == -1)
                continue;
            for (int j = f; (j < m && temp[j] == arrTwo[i]); j++) {
                arrOne[ind++] = temp[j];
                visited[j] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            if (visited[i] == 0){
                arrOne[ind++] = temp[i];
            }

        }
    }
    static void printArray(int arr[], int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
