class Node {
    public int data;   
    public Node next;  

    public Node(int data, Node next) {
        this.data = data;
        this.next = next
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoopInLL {
    public static boolean detectCycle(Node head) {
       
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true;  // Loop detected
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
       
        fifth.next = third;

        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
