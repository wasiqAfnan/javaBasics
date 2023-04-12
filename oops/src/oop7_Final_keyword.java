final class test{
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

/*
a variable which declared as final we can't change it's value
a class which declared as final we can't Inherit from it
*/

// This is illegal as class test is declared as final 

// class derived extends test{

// }
public class oop7_Final_keyword {
    public static void main(String[] args) {
        test obj = new test();
    }
}
