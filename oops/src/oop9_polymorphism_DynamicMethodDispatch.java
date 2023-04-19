class phone {
    String name;

    public void display(String name) {
        System.out.println("This is " + name + " Phone");
    }
}

class Smartphone extends phone {
    public void display(String name) {
        System.out.println("This is " + name + " Smartphone");
    }
}

public class oop9_polymorphism_DynamicMethodDispatch {
    public static void main(String[] args) {
        // craeating object of smartphone but refernce to phone
        // a super class can take refrence of subclass, this is called Dynamic Method Dispatch or Runtime Polymorphism
        phone obj1 = new Smartphone();
        obj1.display("Android");// will print smartphone on the terminal
    }
}
