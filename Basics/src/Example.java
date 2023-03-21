package Basics.src;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        int num, fact = 1;
        // creating scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = in.nextInt();
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
