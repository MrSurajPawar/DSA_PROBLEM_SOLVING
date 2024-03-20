class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1 , temp2 = l2;
        ListNode dummyNode = new ListNode( -1 );    //dummyNode
        ListNode curr = dummyNode;
        int carry = 0

        while ( temp1 != null || temp2 != null) {
            int sum = carry;

            if (temp1 != null)   sum += temp1.val;
            if (temp2 != null)   sum += temp2.val;

            ListNode newNode = new ListNode( sum % 10);     //Unit digit of sum
            carry = sum / 10;       //tenth's place
            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null)   temp1 = temp1.next;
            if (temp2 != null)   temp2 = temp2.next;

        } 

        if (carry != 0){
            ListNode newNode = new ListNode( carry );
            curr.next = newNode;
        }

        return dummyNode.next;
    }
}
