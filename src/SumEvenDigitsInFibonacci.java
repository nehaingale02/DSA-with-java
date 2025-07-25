import java.util.*;
public class SumEvenDigitsInFibonacci {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("Sum of first "+N+ " Even digit index is: "+SumEvenDigitsInFibonacci(N));
    }

    static int SumEvenDigitsInFibonacci(int N){

        //base condition for N = 0
        if(N == 0){
            return 0;
        }

        //1. generate array to store fibo series
        int fibo[] = new int[2*N];
        fibo[0] = 0;
        fibo[1] = 1;

        int sum = 0; // store sum of even digits index
        int count = 1;

        //2. generate fibo series from 2 to 2N
        for(int i = 2; count < N; i++){
            fibo[i] = fibo[i - 2] + fibo[i - 1];

            //3. find index of even index and add to Sum
            if(i % 2 == 0){
                sum += fibo[i]; //if index is even then add element at even index in sum
                count++;
            }

        }
        System.out.println("fibonacci series is: " + Arrays.toString(fibo));
        return sum;
    }
}
