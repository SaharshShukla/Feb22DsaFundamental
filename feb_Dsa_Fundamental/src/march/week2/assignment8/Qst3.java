/*3. Write a recursive code to find the x^y . example: 2^5 = 32.        */
package march.week2.assignment8;

public class Qst3 {
    static int pow(int a, int b) {
        if (b == 0)
            return 1;

        int res = pow(a, b / 2);

        if (b % 2 != 0) {
            return (a * res * res);
        } else
            return (res * res);
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 3));

    }
}

