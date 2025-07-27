public class LCMof2numbers {
    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        LCM(a,b);
        System.out.println("LCM of "+a+ " & " +b+ " Using formula is: " + LCMusingFormula(a,b));
    }

    /* TO FIND LCM OF TWO NUMBERS
    1. Find Maximum of both numbers a & b ,& Store in variable x
    2. find a*b this is the maximum number that divides both a & b,& Store in variable y
    3.task is to find number between range x & y ,which divides both numbers
    so we apply for loop for this */
    static void LCM(int a ,int b){
        int x = a > b ? a : b;
        int y = a * b;
        int ans = x; //initially x is the assumed as ans
        for (int i = x ; i <= y; i++){
            if(i % a == 0 && i % b == 0){
                ans = i;
                break;
            }
        }
        System.out.println("LCM of two Number is: "+ans);

    }

    //  2 appoarch using GCD formula --> Recursive Approach
    //find LCM = a * b / GCD (a,b)
    //GCD FUNC = returns ( b % a , a ) & return b if a = 0
    /* DRY RUN
    *  a = 6 , b = 9
    * GCD (6,9) = 9 % 6, 6 = 3,6
    * GCD (3,6) = 6 % 3, 3 = 0,3
    * GCD (0,3) = 3
    * SO, LCM = 6 * 9 / 3 =  18 */

    static int LCMusingFormula(int a,int b){
        return a / GCD(a,b) * b;
    }

    static int GCD(int a,int b){
        //base condition
        if(a == 0){
            return b;
        }
        return GCD(b % a, a);
    }
}
