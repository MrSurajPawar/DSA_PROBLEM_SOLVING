import java.util.ArrayList;

public class ReverseLLByKGroups1 {
    public static ArrayList function(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0 ; (i + k - 1) < n ; i = i + k) {
           for (int j = 0 ; j < k / 2 ; j++) {

               int temp = arr.get( i + j );
               arr.set( i + j , arr.get( i + k -1 - j ) );
               arr.set( ( i + k -1 - j ) , temp );
           
           }
        }

        return arr;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode temp = head; 

        while ( temp != null) {
            arr.add( temp.val );
            temp = temp.next;
        }
        
        int n = arr.size();
        function(arr, n, k);

        int i = 0;
        temp = head;
        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}

