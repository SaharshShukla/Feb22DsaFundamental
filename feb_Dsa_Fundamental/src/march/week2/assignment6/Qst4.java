/*4.Write a recursive code to find the factorial of a user defined N
        example : N = 5 => 5! => 120 must be printed on screen.*/
package march.week2.assignment6;

public class Qst4 {
    public static void main(String[] args){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}

