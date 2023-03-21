import java.util.Scanner;

public class exercise {

    public static void main(String[] args){

    // Question1: Sum three numbers

    // int a = 5;
    // int b = 6;
    // int c = 8;
     
    // int sum = a+b+c;
    // System.out.println(sum);

    // Question2: cgpa calculate

    // float a = 50;
    // float b = 60;
    // float c = 80;
    // float cgpa = ((a+b+c)/(10*3));
    // System.out.println(cgpa);

    // Question3: km to mile (hint: 1 km = 0.62137119 miles)

    // float km = 3.5f;
    // double miles = (km * 0.62137119);
    // System.out.print(km + " km = " + miles + " miles");

    // Question 4: number enter by user integer or not

    int num;
    Scanner in = new Scanner(System.in);
    boolean x = in.hasNextInt();
    if(x){
        System.out.println("The number is an integer number");
    }
    else{
        System.out.println("The number is not an integer number");
    }
    }
}
