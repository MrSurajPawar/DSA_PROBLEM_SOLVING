public class RecursiveBubbleSort {

    public static void bubbleSort(int[] nums, int n){
        if(n == 1) return ; //base case

        for(int i = 0 ;i <= n-2 ;i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        bubbleSort(nums, n-1);
    } 
    public static void main(String[] args) {
        int [] nums = {5,4,3,2,1};
        int n = nums.length;
        System.out.println("unsorted array : ");

        for(int i = 0 ; i< n ;i++){
            System.out.println(nums[i] + " ");
        }   
        
        bubbleSort(nums,n);

        System.out.println("Sorted array :");
        for(int i = 0 ; i<n; i++){
            System.out.println(nums[i] + " ");
        }

    }
}
