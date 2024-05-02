package SlidingWindowProblem;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0 , rsum = 0 , maxSum = 0;
        int rIndex = n-1;

        for (int i = 0 ; i <= k-1 ;i++)
            lsum = lsum + cardPoints[i];
        maxSum = lsum;

        for (int i = k - 1 ; i >= 0 ; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rIndex];
            rIndex--;

            maxSum = Math.max(maxSum , lsum + rsum);
        }

        return maxSum;   
    }   
}
