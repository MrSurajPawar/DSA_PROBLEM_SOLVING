import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        //size of array
        System.out.println("Enter the size of array : ");
        int n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values of array : ");
        for(int i = 0; i< n; i++){
            arr[i] = obj.nextInt();
        }

        for(int i = n-1; i>=0 ; i--){
            for(int j = 0 ; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array is : ");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

        obj.close();
    }
}
