package functions;

import java.util.Scanner;

public class Stringfunc {

    static String morningMsg(String name) {
        String msg = "good morning " + name;
        return msg;
    }
    // In Java, for primitive datatyptes there is pass by value ,
    // and for non-primitive (Objects or complex datatypes )there is pass by value of that reference variable
    static void swapNum(int a,int b){
        int temp = a;
         a = b;
         b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter you Name: ");
        // String naam= sc.next();
        // String greet = morningMsg(naam); // passing name a String type as Value to my Argument
        // System.out.println(greet);
        System.out.print("enter num 1: ");
        int a = sc.nextInt();
        System.out.print("enter num2: ");
        int b = sc.nextInt();
        swapNum(a,b);
        System.out.println (a +" "+b);
    }  
}
