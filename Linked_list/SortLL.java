public class SortLL 
    public static ListNode findMiddleNode( ListNode head) {
        ListNode slow = head , fast = head.next;

        while ( fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode mergeTwoLists(ListNode list1 , ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while ( list1 != null && list2 != null) {
            if ( list1.val < list2.val ) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if ( list1 != null ) temp.next = list1;
        else    temp.next = list2;

        return dummyNode.next; 
    }
    public ListNode sortList(ListNode head) {
        if ( head == null || head.next == null) {
            return head;
        }

        ListNode midNode = findMiddleNode( head );  //Tortoise and hare algorithm

        ListNode leftHead = head , rightHead = midNode.next;
        midNode.next = null;

        leftHead = sortList( leftHead );
        rightHead = sortList( rightHead );

        return mergeTwoLists( leftHead , rightHead ); 
    }
}
