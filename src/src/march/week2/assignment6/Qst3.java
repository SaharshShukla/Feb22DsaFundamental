/*3.Write a head recursion code to print only EVEN elements in decreasing order starting from user-defined input N.
        example: N = 76
                       Output: 76,74,72,70,68,66......2*/
package march.week2.assignment6;

public class Qst3 {
    public static void main(String[] args){
        printEvn(76);
    }

    static void printEvn( int num){

        //base condition
        if(num <= 2){
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        printEvn( num - 2) ;

    }
}


