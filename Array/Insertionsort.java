import java.util.*;
public class Insertionsort {
    public static int[] insertionSort(int[] nums,int size){

        for(int i = 0 ;i <=size-1; i++){
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;

                j--;
            }
        }   
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        System.out.println("Enter array : ");
        int nums[] = new int[n];

        for(int i =0; i<n; i++){
            nums[i]  = sc.nextInt();
        }

       int[] sortedArray =  insertionSort(nums,n);
        
       System.out.println("Sorted array :" );
       for(int i = 0;i<n; i++){
            System.out.println(sortedArray[i]+ " ");
       }
       sc.close();
    }
}
