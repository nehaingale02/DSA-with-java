import java.util.*;
public class SortanArray {
    public static void main(String[] args) {
        int arr [] = {23,45,22,76,87,54,33,2,1,6,4,5};
        char ch[] = {'n','e','h','a'};

        sort(arr,ch);
    }

    static void sort(int arr[],char ch[]){

        Arrays.sort(arr);
        Arrays.sort(ch);
        for(int i : arr){
            System.out.print(Arrays.toString(arr));
            break;
        }
        System.out.println();
        for(char c : ch){
            System.out.print(Arrays.toString(ch));
            break;
        }
    }
}
