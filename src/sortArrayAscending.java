import java.util.Arrays;

public class sortArrayAscending {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,6,8,5,4};
        sortasc(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortasc(int arr[]){

        //we can simple do by Arrays.sort()

        //but to do using bubble sort

        for(int i = 0 ; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1; j <= arr.length -1-i; j++){
                swapped = false;
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
