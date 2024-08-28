package Binarysearch;

public class BS {
    public static void main(String[] args) {
        int arr[] = {-5,-3,0,2,3,5,8,9,12,17,22,26,29,30};
        int target = 17;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
      }  
    static int BinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            //find mid element
            // int mid = (start + end)/2;// by using this (start+end),it may exceed range of integer 
            int mid = start + (end-start)/2;
            //compare mid value with target and decide which side to use LHS OR RHS OF mid

            if (target<arr[mid]){ //target value is less the middle value
                end = mid - 1;
            }
            else if (target > arr[mid]){ // target value is more the middle value
                start = mid + 1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1; // -1 is returned when element does not exist in the array of numbers

    }
  
}




   



