public class FactorialNum {
    public static void main(String[] args) {
        int N = 5;
        int ans = factorial(N);
        System.out.println("Factorial of " +N+ " is: " + ans);

        //print for recursive factorial function
        System.out.println(factorialrecursive(N));
    }

    static int factorial(int N){

        //factorial of N = 6 : 6x5x4x3x2x1 => 720
        int fact = 1;
        for(int i = N; i > 0; i--){
            fact = fact * i;
        }

        return fact;
    }

    static int factorialrecursive(int n)
    {
        if (n == 0)
            return 1;

        return n * factorialrecursive(n - 1);
    }
}
