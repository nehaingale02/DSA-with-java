//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6} ;
        int target = 4;
        int ans= linearsearch(arr, target); // fuction call where passing array and target element to be found
        System.out.println(ans);
        }

        // search the target and return the element
        static int linearsearch2(int arr[], int target){

            if(arr.length == 0){
                return -1;
            }

            for (int element : arr) {
                //check for element at each index  if it is = target
                if (element == target) {
                    return element;
                }
            }
            // this line will hit when above return statement is not executed and
            // hence the target not found
            return -1;
        }

        // search in the array: return the index if element found
        static int linearsearch(int arr[], int target){

        if(arr.length == 0){
            return -1;
}

            for (int index = 0 ; index < arr.length ; index++){
                int element = arr[index];
                //check for element at each index  if it is = target
                if(element == target){
                    return index;
                }
            }
            // this line will hit when above return statement is not executed and
            // hence the target not found
            return -1;
        }
    }

