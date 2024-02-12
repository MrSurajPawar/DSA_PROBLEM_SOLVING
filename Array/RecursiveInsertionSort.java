public class RecursiveInsertionSort {
    public static void insertionSort(int[] nums,int i,int n){
        int j = i;

        if(i == n) return ;     //base condition 

        while(j > 0 && nums[j-1] > nums[j]){
            int temp = nums[j-1];
            nums[j-1] = nums[j];
            nums[j] = temp;

            j--;
        }

        //recursive call
        insertionSort(nums, i+1 , n);
    }
    public static void main(String[] args) {
    int[] nums = {55,44,33,12,01};
    int n = nums.length;
    System.out.println("Unsorted array : ");
    
    for(int i = 0 ; i < n ; i++){
        System.out.print(nums[i] + " ");
    }   
    System.out.println();

    insertionSort(nums,0,n);

    for(int i = 0 ;i < n; i++){
        System.out.print(nums[i] + " ");
    }
    System.out.println();
 }   
}
