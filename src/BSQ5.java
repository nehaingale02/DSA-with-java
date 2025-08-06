public class BSQ5 {
    // find target in infinite range of array
    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 9, 16, 18, 20, 26, 35, 49, 56, 68, 73, 86, 100, 188, 288, 278, 678};
        int target = 68;
        System.out.println(infinitearray(arr, target));
    }

    ;

    // first we need to find start and end of the array
    static int infinitearray(int arr[], int target) {
        // first find the range
        //first You initialize a search window with size 2,
        int start = 0;
        int end = 1;

        //conditon for the target to lie in the range
        while (target > arr[end]) {
            int newstart = end + 1; // saved the new start here

            //double the size of box:-
            //{new end = previous end + (size of the box)*2 }

            end = end + (end - start + 1) * 2; // index till prev end + double the size of previous box
            start = newstart; // Update start to the previously saved newstart.
        }
        int ans = Binarysearch(arr, target, start, end);
        return ans;

    }

    // start and end is not defined here.
    static int Binarysearch(int arr[], int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;


        //compare target element is =,>,< than mid element
        while (start <= end) {

            int mid = start + (end - start) / 2;  //first find middle element in array

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // arr[mid] == target
            }
        }
        return -1;
    }
}
