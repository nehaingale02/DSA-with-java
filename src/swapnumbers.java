public class swapnumbers {

    //swap two numbers using 3 methods
    //1. using auxiliary variable, or third variable(temp)
    //2. without third variable
    //3. using exclusive OR (Bitwise XOR) operator
    //4. swap using arithmetic operators
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("value of a & b before swap is: " +a+ "," +b);;
        swapNumsUsingThirdVariable(a,b);
        swapNumsNotUsingThirdVariable(a,b);
        swapNumsUsingBitwiseOperator(a,b);
        arithmeticswap(a,b);
    }

    static void swapNumsUsingThirdVariable(int a,int b ){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a & b after swap is: " +a+ "," +b);
    }

    static void swapNumsNotUsingThirdVariable(int a,int b ){
        a = a - b; // a --> 5 - 3 = 2, here a will be updated to diff of two original values
        b = a + b; // b --> 2 + 3 = 5, b will store addition of new updated a and orig b,thus b is swapped with a
        a = b - a; // a --> 5 - 2 = 3, a is swapped with b, by diff  btw new b & new a
        System.out.println("value of a & b after swap is: " +a+ "," +b);
    }
    static void swapNumsUsingBitwiseOperator(int a, int b ){
//        This operator is binary operator, denoted by ‘^’. It returns bit by bit XOR of input values,
//        i.e, if corresponding bits are different, it gives 1, else it gives 0
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("value of a & b after swap is: " +a+ "," +b);
    }
    static void arithmeticswap(int a, int b){
        // It follows BODMAS rule then first bracket (a+b)
        // i.e., (5+3)=8 then it will solve another bracket (b=a) which simply put the value of a in b i.e., b=5
        // Now it will subtract 8-5 i.e., a=3. In this way we can swap the numbers easily..
        a = (a + b) - (b = a); //--> a = (5+3) - (b = 5); a = (8) - (5) = 3; therefore a = 3 & b = 5
        System.out.println("value of a & b after swap is: " +a+ "," +b);

    }
}
