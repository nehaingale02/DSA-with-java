public class AddtwoBinaryStrings {
    public static void main(String[] args) {
        String x = "10001111";
        String y = "11100111";
        System.out.println(addBinary(x, y));
        System.out.println(addbinarynums(x, y));
    }

    static String addBinary(String x, String y) {

        int num1 = Integer.parseInt(x, 2);// converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2; // adds two decimal numbers

        String result = Integer.toBinaryString(sum); // converts integer to binary string

        return result;
    }

    static String addbinarynums(String x, String y) {

//Approach 2: Two Pointer
//Initialize two pointers at the end of both strings, let's call them i and j.
//Initialize a variable carry to 0.
//While i and j are greater than or equal to 0, do the following:
//Convert the current digits at i and j to integers (0 if the pointer is out of bounds).
//Add the integers together with the carry value.
//If the sum is 0 or 1, add it to the result string and set carry to 0.
//If the sum is 2, add 0 to the result string and set carry to 1.
//If the sum is 3, add 1 to the result string and set carry to 1.
//Decrement i and j by 1.
//If there is still a carry left over, add it to the front of the result string.
//Reverse the result string and return it.

        int i = x.length() - 1; //pointer i initialized at the end of string x
        int j = y.length() - 1; // pointer j initialized at the end of string y
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while( i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0 ){
                sum+= x.charAt(i) - '0';
            }
            if(j >= 0){
                sum+= y.charAt(j) - '0';
            }
            if(sum == 0 || sum == 1){
                result.append(sum);
                carry = 0;
            }
            else if(sum == 2){
                result.append('0');
                carry = 1;
            }else{
                result.append('1');
                carry = 1;
            }
            i--;
            j--;
        }
        if(carry == 1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}