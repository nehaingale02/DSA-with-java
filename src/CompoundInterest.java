/* Compound Interest is the interest calculated on the principal + interest earned from previous periods.
In short, "interest on interest".
 { Compound Interest(CI) = A−P }
            OR
 { Total Amount after CI = P(1 + R/100)^t }
Where,
P = Principal amount
R = Rate of interest (per year)
T = Time (in years)
A = Total amount after interest --> A=P×(1+R/100))^T
*/
import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        double P = 1000, R = 5.23, T = 2;

        // A = P(1 + R/100)^T → this gives total amount after CI
        double A = P * Math.pow((1 + R / 100), T);

        // Compound Interest = A - P
        double CI = A - P;

        System.out.println("Total Amount after Compound Interest: " + A);
        System.out.println("Compound Interest Earned: " + CI);
    }
}
