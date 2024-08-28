package functions;
import java.util.Scanner;

public class functions {
   
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1: ");
        int a = sc.nextInt();
        System.out.print("enter the num2: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is: "+sum);
    }
    
    public static void main(String[] args) {
        sum();
        }
}

