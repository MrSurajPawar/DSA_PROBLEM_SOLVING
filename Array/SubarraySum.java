public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = i ;j< nums.length; j++){
                sum = sum + nums[j];

                if(sum == k) 
                    count++ ;
            }
        } 

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = subarraySum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
