import java.lang.invoke.MutableCallSite;

public class oop12_Exceptional_handling {
    // Simple try catch block
    static void tryCatch(int divisable,int divisor){
        try{
            int res = divisable / divisor;
            System.out.println(divisable + " / " + divisor + " = " + res);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    // Multiple try catch block
    static void MultipleTryCatch(int divisable,int divisor){
        try{
            int res = divisable / divisor;
            System.out.println(divisable + " / " + divisor + " = " + res);
        }catch(NullPointerException e2){
            System.out.println("Null Error: " + e2.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void tryCatchFinally(int divisable,int divisor){
        try{
            int res = divisable / divisor;
            System.out.println(divisable + " / " + divisor + " = " + res);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Please enter divisor other than 0");
        }
    }
    static void throwsExample() throws ArithmeticException {
        int res = 36/0;
        System.out.println(res);
    }
    public static void main(String[] args) {
        tryCatch(250, 5); // calling tryCatch()
        MultipleTryCatch(250, 6); // calling MultipleTryCatch()
        tryCatchFinally(250, 0); // calling tryCatchFinally()

        try {
            throwsExample();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
