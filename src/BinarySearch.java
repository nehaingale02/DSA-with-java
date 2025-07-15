public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {87, 65, 55, 54, 34, 29, 17, 13, 9, 8, 5, 4}; //descending array
        int ascen[] = {2, 5, 14, 18, 25, 30, 41, 45, 66, 70, 79, 89}; // ascending sorted array
        int target = 18;
//      int ans = BS_descending(nums, target);
        int ans = BS_ascending(ascen , target);
        System.out.println(ans);
    }

    //return the index of target element in and descending order sorted array using binary search
    static int BS_descending(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;


        //compare target element is =,>,< than mid element
        while (start <= end) {

            int mid = start + (end - start) / 2;  //first find middle element in array

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else{
                return mid; // arr[mid] == target
            }
        }
        return -1; // element does not exist in array
    }

    //return the index of target element in and ascending order sorted array using binary search
    static int BS_ascending(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;


        //compare target element is =,>,< than mid element
        while (start <= end) {

            int mid = start + (end - start) / 2;  //first find middle element in array

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target >  arr[mid]) {
                start = mid + 1;
            } else{
                return mid; // arr[mid] == target
            }
        }
        return -1; // element does not exist in array
    }
}


