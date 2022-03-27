//https://www.geeksforgeeks.org/program-for-mean-and-median-of-an-unsorted-array/
package march.week1.assignment4;
import java.util.*;
public class Qst1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
        int length = arr.length;
        System.out.println("Mean = " + findMean(arr, length));
        System.out.println("Median = " + findMedian(arr, length));
    }
     static double findMean(int array[], int size){
        int sum = 0;
        for (int i = 0; i < size; i++)
            sum = sum + array[i];

        return (double)sum / (double)size;
    }

     static double findMedian(int array[], int size) {

        Arrays.sort(array);
        if (size % 2 != 0) {
            return (double) (array[size / 2]);
        }

        return (double)((array[(size - 1) / 2] + array[size / 2]) / 2.0);
    }
}
