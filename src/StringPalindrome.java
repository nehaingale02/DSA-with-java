public class StringPalindrome {
    public static void main(String[] args) {
        String name = "ABCCBA";
        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String name) {

        name = name.toLowerCase(); // this creates new string of lower case cannot change the original one as Strings are immutable
        int start = 0;
        int end = name.length() - 1;

        if(name == null || name.length() == 0){
            return  true;
        }

        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

