public class GCDof2num {
    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        GCDof2num(a,b);
        System.out.println("GCD of " +a+ " & " +b+ " is : " +GCD(a,b));
    }
    static void GCDof2num(int a ,int b){
        // iterative approach
        int x = Math.min(a,b);
        int ans = x;
        for(int i = x; i >= 2; i--){
            if(a % i == 0 && b % i == 0 ){
                ans = i;
                break;
            }
        }
        System.out.println("GCD of Two Number is: "+ans);
    }
  //recursive approach
    /* if a > b , replace a = a - b
    if b > a replace b = b - a
    DRY RUN:
    GCD(36,60) = b > a --> 36, 60-36 --> 36,24
    GCD(36,24) = a > b --> 36-24, 24 --> 12,24
    GCD(12,24) = b > a --> 12,24-12 --> 12,12
    GCD(12,12) = a = b --> returns a --> 12 is GCD */


    static int GCD(int a ,int b){
        //base condition

        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }

        if(a > b){
            return GCD(a-b,b);
        }
        return GCD(a,b - a);
    }
}
