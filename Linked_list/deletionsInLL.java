class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data , Node next) {
        this.data = data;
        this.next = next;
    }
}

public class deletionsInLL {

    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1 ;i < arr.length; i++ ) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
    }

    //Deletion operations
    private static Node deletionAtHead(Node head) {
        if (head == null) 
            return head;
        head = head.next;
        return head;
    }

    private static Node deletionAtTail(Node head) {
        if (head == null || head.next == null)  return head;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    private static Node deletionAtKthNode(Node head ,int k) {
        if (head == null) return head;

        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 0 ;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            count++;

            if(count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    
    private static Node deletionAtKthValue(Node head ,int el) {
        if (head == null) return head;

        if (head.data == el ) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        
        while (temp != null) {
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //Main method 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertToLL(arr);
       
        //Deletion at the head
        head = deletionAtHead(head);
        print(head);
        
        //Deletion at the tail
        head = deletionAtTail(head);
        print(head);

        //Deletion at the Kth position
        head = deletionAtKthNode(head , 3);
        print(head);
        
        //Deletion by Kth value 
        head = deletionAtKthValue(head , 2);
        print(head);
        
    }
}
