/*3.Write a recursive binary search.*/
package march.week2.assignment7;

public class Qst3 {
     static int binarySearch(int arr[], int left, int right, int target){
        if (right >= left) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target){
                return mid;
            }


            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, right, target);
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int lngth = arr.length;
        int target = 10;
        int result = binarySearch(arr, 0, lngth - 1, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}


/*4. Predict the output of this program, with call stack behavior.
        import java.io.*
        class GFG {
            static int fp = 15;
            static int fun ( int n)
            {
                int t, f;

                if ( n <= 2 )
                {
                    fp = 1;
                    return 1;
                }
                t = fun ( n - 1);
                f = t + fp;
                fp = t;
                return f;
            }
            public static void main (String[] args)
            {
                System.out.println(fun(5));
            }
        }
        "
 */
