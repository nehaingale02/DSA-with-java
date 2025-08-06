import java.util.ArrayList;

/* https://www.geeksforgeeks.org/java/strings-in-java/

In Java, a String is the type of object that can store a sequence of characters
 enclosed by double quotes and every character is stored in 16 bits, i.e.,
 using UTF 16-bit encoding. A string acts the same as an array of characters.
 Java provides a robust and flexible API for handling strings,
 allowing for various operations such as concatenation, comparison and manipulation.
*/
public class Main {
    public static void main(String[] args) {
        /*String literal storage:
        Whenever a String Object is created as a literal, the object will be created in the String constant pool.
        This allows JVM to optimize the initialization of String literal. The string constant pool is present in the heap.*/
      String str ="Neha";
      System.out.println(str);

      /*
      * The string can also be declared using a new operator i.e. dynamically allocated.
      * In case of String are dynamically allocated they are assigned a new memory location in the heap .
      * This string will not be added to the String constant pool.
      * It is preferred to use String literals as it allows JVM to optimize memory allocation.*/

      String str1 = new String("Neha Ingale");
      System.out.println(str1);

        // pretty printing
        // System.out.printf("pie : %.5f", Math.PI);

        //String Concatenation: in String Objects + operator is being Overloaded
        System.out.println('a'+'b'); // adds ascii or unicode value for this
        System.out.println("a" + "b"); // adds 2 string
        System.out.println((char) ('b'+ 4)); // adds values of char b and 4 we get next char i.e. f
        System.out.println("a" + 4); // integer is converted to Integer that will call toString() method

        // Note:
        //  "+" operators works with ,  String + any primitives in an expression is allowed
        System.out.println("Neha" + new ArrayList<>());
        System.out.println("Neha" + new Integer(56));

        // but not with complex objects only
        // System.out.println(new ArrayList<>() + new Integer(34)); --> error

        // condition:  is it should least have 1 string object
        System.out.println(new ArrayList<>() + "" +new Integer(34));
        }
    }
