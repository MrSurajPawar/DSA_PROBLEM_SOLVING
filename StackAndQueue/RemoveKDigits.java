import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {
        int size = num.length();
        if (k == size)
            return "0";

        Stack<Character> s = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !s.isEmpty() && s.peek() > digit) {
                s.pop();
                k--;
            }
            s.push(digit);
        }

        // Remove remaining largest digits from the end
        while (k > 0) {
            s.pop();
            k--;
        }

        // Build the smallest number from stack
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
