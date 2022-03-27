/*1. Find the kth element in a linked list from the end of singlly linked list in :
        2. In single traversal (using 2 pointer approch).*/
package march.week3.assignment13;

public class Qst2{
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            data = data;
            next = null;
        }
    }


    void printNthFromLast(int n){
        Node frstPntr = head;
        Node scndPntr = head;

        int count = 0;
        if (head != null){
            while (count < n){
                if (scndPntr == null){
                    System.out.println(n+ " is greater than the no "+ " of nodes in the list");
                    return;
                }
                scndPntr = scndPntr.next;
                count++;
            }

            if(scndPntr == null){

                if(head != null)
                    System.out.println("Node no. " + n +" from last is " +head.data);
            }else{

                while (scndPntr != null){
                    frstPntr = frstPntr.next;
                    scndPntr = scndPntr.next;
                }
                System.out.println("Node no. " + n +" from last is " +frstPntr.data);
            }
        }
    }

    public void push(int newData){

        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args){
        Qst2 l = new Qst2();
        l.push(20);
        l.push(4);
        l.push(15);
        l.push(35);

        l.printNthFromLast(4);
    }
}
