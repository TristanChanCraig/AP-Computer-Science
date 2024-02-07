package Quarter3;

public class SearchAlgs {
    public static int linearSearch(int[] array, int x) {
        for (int lcv = 0; lcv < array.length; lcv++) if (array[lcv] == x) return lcv;
        return -1;
    }

    public static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (array[mid] == x) return mid;
            if (array[mid] < x) low = mid + 1;
            else high = mid - 1
        }
        return -1;
    }

    /** Call with binarySearchRec(array, x, 0, array.length-1) */
    public static int binarySearchRec(int[] array, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (array[mid] == x) return mid;
        else if (array[mid] > x) return binarySearchRec(array, x, low, mid-1);
        return binarySearchRec(array, x, mid+1, high);
    }
}
