import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {-4,-6,0,4,3,1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int arr[]){

        for( int i = 0 ; i <= arr.length-2; i++){
//            int j = i+1;
//            while(j > 0 && arr[j] < arr[j-1]){
//                //swap
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//            }
// OR
             for(int j = i+1; j>0 ; j--){
                 if(arr[j] < arr[j-1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                 }else{
                     break;
                 }

             }
        }
    }
}
