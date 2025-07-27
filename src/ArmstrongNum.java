public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        Armstrong(n);
    }

    static void Armstrong(int n){
        int original = n;
        int sum = 0;

        /* 1.first check digits in number
        * 2. take power of this digit in each number ,add it to sum
        * 3. take sum of all 3 with power   */

        // Count the number of digits
        int totalDigits_Power = String.valueOf(n).length();
        while(n > 0){

            int digit = n % 10; // takes last digit of number
            sum += Math.pow (digit,totalDigits_Power);
            n = n/10; // reduces number size each time till n = 0

        }
        if(original == sum){
            System.out.println("Number "+ original  +" is a Armstrong Number");
        }else{
            System.out.println("Number is Not a Armstrong Number");
        }
    }
}
