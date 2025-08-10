public class StringPalindrome {
    public static void main(String[] args) {
        String name = "nehaahen";
        System.out.println(isPalindrome(name));
        System.out.println(isPalindromeforloop(name));
    }

    static boolean isPalindrome(String name) {

        name = name.toLowerCase(); // this creates new string of lower case cannot change the original one as Strings are immutable


        if(name == null || name.length() == 0){ //check null first
            return  true; // if string is empty or null is considered palindrome
        }
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeforloop(String name){
        if(name == null || name.length() == 0){
            return true;
        }
        int end = name.length() - 1;
        for(int i = 0 ; i < name.length()/2; i++){
            if(name.charAt(i) != name.charAt(end-i)){
                return false;
            }
        }
        return true;
    }
}

