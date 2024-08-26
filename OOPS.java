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
    int rollno;
    float marks;

    Student(String name, int age, int rollno,float marks){
        this.name = name;
        this.age = age;
        this.rollno= rollno;
        this.marks = marks;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        System.out.println(this.marks);
    }
}

public class OOPS{
    public static void main(String args[]) {
       Student s1 = new Student("Name",22,33,98.5f); // here Student() is a constructor 
   
     
       s1.printInfo();
      
String a = "neha";
String b = a;
System.out.println(b);
       
    }

}
