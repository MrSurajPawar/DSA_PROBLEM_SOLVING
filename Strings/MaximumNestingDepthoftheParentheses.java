public class MaximumNestingDepthoftheParentheses {
    class Solution {
        public int maxDepth(String s) {
           int depth = 0 , opened = 0;
           for (char ch : s.toCharArray()) {
                if (ch == '(')  opened++;
                if (ch == ')')  opened--;
                depth = Math.max(opened , depth);     
           }
           return depth; 
        }
    }
}
