import java.sql.SQLOutput;

//Implement binary search to find the index of 7 in the sorted array {1, 3, 5, 7, 9, 11}.
//Write a method to find the index of 6 in the descending array {10, 8, 6, 4, 2} using binary search.
//Implement a function that performs binary search on an array without knowing if it's sorted in ascending or descending order. Test with {20, 15, 10, 5} and target 10.
//Given a sorted array {2, 3, 5, 9, 14, 16, 18} and a target 15, return the ceiling (smallest number ≥ target). If no ceiling exists, return -1.
//Given a sorted array {2, 3, 5, 9, 14, 16, 18} and a target 4, return the floor (greatest number ≤ target). If no floor exists, return -1.
public class AssignmentQuesBS {
    public static void main(String[] args) {
//        int arr[] = {1, 3, 5, 7, 9, 11};
//        int target = 7;
//        int ans = BS(arr,target);
//        System.out.println(ans);

//        int arr[] = {10, 8, 6, 4, 2};
//        int target = 6;
//        int ans = BSdes(arr,target);
//        System.out.println(ans);
//        int arr[] = {20, 15, 10, 5};
//        int target = 10;
//        System.out.println(OGBS(arr, target));

//        int arr[] = {2, 3, 5, 9, 14, 16, 18};
//        int target = 15;
//        System.out.println(ceiling(arr, target));

        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        System.out.println(flooring(arr, target));
    }

    //return index of target element
    static int BS(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find mid element
            int mid = start + (end - start) / 2;

            //check weather target is <,=,> than arr[mid]

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // number does not exist int the array
    }

    static int BSdes(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find mid element
            int mid = start + (end - start) / 2;

            //check weather target is <,=,> than arr[mid]

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // number does not exist int the array
    }

    static int OGBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find mid element
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            //check weather array is ascending or decending
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
            // number does not exist int the array
        }
        return -1;
    }

    static int ceiling(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

        // return the smallest number in array > or = target
        while (start <= end) {
            //find mid element
            int mid = start + (end - start) / 2;

            //check weather target is <,=,> than arr[mid]

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // number does not exist int the array
    }

    static int flooring(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        // return the smallest number in array > or = target
        while (start <= end) {
            //find mid element
            int mid = start + (end - start) / 2;

            //check weather target is <,=,> than arr[mid]

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end; // number does not exist int the array
    }
}

