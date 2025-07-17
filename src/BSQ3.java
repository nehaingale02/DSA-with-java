public class BSQ3 {
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(arr,target));
    }

    //return next greatest letter in array of target
    static char nextGreatestLetter(char str[],char target){


        int start = 0;
        int end = str.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < str[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return str[start % str.length] ; //It returns the smallest character in the array that is greater than the target — and if no such character exists (i.e., the target is larger than or equal to all elements), it wraps around and returns the first character.
    }
}
