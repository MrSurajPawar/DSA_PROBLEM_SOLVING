public class Selectionsort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int min = i;

            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Include a line break
    }

    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        selectionSort(arr);
    }
}
