/*2.Write a recursive code for printing the Fibonacci series up to N.
        example : if the user enters 10 , then print 1,1,2,3,5,8,13,21,34,55*/
package march.week2.assignment6;

public class Qst2 {
    public static void main(String[] args){

        int count=11;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }

    static int n1=0,n2=1,n3=0;

    static void printFibonacci(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }

}

