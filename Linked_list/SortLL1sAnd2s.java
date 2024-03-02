//Sorting the linked list in asceding order 0s 1s and 2s 
public class SortLL1sAnd2s {
    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        //Dummy nodes 
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead , one = oneHead , two = twoHead;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newHead = zeroHead.next;
        return newHead; 
    }
}
