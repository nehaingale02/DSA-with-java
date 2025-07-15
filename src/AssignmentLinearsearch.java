import java.util.Arrays;

//Q1) Find the index of the smallest element in the array using linear search.
//Q2) Find the index of the largest element in the array using linear search.
//Q3) Search for the maximum element in a 2D array using linear search.
//Q4) Search for a character in a string and return its index.
//Q5) Count how many times the target appears in a specific range of the array.


public class AssignmentLinearsearch {
    public static void main(String[] args) {
//        int nums[] = {4, 3, 5, 67, 88};
//        int index = smallest(nums);
//     System.out.println("Smallest element index is: " + index);
//        int index = largest(nums);
//        System.out.println("largest element index is: " + index);

//        int nums [][] = {
//                {23,44,5,6},
//                {33,45,78,90},
//                {26,75,456,67}
//        };
//
//        int result = MaxIn2Darray(nums);
//        System.out.println("Maximum element in 2D arrays is : " +result);

//        String name = "neha";
//        char target = 'h';
//        int result = SearchInString(name,target);
//        System.out.println("the String element found at index: " + result);

        int array[] = {2,3,4,2,5,6,2,2,4,0,7};
        int target = 2;
        System.out.println("The target element appeared " + search(array, target,0,8) + " times");

    }
    static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        if(end>=arr.length){
            return -1;
        }
        int count = 0;
        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    static int SearchInString(String str,char target){
        if(str.length() == 0){
            return -1;
        }

       for(int i = 0 ; i < str.length(); i++){
           if(str.charAt(i) == target){
               return i;
           }
       }
       return -1;

    }

    static int MaxIn2Darray(int arr[][]){
        int max = arr[0][0];
        for(int row = 0 ; row < arr.length ; row++){
            for(int cols = 0; cols< arr[row].length; cols++){
                if (arr[row][cols] > max){
                    max = arr[row][cols];
                }
            }
        }
        return max;
    }



    static int smallest(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int index = 0;
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }

    static int largest(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int index = 0;
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }


}

