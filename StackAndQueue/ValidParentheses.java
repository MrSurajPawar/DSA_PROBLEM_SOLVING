public class ValidParentheses {
    boolean isOpenning(char ch) {
        return (ch == '(' || ch == '{' || ch == '[');
    }

    boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    public boolean isValid(String s) {
        Stack<Character> stk = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (isOpenning(curr)) {
                stk.push(curr);
            } else {
                if (stk.isEmpty())
                    return false;
                else if (!isMatching(stk.peek(), curr))
                    return false;
                else
                    stk.pop();
            }
        }
        return stk.isEmpty();
    }
}