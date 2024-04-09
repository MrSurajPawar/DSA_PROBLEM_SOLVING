import java.util.Stack;

public class Solution {
    public static int[] prevSmaller(int[] arr) {
        int ps[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                ps[i] = -1;
            else
                ps[i] = s.peek();

            s.push(i);
        }

        return ps;
    }

    public static int[] nextSmaller(int[] arr) {
        int ns[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty())
                ns[i] = arr.length;
            else
                ns[i] = s.peek();

            s.push(i);
        }

        return ns;
    }

    public int largestRectangleArea(int[] heights) {
        int maxAns = 0;
        int ps[] = prevSmaller(heights);
        int ns[] = nextSmaller(heights);

        for (int i = 0; i < heights.length; i++) {
            maxAns = Math.max(maxAns, (ns[i] - ps[i] - 1) * heights[i]);
        }

        return maxAns;
    }
}
