//Linked list analogy
class Node {

    int data;
    Node next;

    //constructor 
    Node(int d){
        this.data = d;
        this.next = null;
    }

    //contructor 2
    // Node(int d , Node n){
    //     this.data = d;
    //     this.next = n;
    // }
}

public class tempLinkedList{

    private static Node convertToLinkedList(int[] arr) {
        //Initially 
        Node head = new Node(arr[0]);
        Node mover = head;

        //then we have to create each nodes and then linked each one of them
        for (int i = 1 ; i < arr.length ; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    //Finding the length of the linked list
    private static int lenthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    //Searching operation on Linked List
    private static int searchInLinkedList(Node head, int k) {
        Node temp = head;

        while(temp != null) {
            if (temp.data == k) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertToLinkedList(arr); // returns the starting index oflist ie arr[0]
        
        //Traversing the linkded list
        Node temp = head;       // dont tamper with head node
        while (temp != null) {
            System.out.print(temp.data  + " ");
            temp = temp.next;
        }

        //finding the length of linked list
        System.out.print("The length of the linkedList is : " + lenthOfLinkedList(head));

        //search in the linked List
        System.out.print(" Search is " + searchInLinkedList(head,5));
    }
}