public class basic_array {
    public static void main(String[] args){
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        int[] marks = new int[5];

        // 2. Declaration and then memory allocation
        int[] marks1;
        marks1 = new int[5];
        //Initialization
        marks1[0] = 100;
        marks1[1] = 60;
        marks1[2] = 70;
        marks1[3] = 90;
        marks1[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int[] marks2 = {98, 45, 79, 99, 80};
    }
}
