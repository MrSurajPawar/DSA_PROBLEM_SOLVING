/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 class Queue{
     Node front;
     Node rear;
     void push(){};
     Queue() {
         front = null;
         rear = null;
     }
 }

 *****************************************************************/

 public class QueueUsingLL extends Queue {
    public void push(int x) {
        // Write Your Code Here
        Node temp = new Node(x);
        if (front == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    public int pop() {
        // Write Your Code Here
        if (front == null)
            return -1;

        int val = front.data;
        front = front.next;
        
        return val;
    }
}