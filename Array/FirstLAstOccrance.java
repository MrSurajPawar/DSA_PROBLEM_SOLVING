import java.util.*;

public class FirstLAstOccrance {

    public static int firstOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                first = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return first;
    }

    public static int lastOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
           
            if (arr.get(mid) == k) {
                last = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[] {first, last};
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
        int n = 8, k = 8;
        int[] ans = firstAndLastPosition(arr, n, k);
        System.out.println("The first and last positions are: "
                           + ans[0] + " " + ans[1]);
    }
}