interface one{
    public void method1();
}
class Base{
    public void display(){
        System.out.println("This is base class");
    }
}

// through extending a class and implementing interface we can achieve multiple inheritence in java
class Derived extends Base implements one{
    @Override
    public void display(){
        System.out.println("This is Derived class");
    }

    @Override
    public void method1(){
        System.out.println("This is method 1 from interface one");
    }

}
public class oop10_Interface {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
        obj.method1();
    }
}
