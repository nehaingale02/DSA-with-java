public class SearchInRange {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int target = 8;
        System.out.println(search(arr,target,1,7));
    }

    //search the element in the range of the an array
    static int search(int arr[], int target, int start, int end){

        if(arr.length == 0){
             return -1;
        }

        for(int i = start; i<= end; i++){ // here start and end is index therefore included <= end
            int element = arr[i];
            if(element == target){
                return i;
            }

        }
        return -1; // element does not exist in array

    }
}
