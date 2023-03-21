class MyClass{
    public int real;
    public int imaginary;

    // default constructor

    public MyClass(){
        real = 0;
        imaginary = 0;
    }

    // parameterized constructor

    public MyClass(int i, int j){
        real = i;
        imaginary = j;
    }

    public MyClass add(MyClass obj1, MyClass obj2){
        MyClass obj3 = new MyClass();
        obj3.real = obj1.real + obj2.real;
        obj3.imaginary = obj1.imaginary + obj2.imaginary;
        return obj3;
    }

    public void display(){
        System.out.print(real + " + ");
        System.out.println(imaginary + "i");
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyClass obj3 = new MyClass(); // default contructor will be called
        MyClass obj1 = new MyClass(6,7); // parameterized contructor will be called
        MyClass obj2 = new MyClass(5,6); // parameterized contructor will be called

        obj3 = obj3.add(obj1,obj2);
        obj3.display();
    }
}
