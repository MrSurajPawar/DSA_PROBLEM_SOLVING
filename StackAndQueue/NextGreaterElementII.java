class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();

        ans[n-1] = -1; 
        s.push( nums[n-1] ); 

        for (int i = 2*n-2 ; i >= 0 ; i--) {
            while (!s.isEmpty() && nums[i % n] >= s.peek()) 
                s.pop();

            if (s.isEmpty())
                ans[i % n] = -1;
            else 
                ans[i % n] = s.peek();

            s.push(nums[i % n]); 
        }

        return ans; 
    }
}