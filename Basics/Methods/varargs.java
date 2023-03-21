public class varargs{
    // vararg function
    static int sum(int... arr){
        int result = 0;
        // for-each loop
        for(int element: arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args){
        int a = 25, b = 25, c = 25, d = 25;

        // calling Vararg function

        int res = sum(a,b);
        int res1 = sum(a,b,c);
        int res2 = sum(a,b,c,d);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
