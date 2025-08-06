public class BSQ4 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 7, 8, 10};
        int target = 7;
        int[] ans = findRange(nums, target);
        System.out.println(ans[0] + ", " + ans[1]);
    }

    static int[] findRange(int[] arr, int target) {
        int ans[] = {-1, -1};
        ans[0] = binarysearch(arr ,target ,true);
        ans[1] = binarysearch(arr ,target ,false);
        return ans;
    }

    static int binarysearch(int arr[], int target, boolean findfirstoccurance){
            int start = 0;
            int end = arr.length - 1;
            int ans = -1;
            //compare target element is =,>,< than mid element
            while (start <= end) {

                int mid = start + (end - start) / 2;  //first find middle element in array

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target >  arr[mid]) {
                    start = mid + 1;
                } else{
                    //potential ans found
                    ans = mid;
                    if(findfirstoccurance){
                        end = mid - 1; // find first occurance of target on left side of mid
                    }else{
                        start = mid + 1; //find end occurance of target on right side of mid
                    }
                }
            }
        return ans;
    }
}
