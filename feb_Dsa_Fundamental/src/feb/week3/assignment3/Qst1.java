//https://leetcode.com/problems/sort-an-array/
package feb.week3.assignment3;

public class Qst1 {
    public static void main(String[] args) {
        int[] arrOne = {5, 2, 3, 1};
        int[] arrTwo = {5, 1, 1, 2, 0, 0};
        int[] rslt = sort(arrOne);
        for (int i = 0; i < rslt.length; i++) {
            System.out.print(rslt[i] + " ");
        }
        System.out.println();
        rslt = sort(arrTwo);
        for(int i = 0; i < rslt.length; i++  ){
            System.out.print(rslt[i] + " ");
        }
    }



    static int[] sort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
    }


/*
Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]

 */