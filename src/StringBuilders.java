import java.sql.SQLOutput;

public class StringBuilders {

    //Using String Builder it is not Creating new Object everytime but changing in original object SB only
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i< 26; i++){
            char ch = (char) ( 'a' + i);
            SB.append(ch);
        }
        System.out.println(SB);
        SB.deleteCharAt(0);
        System.out.println(SB);
        System.out.println(SB.indexOf("t"));

    }
}
