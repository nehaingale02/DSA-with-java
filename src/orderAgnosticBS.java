// order Agnostic Binary search means we dont assume array is ascending order or descending instead
//we find it and proceed accordingly

public class orderAgnosticBS {
    public static void main(String[] args) {
        int nums[] = {87, 65, 55, 54, 34, 29, 17, 13, 9, 8, 5, 4}; //descending array
        int target = 8;
        int ans = orderAgnosticBS(nums, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        //check whether the array is in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        //compare target element is =,>,< than mid element
        while (start <= end) {

            int mid = start + (end - start) / 2;  //first find middle element in array

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // element does not exist in array}
        return -1;
    }
}
