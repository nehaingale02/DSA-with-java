public class AddtwoBinaryStrings {
    public static void main(String[] args) {
        String x = "100011";
        String y = "111001";
        System.out.println(addBinary(x,y));
    }

    static  String addBinary(String x,String y){

        int num1 = Integer.parseInt(x,2);// converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2; // adds two decimal numbers

        String result = Integer.toBinaryString(sum); // converts integer to binary string

        return result;
    }
}
