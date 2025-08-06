public class SimpleInterest {
    /*Simple Interest SI :( P * R * T)/100
    * Simple Interest is the interest
    * calculated only on the original amount (called principal) over a period of time at a fixed rate.
    * Where:
P = Principal amount (initial money)
R = Rate of interest (per year)
T = Time (in years) */
    public static void main(String[] args) {
        float P = 100000, R = 7, T = 2;
        float SI = (P * R * T)/ 100;
        System.out.println("Simple Interest : " + SI);
    }
}
