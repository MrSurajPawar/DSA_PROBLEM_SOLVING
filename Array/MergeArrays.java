public class MergeArrays {
    public static void merge(long[] arr1,long[] arr2 ,int n,int m){
        long[] arr3 = new long[n+m];
        int left = 0 , right = 0 , index = 0;

        while(left < n && right < m){
            if(arr1[left] < arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }else{
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        //when right reaches to the end
        while(left < n ){
            arr3[index++] = arr1[left++];
        }

        //when left reaches to the end
        while(right < m ){
            arr3[index++] = arr1[right++];
        }

        for(int i = 0 ; i < arr3.length; i++){
            System.out.println(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1,arr2,n,m);
    }
}
