public class BSQ2 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,9,14,16,18};
        int target = 15;
        int ans = flooring(arr , target);
        System.out.println(ans); // ans = 14 flooring num of 15 just smaller than it

    }

    //return the index: the greatest number in the array smaller or = target
    static int flooring(int arr[], int target) {

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
        return end; // when element does not exist in array it is outside of it ,which is just smaller than mid i.e end
    }
}
