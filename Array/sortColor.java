public class sortColor {
        public static void sortColors(int[] nums) {
            int zero=0, one=0, two=0;
    
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) zero++;
                if(nums[i]==1) one++;
                if(nums[i]==2) two++;
            }
    
            for(int i=0;i<zero;i++){
                nums[i]=0;
            }
            for(int i=zero;i<zero+one;i++){
                nums[i]=1;
            }
            for(int i=zero+one;i<zero+one+two;i++){
                nums[i]=2;
            }

            for(int i =0 ;i < nums.length; i++ ){
                System.out.println(nums[i] + " ");
            }
        }

        public static void main(String[] args) {
            int nums[] = {0, 2, 1, 2, 0, 1};
            sortColors(nums);
        }
}

