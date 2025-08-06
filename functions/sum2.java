package functions;

import java.util.Scanner;

public class sum2 {
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1: ");
        int a = sc.nextInt();
        System.out.print("enter the num2: ");
        int b = sc.nextInt();
        int sum = a+b;
       return sum;
       
    }
    public static void main(String[] args) {
        // the below line indicates: pass the value of numbers when calling the func in main()
        // static int sum(int a, int b)
        // int ans = sum(20,80);
        int ans = sum();
        System.out.println(ans);
    }
}
