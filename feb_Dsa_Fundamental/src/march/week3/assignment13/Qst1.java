/*1. Find the kth element in a linked list from the end of singlly linked list in :
        1. Using two traversal*/
package march.week3.assignment13;
public class Qst1 {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }


    void printNthFromLast(int n){
        int length = 0;
        Node tempVar = head;


        while (tempVar != null) {
            tempVar = tempVar.next;
            length++;
        }

        if (length < n)
            return;

        tempVar = head;


        for (int i = 1; i < length - n + 1; i++)
            tempVar = tempVar.next;

        System.out.println(tempVar.data);
    }


    public void push(int newData){

        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args){
        Qst1 llist = new Qst1();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(4);
    }

}
/*1. Find the kth element in a linked list from the end of singlly linked list in :
        1. Using two traversal
        2. In single traversal (using 2 pointer approch).*/
