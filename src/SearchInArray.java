public class SearchInArray {
    public static void main(String[] args) {
        int arr[] = {1,4,7,9,12,56};
        int target = 12;
        System.out.println(isElementPresent(arr,target));
    }

    static boolean isElementPresent(int arr[], int target){

        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
