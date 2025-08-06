public class CharVowelConsonant {
    //Using if else
    //Using switch combines both small and capital letters
    //Using indexOf method
    public static void main(String[] args) {

        char ch = 'f';
        VowelConsonantswitch(ch);
        indexOfVowelorNot(ch);


//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//            System.out.println("character is a vowel");
//        }else{
//            System.out.println("charater is a consonant");
//        }
    }

    //switch case:
    static void VowelConsonantswitch(char ch) {

        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) {
            System.out.println("Not a valid character, Please Enter a valid Alphabet ");
            }else {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("character is a vowel");
                    break;
                default:
                    System.out.println("character is a consonant");
            }
        }
    }
    //IndexOf method

    static void indexOfVowelorNot(char ch){
        String str = "aeiouAEIOU";

        if(str.indexOf(ch) != -1){
            System.out.println("Character is a vowel");
        }else {
            System.out.println("Character is a consonant");
        }
    }

}

