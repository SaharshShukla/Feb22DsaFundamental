/*
"1.Write a recursive code for finding the max and min element in the given array arr ={1,-1,0,2,-2,3,-3,4,-4}
        NOTE: pass arr in every function call.*/
package march.week2.assignment6;

public class Qst1 {
    public static void main(String[] args){
        int[] arr = {1,-1,0,2,-2,3,-3,4,-4};
         min( arr, 0);
         max( arr, 0);

    }

    static void min( int[] arr, int idx){
        int minValue = arr[0];
        //base condition
        if(arr.length == idx){
            System.out.println("End of array ");
            return ;
        }
        //logic
        if(arr[idx] < minValue){
            minValue = arr[idx];
            System.out.println("Minimum number is "+ minValue );
            System.out.println("Last value  before end of array is Minimum number  " );
        }

        min( arr, idx + 1);

    }

    static void max( int[] arr,int idx){
        int maxValue = arr[0];
        //base condition
        if(arr.length == idx){
            System.out.println("End of array ");
            return ;
        }
        //logic
        if(arr[idx] > maxValue){
            maxValue = arr[idx];
            System.out.println("Maximum number is "+ maxValue );
            System.out.println("Last value  before end of array is Maximum number  " );
        }
        max( arr, idx + 1);
    }
}


