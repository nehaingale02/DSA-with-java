import java.util.Arrays;
public class selectionsort {
// iterate array using  for loop from 0 till n-1, n is size of an array
// fing the max element , and swap it with respective last index
// Note: In Selection sort there are two methods, find max, and swap with last respective index
    //OR find min index and swap with respective first index


    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int arr[]){
        for(int i = 0; i <= arr.length - 1; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr,0,last);
            //swap
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
            }

        // FOR LOOP find min index and swap with respective first index

//        for(int i = 0; i <= arr.length - 1; i++){
//            int first = i;
//            int min = getMaxIndex(arr,first,arr.length -1);
//            //swap
//            int temp = arr[first];
//            arr[first] = arr[min];
//            arr[min] = temp;
//            }

        }

        static int getMaxIndex(int arr[],int start,int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }
}
