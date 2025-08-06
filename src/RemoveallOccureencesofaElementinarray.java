import java.util.Arrays;
public class RemoveallOccureencesofaElementinarray {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,2,4,3,4,7,8};
        int target = 4;
        int newarrsize=  removeocc(arr,target);

        for(int i = 0; i < newarrsize; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2nd method:
        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int k = 3;
        a = removeElements(a, k);
        System.out.println(Arrays.toString(a));
    }

    static int removeocc(int arr[],int target){

        int n = arr.length;
        if(n <= 1) {
            return n;
        }
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != target){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static int[] removeElements(int[] a, int k)
    {
        // Move all other elements to beginning
        int ind = 0;

        for (int i=0; i<a.length; i++)
            if (a[i] != k)
                a[ind++] = a[i];

        // Create a copy of arr[]
        return Arrays.copyOf(a, ind);
    }
}
