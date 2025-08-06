public class LargestInthreenums {
    public static void main(String[] args) {
        int a = 12 ,b = 87, c = 34;
        int ans = largest(a,b,c);
        System.out.println("largest among three is: " + ans);
        System.out.println("largest among 3 numbers after Math.max is: " + largestOfthreeUsingMath(a,b,c) );
        System.out.println("largest among three is: " + largestUsingTernaryOp(a,b,c));
    }

    static int largest(int a, int b, int c){

        // Using if-else will find largest among the three numbers

        if(a >= b && a >= c){
            return a;
        }else if(b >= a && b >= c){
            return b;
        }else{
            return c;
        }
    }

    static int largestOfthreeUsingMath(int a,int b,int c){

        int largest = Math.max (Math.max (a,b) , c);
        return largest;
    }

    static int largestUsingTernaryOp(int a,int b, int c){

        int largest = a > (b > c ? b : c) ? a : ((b > c) ? b : c);
        return largest;
    }
}
