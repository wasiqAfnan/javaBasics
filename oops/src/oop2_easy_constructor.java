class Complex{
    private int real;
    private int imag;

    // Default Contructor or Contructor with no arguements
    Complex(){
        real = 0;
        imag = 0;
    }

    // Parameterized Contructor or Contructor with arguements
    Complex(int x,int y){
        real = x;
        imag = y;
    }

    public void showComplex(){
        System.out.println("The complex number is:");
        System.out.println(real + "i" + " + " + imag + "i");
    } 
}
public class oop2_easy_constructor {
    public static void main(String[] args) {
        Complex obj = new Complex();
        Complex obj2 = new Complex(15,65);
        obj.showComplex();
        obj2.showComplex();
    }
}
