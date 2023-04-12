class Shape{
    int length,breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(int length) {
        this.length = length;
    }
    
    public void area(){
        System.out.println("Here area is undefined");
    }

}
class Square extends Shape{
    Square(int length){
        super(length);
    }
    
    @Override
    public void area(){
        System.out.println("Area of Square is: " + length*length);
    }

}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length,breadth);
    }

    @Override
    public void area(){
        System.out.println("Area of Rectangle is: " + length*breadth);
    }

}
public class oop6_MethodOverriding {
    public static void main(String[] args) {
        Square sqobj = new Square(5);
        Rectangle rectobj = new Rectangle(5,8);

        sqobj.area();
        rectobj.area();

    }
}
