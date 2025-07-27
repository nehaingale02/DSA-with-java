/* to find whether the numberis palidrome or not
i.e. to check reverse of number is same as original
initialise rev_no = 0
1. through a while loop for a condition n > 0 we find reverse of number
2. rev_num = rev_num * 10 + n % 10
3. update n = n/ 10; and return rev_num once loop ends
4. Using if-else condition check if this original == rev_no print number is palindrome else it is  not. */

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 12321;
        int rev_no = palindrome(num);
        if (num == rev_no) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is Not a palindrome");
        }
    }

    static int palindrome(int n){

        // Iterative function to
        // reverse the digits of number
        int rev_no = 0;
        while(n > 0){
            rev_no = rev_no * 10 + n % 10;
            n = n / 10;
        }
        return rev_no;
    }
}
