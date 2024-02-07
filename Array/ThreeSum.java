import java.util.*;
class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> result= new HashSet<>();

        if(nums==null||nums.length<3) {

        return new ArrayList<>(); 
        }

        for(int i=0;i<nums.length-2;i++){

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;

            }
        }
        return new ArrayList<>(result); // returning the resultant array
    }

    public static void main(String[] args) {
        int[] arr={-1,-4,0,-1,1,2};
        List<List<Integer>> triplet=threeSum(arr);
        System.out.println(triplet);
    }
}