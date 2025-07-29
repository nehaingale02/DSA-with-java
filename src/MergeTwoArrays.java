import java.util.Arrays;
public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        int merged[] = mergeArrays(arr1,arr2);

        System.out.println(Arrays.toString(merged));
    }

    static int[] mergeArrays(int arr1[],int arr2[]){

        int length1 = arr1.length;
        int length2 = arr2.length;

        //create new array of combined size
        int newarr[] = new int[length1 + length2];

        //first this adds all elemnts of array 1 in new array
        for(int i = 0; i< length1; i++){
            newarr[i] = arr1[i];
        }
        //now to add elements of array 2
        for(int i = 0; i< length2; i++){
            newarr[length1 + i] = arr2[i]; // array 2 element adds in new array after length of array 1
        }
        return newarr;
    }
}
