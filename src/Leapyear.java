public class Leapyear {
    public static void main(String[] args) {
        int year = 1955;
        checkleapyear(year);
    }
    static void checkleapyear(int year){

        if(year % 4 == 0 && year % 100 != 0 ){
            System.out.println("It is a Leap year");
        }else if(year % 400 == 0){
            System.out.println("It id a Leap year");
        }else{
            System.out.println("No ,It is Not a Leap year");
        }
    }
}
