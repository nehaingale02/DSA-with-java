//search in rotated array
public class BSQ8 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(search(arr,target));
    }

    static int search(int arr[], int target) {

        int pivot = findpivot(arr);

        // if you did not found the pivot,means array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return bs(arr, target, 0, arr.length - 1);
        }

        // here using pivot we have to find target
        //if pivot is found, array is found to be rotated
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return bs(arr, target, 0, pivot - 1);
        }
        return bs(arr, target, pivot + 1, arr.length - 1);
    }
    static int findpivot(int arr[]) {
        // we have 4 cases to find  pivot
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case 1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //case 2:
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //case 3:
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                //case 4:
                start = mid + 1;
            }
        }
        return -1;
    }
    static int bs(int arr[],int target,int start,int end){

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
