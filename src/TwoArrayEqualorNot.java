/*
take two integer a[] & b[] arrays
pass in a function of boolean type which checks they are equal or not
create a function
if two arrays have same length then check
using a for loop
if elements of a[i] == b[i] are same or not
if not return false , if yes return true , also if length is different return false
pseudocode:
Start
arr1[] = {1,2,3}
arr2[] ={1,2,3}
check equal(arr1,arr2)
if(arr1.length == arr2.length) then
check if elements are equal using
for(i = 0 , i < arr1.length , i++)
if(arr1[i] != arr2[i]) return false
else true
if length not = return false
End
 */
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

