import java.util.Arrays;
public class FindEvenDigit {
    public static void main(String[] args) {
       int arr [] = {14,55,6,5,890,9,88};
       int ans = findevennums(arr);
        System.out.println(ans);
    }
// check in an array if it contains even number of digit or not
    static int findevennums(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
        //check if number contains even digit or not
        static boolean even(int num){
            int numberOfDigits = digits(num);
            if(numberOfDigits % 2 == 0){
                return true;
            }
           return false;

        }

        static int digits(int num){
            int count = 0;
            while (num > 0 ){
                count++;
                num = num/10;
            }
            return count;
        }

    }

