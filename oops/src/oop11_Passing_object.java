class Complex {
    int real, imag;

    Complex() {
        this.real = 0;
        this.imag = 0;
    }

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c2) {
        Complex c3 = new Complex();
        c3.real = this.real + c2.real;
        c3.imag = this.imag + c2.imag;
        return c3;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class oop11_Passing_object {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 8);
        Complex c2 = new Complex(7, 5);
        Complex c3 = new Complex();

        c3 = c1.add(c2);

        c1.display();
        c2.display();
        c3.display();
    }
}