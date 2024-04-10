class ListNode {
    int data;
    ListNode next;
    ListNode back;

    ListNode(int data1, ListNode next1, ListNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DLL {
    private static ListNode convertToDLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Deletion Operations
    // Deletion at the head
    private static ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;
        return head;
    }

    // Deletion at the tail
    private static ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        ListNode newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }

    // Deletion at Kth Node
    private static ListNode deletionAtKthNode(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }

        ListNode prev = temp.back;
        ListNode front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;
    }

    private static ListNode deleteNodeValueBased(ListNode head, int element) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.data == element) {
                ListNode prev = temp.back;
                ListNode front = temp.next;

                if (prev == null) {
                    // Deleting the head
                    head = front;
                } else {
                    // Deleting a node in the middle or tail
                    prev.next = front;
                }

                if (front != null) {
                    // If deleting a node in the middle
                    front.back = prev;
                }

                temp.next = temp.back = null;
                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    private static void findLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        System.out.println("Length of DLL is " + length);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 23, 42, 51 };
        ListNode head = convertToDLL(arr);
        // print(head);
        // findLength(head);

        // //Deletion at head
        //head = deleteHead(head);
        //print(head);

        // Deletion at tail
        //head = deleteTail(head);
        //print(head);

        // Deletion at Kth node
        //head = deletionAtKthNode(head , 3);
        //print(head);
        
        //Deletion at value 
        head = deleteNodeValueBased(head, 51);
        print(head);
    }
}
