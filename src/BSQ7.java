public class BSQ7 {
    // FIND the target elemnt in mountain array
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,5,4,3,1,};
        int target = 5;
        System.out.println(search(arr,target));
    }

    static int search(int arr[],int target){
        int peak = findPeak(arr);
        int firsttry = orderAgnosticBinarysearch(arr,target,0,peak); // first search in the ascending order array
        if(firsttry != -1){
            return firsttry;
        }else{
           int secondtry = orderAgnosticBinarysearch(arr,target,peak+1,arr.length-1);// second search in the descending part
           return secondtry;
        }
    }
    // first find peak element
    static int findPeak(int arr[]){

        int start = 0;
        int end  = arr.length - 1;

        while(start < end){  //So, use start < end when: You're shrinking a search space to a single element

            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){ // it indicates that we are in decreasing part of array
                //it may be possible that mid is max ,but also lie on left side
                end = mid; //
            }else{
                start = mid + 1; // when arr[mid] < arr[mid +1] , we are in asc order of array
            }
        }
        return start; //or return end

        // in above 2 cases ,are trying to find max element, there both start and end when are point towards
        // same index the max element is found .

    }

    static int orderAgnosticBinarysearch(int arr[], int target,int start, int end){
        boolean isAsc = arr[start] < arr[arr.length-1];

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                 if(target > arr[mid]){
                    end = mid - 1;
                 }else{
                    start = mid + 1;
                 }
            }

        }
        return -1;
    }
}
