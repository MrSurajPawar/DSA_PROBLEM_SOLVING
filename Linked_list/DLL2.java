class ListNode {
    int data;
    ListNode next
    ListNode back;

    ListNode(int data1 , ListNode next1 , ListNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    ListNode(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DLL2 {
    private static ListNode convertToDll(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for (int i = 1 ;i < arr.length ; i++) {
            ListNode temp = new ListNode(arr[i] , null , prev);
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

    //Insertion in DLL
    //at the head 
    private static ListNode insertionAtHead(ListNode head , int val) {
        ListNode newHead = new ListNode(val , head, null);
        head.back = newHead;
        return newHead; 
    }
    //at the tail(before)
    private static ListNode insertionAtTail(ListNode head , int val) {
        if (head.next == null) {
            return insertionAtHead(head, val);
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        ListNode prev = temp.back;
        ListNode newNode = new ListNode(val , temp , prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    //at kth position
    private static ListNode insertionAtKthPosition(ListNode head , int k ,int val) {
        if (k == 1)
            return insertionAtHead(head, val);

        ListNode temp = head;
        // k = k-1;
        // while (k > 0) {
        //     temp = temp.next;
        //     k--;
        // }
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k)   break;
            temp = temp.next;
        }

        ListNode prev = temp.back;
        ListNode newNode = new ListNode(val , temp , prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    //Insert before given node 
    private static ListNode insertBeforeGivenNode(ListNode head , int givenNode , int val) {
        if (head.data == givenNode)
            return insertionAtHead(head, val);
        
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == givenNode){
                ListNode prev = temp.back;
                ListNode newNode = new ListNode(val, temp , prev);
                prev.next = newNode;
                temp.back = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = convertToDll(arr);
        //print(head);

        //Insertion at head 
        // head = insertionAtHead(head , 11);
        // print(head);

        //insertion at tail (before)
        // head = insertionAtTail(head , 77);
        // print(head);

        //Insertion at middle kth postion
        // head = insertionAtKthPosition(head, 3, 300);
        // print(head);

        //Insertion before given node
        head = insertBeforeGivenNode(head , 1 , 400);
        print(head);
    }    
}
