import java.util.Stack;

public class Solution {
    public static void immediateSmaller(int []a) {
        // Write your code here.
        Stack<Integer> s = new Stack<>();
        int n = a.length;

        s.push(a[0]);

        for (int i = 0 ; i < n - 1 ; i++) {
            int ele = a[i+1];
            if (s.peek() < ele){
                a[i] = -1;
            } else {
                a[i] = ele;
            }
            s.push(ele);
        }
        a[n-1] = -1;
    }
}
