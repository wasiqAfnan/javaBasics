package Basics.src;
public class StringMethod {
    public static void main(String[] args){
        // declaration and initialiation of string
        // method 1
        String str = "hello";
        // method 2
        String str1 = new String("HELLO WORLD");

        // stringname.length() --> returns length of the string

        int x = str.length();
        System.out.printf("%d\n",x);

        x = str1.length();
        System.out.printf("%d\n",x);

        // stringname.toLowerCase() and stringname3.toUpperCase --> convert upper to lower and vice versa

        String str2 = str.toUpperCase();
        System.out.printf("%s\n",str2);

        str2 = str1.toLowerCase();
        System.out.printf("%s\n",str2);

        // stringname.substring(start,end(optional)) --> returns a substring 

        System.out.println(str.substring(2));
        System.out.println(str.substring(1,4));

        // stringname.replace(oldchar,newchar) --> replace oldchar with newchar

        System.out.println(str1.replace('L', 'p'));
        System.out.println(str1.replace("LLO", "ppp"));

        // stringname.indexOf(char or string)--> return the index of char or string

        System.out.println(str1.indexOf('O'));

        // stringname.equals(string or char)--> check whether two string are same or not

        System.out.println(str.equals("hello"));

        // stringname.charAt(index)--> return char on any index

        System.out.println(str1.charAt(2));
    }
}
