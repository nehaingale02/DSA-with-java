class Pen{
    String color;
    String type; //ballpoint,gel

    public void write(){
        System.out.println("something writing");
    }

    public void printType(){
        System.out.println(this.type);
    }
    
}
class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}


public class OOPS{
    public static void main(String args[]) {
       Student s1 = new Student();
       s1.name = "Neha";
       s1.age = 22;

       Student s2 = new Student(s1);
       s2.printInfo();
       
    }

}
