/*1. Create a myStack Class which has the following methods:
        1. Push(x) : inserts the data into the stack
        2. Pop(): Removes the top element.
        3. Peek() : Displays the top element.*/
package march.week3.assignment11;

public class Qst1 {
    public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(100);
        s.push(101);
        s.push(102);
        System.out.println(s.pop() + " Popped/Removed from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
class MyStack {
    static int MAX = 10;
    int top;
    int[] arr = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    MyStack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {

            arr[++top] = x;
            System.out.println(x + " pushed/Added into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = arr[top];
            top --;
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}
