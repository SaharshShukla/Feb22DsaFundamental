/*2. Calculate the avg of elements of an array using recursive code.        */
package march.week2.assignment7;

public class Qst2 {

    static double avgRec(int arr[], int idx, int lngth){
        // base condition
        if (idx == lngth-1){
            return arr[idx];
        }


        if (idx == 0){
            return ((arr[idx] + avgRec(arr, idx+1, lngth))/lngth);
        }
        // Compute sum
        return (arr[idx] + avgRec(arr, idx+1, lngth));
    }


    static double average(int arr[], int lngth){
        return avgRec(arr, 0, lngth);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int lngth = arr.length;
        System.out.println(average(arr, lngth));
    }

}
