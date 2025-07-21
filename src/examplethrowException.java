public class examplethrowException {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        public static void main(String[] args) {
            //define two numbers
            //calculate sum of them and print then
            // throw exception if sum > 1
            int a = 3;
            int b = 12;

            try{
                int ans = sum(a,b);
                System.out.println(ans);
            }
            catch(IllegalArgumentException e){
                System.out.println("Exception caught:  " + e.getMessage());
            }

        }
        static int sum (int a,int b){
            int sum = a + b ;

            if(sum > 10){
                throw new IllegalArgumentException("Sum cannot be greater then 10");
            }
            return sum;
        }

    }


