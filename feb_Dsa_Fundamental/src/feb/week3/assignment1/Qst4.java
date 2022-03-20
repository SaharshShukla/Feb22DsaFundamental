package feb.week3.assignment1;

public class Qst4 {
    public static void main(String[] args){
        int array[]={1,3,5,6};
        int index=binarySearch(array,2);
        System.out.println("Element to be inserted at index and the index is:  "+index);
        index=binarySearch(array,7);
        System.out.println("Element to be inserted at index and the index is:  "+index);
    }
    static int binarySearch(int[] array,int target){
        int start=0;
        int end=array.length-1;
        int indx=-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target>array[mid]){
                start=mid+1;
                indx=start;
            }
            else{
                end=mid-1;
                indx=end;
            }
        }
        return indx;
    }
}
/*
4. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4
"
 */