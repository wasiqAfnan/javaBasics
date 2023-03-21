import java.util.Scanner;

public class get_input {
    public static void main(String[] args) {
        // taking input from user and add to integer numbers
        Scanner sc = new Scanner(System.in); // creating object sc of class Scanner
        System.out.println("Enter first number : ");
        int a = sc.nextInt(); // nextInt use to take input integer number
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        int res = a+b;
        System.out.print("result = ");
        System.out.print(res);

        // taking input from user and add to float numbers
        System.out.println();
        System.out.println("Enter first number : ");
        float x = sc.nextFloat(); // nextFloat use to take input float number
        System.out.println("Enter Second number : ");
        float y = sc.nextFloat();
        float result = x+y;
        System.out.print("result = ");
        System.out.print(result);

        // printing string
        System.out.println("Enter string");
        String str = sc.next();// next func will only get a single word as input
        System.out.println(str);

        sc.nextLine();// Clearing input buffer
        System.out.println("Enter string");
        String str2 = sc.nextLine();// nextLine func will get the whole sentence as input
        System.out.println(str2);
    }
}
