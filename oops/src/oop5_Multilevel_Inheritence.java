// Base class
class Basic{
    private int x;
    public void setX(int a){
        x = a;
    }
    public void getX() {
        System.out.println(x);
    }
    
}

// Derived from base class
class Derived extends Basic{
    private int y;
    public void setY(int a){
        y = a;
    }
    public void getY() {
        System.out.println(y); 
    }
    
}

// Derived from base Derived Class
class Derived2 extends Derived{
    private int z;
    public void setZ(int a){
        z = a;
    }
    public void getZ() {
        System.out.println(z);
    }
    
}
public class oop5_Multilevel_Inheritence {
    public static void main(String[] args) {
        // creating object of Derived2 class
        Derived2 obj = new Derived2();
        // As derived2 class has inherited from derived and derived in turn inherited from basic we can call all three set methods by using derived2 object
        obj.setX(5);
        obj.setY(8);
        obj.setZ(10);

        // printing data respectively
        obj.getX();
        obj.getY();
        obj.getZ();
    }
}
