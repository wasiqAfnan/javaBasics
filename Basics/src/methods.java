package Basics.src;

public class methods{
    // function overloading
    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    // non static function
    
    void sum(String name){
        System.out.println("Hello, "+ name);
    }
    public static void main(String[] args){
        int a = 25, b = 50, c = 25, d = 25;
        int res = sum(a,b); // sum function with 2 arguements will run
        System.out.println(res);

        int res1 = sum(a,b,c); // sum function with 3 arguements will run
        System.out.println(res1);

        int res2 = sum(a,b,c,d); // sum function with 4 arguements will run
        System.out.println(res2);

        // because sum is not static we have to create an object. We donot call non static function directly from main.

        methods obj = new methods();
        obj.sum("Afnan");
    }
}
