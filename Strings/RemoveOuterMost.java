class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int opened = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(' && opened++ > 0) {
                str.append(ch);
            }
            if (ch == ')' && opened-- > 1) {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
