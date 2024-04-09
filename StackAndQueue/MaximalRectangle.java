import java.util.Stack;
import java.lang.Math;

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

    public static int maxHistogram(int[] heights) {
        int maxAns = 0;
        int ps[] = prevSmaller(heights);
        int ns[] = nextSmaller(heights);

        for (int i = 0; i < heights.length; i++) {
            maxAns = Math.max(maxAns, (ns[i] - ps[i] - 1) * heights[i]);
        }

        return maxAns;
    }

    public static int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {
        int currRow[] = mat[0];
        int maxAns = maxHistogram(currRow);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    currRow[j] += 1;
                else
                    currRow[j] = 0;
            }

            int currAns = maxHistogram(currRow);
            maxAns = Math.max(maxAns, currAns);

        }
        return maxAns;
    }
}
