import java.util.*;
public class bubblesort {
    //first outer for loop will run from (0 - n-1) i.e (arr.length - 1),where n is the size of an array;
    //for each step,or itertion of i, max item will come at the last respective index
    //secondly, inner for loop will run from (1 to n-1-i) i.e (arr.length - i)
    //then swap logic will be used if (arr[j] < arr[j-1]) so that max element is placed at its respective last index
    //also add a conditon where array is already sorted no swapping will occur

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int arr[]){
        //check weather swapping required or not
        boolean swapped;
        //outer loop
        for(int i = 0; i <= arr.length-1; i++){
            swapped = false;
            //inner loop
            for(int j = 1; j <= arr.length-1-i; j++){
                //swap elements
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //when array is swapped, this condition == false, it will check again in the for loop
            //for any swapping is required or not.
            //once all elements in array get sorted,it will check for further swaps
            //since no elements will get swapped after array is sorted, this condition is true
            //and loop breaks.
            if(!swapped){  // or (if(swapped == false))
                break;
            }
        }
    }
}
