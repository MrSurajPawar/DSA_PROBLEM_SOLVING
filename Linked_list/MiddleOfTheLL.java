
public class MiddleOfTheLL {
        public ListNode middleNode(ListNode head) {
            //Tortoise and HAre algorithm
            ListNode slow = head , fast = head;
    
            while( fast != null && fast.next != null) {
                slow = slow.next;       //1 step only
                fast = fast.next.next;  //2 steps 
            }
            return slow ;
        }
}
