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

public class InsertionInLL {

    //Converting array to LL
    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length ;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    //Traversal
    private static void print (Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //Insertion operation
    private static Node inerstionAtHead(Node head , int val) {
        Node temp = new Node(val,head);
        return temp;
    }

    private static Node inerstionAtTail(Node head, int val) {
        if (head == null) {
            Node temp = new Node(val);
            return temp;
        } 

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(val);
        temp.next = newNode ;

        return temp;
    }

    private static Node inerstionAtKthPoNode(Node head, int k ,int val) {
        if (head == null ){
            if (k == 1) {
                return new Node(val);
            }
        }

        if (k == 1) {
            Node newNode = new Node(val , head);
            return newNode;
        }

        int count = 0 ;
        Node temp = head;
        while (temp != null) {
            count++;
            if(count == (k-1)) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    //Insertion by the value 
    private static Node insertionAtValuePosition(Node head , int el ,int val) {
        if (head == null) {
            return null;
        }

        if(head.data == val) {
            return new Node(el);
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {100,200,300,400,500};
        Node head = convertToLL(arr);
        
        //Inerstion At Head
        head = inerstionAtHead(head,600);
        print(head);

        // Insertion at tail
        head = inerstionAtTail(head, 700);
        print(head);

        //Insertion at Kth position
        head = inerstionAtKthPoNode(head,3,23);
        print(head);

        //Insertion at Value position
        head = insertionAtValuePosition(head,45,200);
        print(head);
    }
}
