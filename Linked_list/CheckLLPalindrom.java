public class CheckLLPalindrom {
    
        private static ListNode reverseSecondHalf(ListNode head) {
            if(head == null || head.next == null) return head;
    
            ListNode temp = head , prev = null;
            
            while(temp != null) {
                ListNode front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
            return prev;
        }
    
        public boolean isPalindrome(ListNode head) {
           ListNode slow = head , fast = head;
    
           while( fast.next != null && fast.next.next != null ) {
               slow = slow.next;
               fast = fast.next.next;
           }
    
           ListNode newHead = reverseSecondHalf( slow.next );
           ListNode first = head , second = newHead;
           
           while( second != null) {
               if( first.val != second.val ) {
                   reverseSecondHalf(newHead);
                   return false;
               }
    
               first = first.next;
               second = second.next;
           }
    
           reverseSecondHalf(newHead);
           return true;
        }
 }
