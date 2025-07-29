public class TwoArrayEqualorNot {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};
        boolean result = EqualArrayorNot(arr1, arr2);

        if(result){
            System.out.println("Arrays are Equal");
        }else{
            System.out.println("Arrays are Not Equal");
        }
    }
    static boolean EqualArrayorNot(int arr1[] , int arr2[]){

        /// this is checking wheather elements in array is equal or not
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false; //if any element differ then break the loop and return false ;indicating not equal
                }
            }
        }else{
            return false;
        }
        return true; // if all elements match
    }
}

