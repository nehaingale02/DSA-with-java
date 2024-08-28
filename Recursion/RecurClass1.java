package Recursion;

public class RecurClass1 {
    static int fibonacci(int n){
        //base condition
        if(n<2){
            return n ;
        }
        //main function 
        return (fibonacci(n-1)+fibonacci(n-2));  // ((n-3) + (n-2))
    }
    public static void main(String[] args) {
        int ans = fibonacci(4);
        System.out.println(ans);  // for n = 4
    }
}
