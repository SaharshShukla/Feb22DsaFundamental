/*2. https://leetcode.com/problems/powx-n/ "*/

package march.week2.assignment9;

public class Qst2 {
    static double myPow(double x, int n) {
        double res = 1;
        if(n < 0){
            n = -n;
            x = 1 / x; //If n is negative, then do (1/x)^(-n)
        }
        for(int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }
    public static void main(String[] args) {
        double rslt = myPow(2.00000, 10);
        System.out.println(" power of 2.00000^10 is "+ rslt);

        rslt = myPow( 2.10000,  3);
        System.out.println(" power of 2.10000^3 is "+rslt);

        rslt = myPow(2.00000,  -2);
        System.out.println(" power of 2.00000^-2 is "+rslt);


    }
}
/*
Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
 */