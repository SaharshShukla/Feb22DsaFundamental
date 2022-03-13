/*3. https://leetcode.com/problems/powx-n/ "*/
package march.week2.assignment9;

public class Qst3 {
    static int kthGrammar(int n, int k) {
        if (k == 1 && n == 1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } else {
            return 1 ^ (kthGrammar(n - 1, k - mid));
        }
    }
        public static void main(String[] args) {
            System.out.println(kthGrammar(1,1));
            System.out.println(kthGrammar(2,1));
            System.out.println(kthGrammar(2,2));
    }
}
/*
Example 1:

Input: n = 1, k = 1
Output: 0
Explanation: row 1: 0
Example 2:

Input: n = 2, k = 1
Output: 0
Explanation:
row 1: 0
row 2: 01
Example 3:

Input: n = 2, k = 2
Output: 1
Explanation:
row 1: 0
row 2: 01
 */