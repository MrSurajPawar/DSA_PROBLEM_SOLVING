public class SqrtBinarySearch {
    public static void main(String[] args) {
        int n = 25;
        int low = 1, high = n ;

        while(low <= high){
            int mid = (low + high)/2;

            if((mid * mid) <= n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        //The answer will always points to the high index 
        System.out.println("Square root is " + high);
    }
}
