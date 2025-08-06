public class SearchInString {
    public static void main(String[] args) {
        String name  = "Neha";
        char target = 'p'; //  use single quotes for char
        System.out.println(Stringsearch(name, target));
    }

    static boolean Stringsearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            char element = str.charAt(i);
//            if (element == target) {
//                return true;
//            }

        // USING FOR EACH LOOP
        for (char i : str.toCharArray() ){ // to use for  each loop u need convert string to array
            if(i == target){
                return true;
            }
        }
        return false;


    }

}
