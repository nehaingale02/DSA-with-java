public class BSQ1 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr , target);
        System.out.println(ans); // ans = 16 ceiling num of 15 just grater than it

    }

    //return the index: the smallest number in the array greater or = target
    static int ceiling(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1]){ // if target is the greater than the greatest num in array return -1
            return -1;
        }

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
        // e m s : end mid start is condition which breaks the while loop (start > end)
        return start; // when element does not exist in array,it is outside of it , just greater than mid which is start
    }
}
