import java.util.Arrays;
public class sortinDescending {
    public static void main(String[] args) {
        int arr[] = {7, 5, 9, 2, 4, 8, 6, 8};
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortDescending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - 1 - i;
            int min = getMinIndex(arr, 0, last);

            // Swap the min element to the end (to sort descending)
            int temp = arr[min];
            arr[min] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMinIndex(int arr[], int start, int end) {
        int min = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

}
