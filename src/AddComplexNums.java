public class AddComplexNums {
    //create a class named complex which represent a blueprint for complex numbers
    //create constructor which gets initialised when new obj of complex number is created
    //create a function to add two complex numbers, returning it
    //print function to print the result
    static class Complex {
        int real;
        int imag;


        //this is a Constructor;initialised when obj is created i.enew complex number is created
        public Complex(int r, int i) {
            real = r;
            imag = i;
        }

        //function to add complex numbers
         public static Complex add(Complex n1,Complex n2){

            //create a blank result obj to store 0 ,0 as initial value
            Complex result = new Complex(0,0);
            result.real = n1.real + n2.real;
            result.imag = n1.imag + n2.imag;
            return result;
        }

        //function to print the result
         void print(){
            System.out.println(this.real + "+i" + this.imag);
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4,5);
        Complex c2 = new Complex(3,2);
        System.out.print("First complex number: ");
        c1.print();
        System.out.print("Second Complex number: ");
        c2.print();
        Complex ans = Complex.add(c1,c2);
        System.out.println("After Addition: ");
        ans.print();
    }
}
