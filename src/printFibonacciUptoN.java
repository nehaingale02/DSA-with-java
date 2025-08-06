public class printFibonacciUptoN {

    public static void main(String[] args) {
        int N = 50;
        printFibonacciUptoN(N);
    }

    static void printFibonacciUptoN(int N){

        int first = 0;
        int second = 1;

        while(first <= N ){
        System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
    }
    }
}
