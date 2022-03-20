/*"1.Reverse a number using a recursive program.*/
package march.week2.assignment7;

public class Qst1 {
    public static void main(String[] args){
        int num = 1234899;
        reverse (num);

    }
    static void reverse ( int num) {
        //base condition
        if( num < 10){ // number is less tah 10 to print the unit digit
                      // in place of if we used 0 thna there will be stack over flow
            System.out.print(num  + " ");
            return ;
        }

          System.out.print(num % 10 + " ");
          reverse( num /10) ;

    }
}


