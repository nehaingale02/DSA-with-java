public class CheckPrime1toN {

    // To check numbers upto N from 1 are prime or not
    // Create a boolean func to check weather which num till 2 to N is prime or not
    // create a loop from i = 2 (AS 0 & 1 NOT PRIME),till less than = N
    // and check if N is divisible by i if remainder is 0 it is divisible ,which indicates it is not a Prime num
    // if true then prime number .
    //Also create a function to print prime num,where
    // for loop iterates on 2 to N, calling isPrime function to check if it is prime or not.
    public static void main(String[] args) {
        int N = 20;
        printPrimeNums(N);
    }

    static boolean isPrime(int num) {

        //case 1 when N is less than = 1 --> return -1
        if (num <= 1) {
            return false;
        }
        //for loop to check for prime number or not
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // N not prime number
            }
        }
        return true; // N is prime number}
    }
        //function to print prime value

    static void printPrimeNums(int N){
        System.out.print("All the Prime numbers within 1 and " + N + " are: ");
        for(int j = 2 ; j<=N; j++){
            if(isPrime(j)){
              System.out.print (j + " ");
          }
        }

    }


}

