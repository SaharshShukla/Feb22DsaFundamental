/*6. Using 2 queue implement a stack.*/
package march.week3.assignment11;
import java.util.*;

class Stack<Target>{
    Queue<Target> a1, a2;


    public Stack(){//satck constructor
        a1 = new ArrayDeque<>();
        a2 = new ArrayDeque<>();
    }

    //function to add a1 n a2 value
    void add(Target data){

        while (!a1.isEmpty()){//condition to check if  a1 empty
            a2.add(a1.peek());
            a1.poll();
        }


        a1.add(data);


        while (!a2.isEmpty()){//condition to check if  a2 empty
            a1.add(a2.peek());
            a2.poll();
        }
    }


    public Target poll(){//mehod to conver queue into stack

        if (a1.isEmpty()){
            System.out.println("Underflow!!");//condition to check if  a1 empty
            System.exit(0);
        }


        Target front = a1.peek();
        a1.poll();

        return front;
    }
}
public class Qst6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = { 1, 2, 3, 4, 5 };

        Stack<Integer> s = new Stack<Integer>();
        for (int i=0 ;i<array.length;i++){
            s.add(array[i]);
        }

        for (int i = 0; i <= array.length; i++)
        {
            System.out.println(s.poll());
        }

    }

}

