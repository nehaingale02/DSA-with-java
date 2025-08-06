public class GetCharinString {
    public static void main(String[] args) {
        String str = "neha";
        int index = 2;

// Using charAt(index):--
       System.out.println(str.charAt(index));
      getchar(str, index);
    }

    // Using: .tocharArray --> we first convert String to Array and store in ch[] then Access it ch[index]
    static void getchar(String str, int index) {

        char ch[] = str.toCharArray();

        if(ch.length == 0){
            System.out.println("Array is Empty");
        }
        else if (index >= 0 && index < ch.length) {
            System.out.println(ch[index]);
        }else{
            System.out.println("Index out of bound");
        }
    }
}
