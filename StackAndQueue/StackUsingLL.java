/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
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


 *****************************************************************/
public class StackUsingLL {
    static class Stack {
        //Write your code here
        Node head;
        int size;
        Stack()
        {
            //Write your code here
            head = null;
            size = 0;
        }

        int getSize()
        {
            //Write your code here
            return size;
        }

        boolean isEmpty()
        {
            //Write your code here
            if (head == null) 
                return true;
            else 
                return false;
        }
        
        void push(int data)
        {
            //Write your code here
            Node temp = new Node(data);
            temp.next = head;
            size++;
            head = temp; 
        }

        void pop()
        {
            //Write your code here
            if (head == null)
                return;

            head = head.next;
            size--; 
        }

        int getTop()
        {
            //Write your code here
            if (head == null)
                return -1; 
            return head.data;
        }
    }
}

