public class FindEvenOdd {
    public static void main(String[] args) {

        //Brute force approach

//        int num = -9;
//
//        if(num % 2 == 0){
//            System.out.println("Number is Even");
//        }else {
//            System.out.println("Number is odd");

      int num = 6;
      findEvenOdd_BitwiseOR(num);
      findEvenOdd_BitwiseAND(num);
      findEvenOdd_BitwiseXOR(num);
    }

    static void findEvenOdd_BitwiseOR(int num){

        //using bitwise operator OR, AND & XOR
        if((num | 1) == num+1){
            System.out.println("After Bitwise OR Number is Even");
        }else{
            System.out.println("After Bitwise OR Number is Odd");
        }
    }

    static void findEvenOdd_BitwiseAND(int num){

        //using bitwise operator OR, AND & XOR
        if((num & 1) == 1){
            System.out.println("After Bitwise AND Number is ODD");
        }else{
            System.out.println("After Bitwise AND Number is Even");
        }
    }

    static void findEvenOdd_BitwiseXOR(int num){

        //using bitwise operator OR, AND & XOR
        if((num ^ 1) == num+1){
            System.out.println("After Bitwise XOR Number is Even");
        }else{
            System.out.println("After Bitwise XOR Number is Odd");
        }
    }
}
