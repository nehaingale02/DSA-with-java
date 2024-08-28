package functions;

import java.util.*;

public class question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c = 2;
        if(n<=1){
            System.out.println("neither prime nor composite ");
        }
        while (c *c<= n) {
            if (n%c  == 0) {
                System.out.println("number is Not a prime number ");
                return ;
            } 
            c++;
        }    
        System.out.println("it is a prime number");
    }

}
