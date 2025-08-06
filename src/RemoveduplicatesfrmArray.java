/* remove duplicates in an array
apply this on sorted array
1. start variable idx with index 1
as idx 0 has no previous element before  it so consider it unique
2. idx hols next unique element
3. for loop runs from i = 1 to < arr.length, and checks at each i
4. if arr[i] is different from arr[i-1] assign arr[i] to arr[idx],
and increment idx.
*/
public class RemoveduplicatesfrmArray {
    public static void main(String[] args) {
                int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
                int newSize = removeDuplicates(arr);

                for (int i = 0; i < newSize; i++) {
                    System.out.print(arr[i] + " ");
                }
    }

        static int removeDuplicates(int[] arr) {
            int n = arr.length;
            if (n <= 1)
                return n;

            // Start from the second element
            int idx = 1;

            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    arr[idx] = arr[i];// Copy current unique element to correct position or index
                    idx = idx + 1;     // Move to next position
                }
            }
            return idx;
        }
}


