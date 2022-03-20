/*5. Using 2 stacks implement a queue. */
package march.week3.assignment11;
import java.util.*;
public class Qst5 {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    static void enQueue(int x){

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }


        stack1.push(x);


        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    static int deQueue(){

        if (stack1.isEmpty()){
            System.out.println("Q is Empty");
        }
        int x = stack1.peek();
        stack1.pop();
        return x;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        enQueue(1);
        enQueue(2);
        enQueue(3);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }

}

