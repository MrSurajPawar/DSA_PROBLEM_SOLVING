public class LoopLength 
    private static int findLength(Node slow , Node fast) {
        int countOfSlow = 1;
        slow = slow.next;

        while(slow != fast) {
            countOfSlow++;
            slow = slow.next;
        }
        return countOfSlow;
    }
    public static int lengthOfLoop(Node head) {
        Node slow = head , fast = head;
         
        while(fast != null  && fast.next != null) {
            slow = slow.next;
           
            fast = fast.next.next;

            if(slow == fast) {
                return findLength(slow ,fast);
            }
        }
        return 0;
    }
}
