package feb.week3.assignment1;

    public class Qst3 {
        public static void main(String[]args){
            int nums[]={0, 1, 2, 6, 9, 11, 15};
            int lngthOne = nums.length;
            int numsOne[]={1, 2, 3, 4, 6, 9, 11, 15};
            int lngthTwo = numsOne.length;
            int numsTwo[]={0, 1, 2, 3, 4, 5, 6};
            int lngthThree = numsTwo.length;
            int rslt =  findFirstMissing(nums,0, lngthOne - 1);
            System.out.println("Missing number  of array one is "+rslt);
            rslt = findFirstMissing(numsOne,0, lngthTwo - 1);
            System.out.println("Missing number of array two  is "+rslt);
            rslt = findFirstMissing(numsTwo,0, lngthThree - 1);
            System.out.println("Missing number  of array three is "+rslt);

        }
       static  int findFirstMissing(int array[], int start, int end){
            if (start > end) {
                return end + 1;
            }
            if (start != array[start]) {
                return start;
            }
            int mid = (start + end) / 2;

            if (array[mid] == mid) {
                return findFirstMissing(array, mid + 1, end);
            }
            return findFirstMissing(array, start, mid);
        }
    }

/*3.  Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.
Input:  nums[] = [0, 1, 2, 6, 9, 11, 15]
Output: The smallest missing element is 3

Input:  nums[] = [1, 2, 3, 4, 6, 9, 11, 15]
Output: The smallest missing element is 0

Input:  nums[] = [0, 1, 2, 3, 4, 5, 6]
Output: The smallest missing element is 7

 */


