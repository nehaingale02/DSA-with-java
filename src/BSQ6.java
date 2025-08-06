import org.w3c.dom.ls.LSOutput;

public class BSQ6 {
    // FIND THE PEAK (max) INDEX IN THE MOUNTAIN ARRAY

    public static void main(String[] args) {
        int arr [] = {2,3,5,6,4,3,2};
        System.out.println(mountain(arr));
    }

    static int mountain(int arr[]){

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
}
