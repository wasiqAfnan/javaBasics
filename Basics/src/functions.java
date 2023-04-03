import java.util.Scanner;



public class functions {
    public static void main(String[] args) {
        int x,y;
        // static int z = 5;
        // z = 5 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Input First num:");
        x = in.nextInt();
        System.out.print("Input Second num:");
        y = in.nextInt();
        input(x,y);
    }
    static void input(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
