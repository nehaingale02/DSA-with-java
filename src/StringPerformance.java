/* This approach of adding characters one by one is not a optimised approach as time Complexity of this is O(N^2)
* as every i times it creates new Object in heap,  wasting memory
* a, ab, abc, abcd,..., abcd..y --> Since no reference variable is pointing to these Objects
* Therefore we need a datatype which modifies itself and does not change the reference to it
* So, Solution we get is to Use StringBuilder --> Which is Mutable */

public class StringPerformance {

    public static void main(String[] args) {
        String series = "";

        for(int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
            series = series + ch; // series += ch
        }
        System.out.println(series);
    }
}
