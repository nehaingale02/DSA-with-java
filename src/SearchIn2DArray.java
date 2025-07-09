import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {12,15,17},
                {36,54,66},
                {54,16,336}
        };
        int target = 66;
        int [] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search (int[][] arr, int target){

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target){
                    return  new int[] {row ,col};
                }
            }

        }
        return new int[] {-1,-1};

    }
}
