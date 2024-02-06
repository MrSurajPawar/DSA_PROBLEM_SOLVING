public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int number = 0;

        for(int i = 0 ; i < nums.length ;i++){
            number = number ^ nums[i];
        }
        System.out.println(number);
    }
}
