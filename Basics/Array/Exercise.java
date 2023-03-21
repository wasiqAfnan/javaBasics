import java.util.Scanner;
public class Exercise {
    public static void main(String[] args){
        // Question 1: Create an array of 5 floats and calculate their sum.

        // Scanner in = new Scanner(System.in); 
        // float sum = 0;
        // float[] number = new float[5];

        // for(int i = 0; i < 5; i++){
        //         float temp = in.nextFloat();
        //         sum = sum + temp;
        // }

        // System.out.println(sum);
        // }

        //Question 2: Write a program to find out whether a given integer is present in an array or not.

        // int[] arr = {25,64,78,49,10};
        // int num;
        // int flag = 0;
        // Scanner in = new Scanner(System.in);
        // num = in.nextInt();
        // for(int i = 0; i < 5; i++){
        //     if(arr[i] == num){
        //         System.out.println("the number is present");
        //         flag++;
        //         break;
        //     }
        // }
        // if(flag == 0){
        //     System.out.println("the number is not present");
        // }

        //Question 3: Create a Java program to add two matrices of size 2x3.

        // int[][] arr = new int[2][3];
        // int[][] arr1 = new int[2][3];
        // int[][] res = new int[2][3];
        // Scanner in = new Scanner(System.in);

        // System.out.println("Enter first matrix");

        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 3; j++){
        //         System.out.printf("Enter element for row %d colomn %d: ",i+1,j+1);
        //         arr[i][j] = in.nextInt();
        //     }
        // }

        // System.out.println("Enter second matrix");

        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 3; j++){
        //         System.out.printf("Enter element for row %d colomn %d: ",i+1,j+1);
        //         arr1[i][j] = in.nextInt();
        //     }
        // }

        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 3; j++){
        //         res[i][j] = arr[i][j] + arr1[i][j];
        //     }
        // }

        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 3; j++){
        //         System.out.println(res[i][j]);
        //     }
        // }

        //Question 4: Write a Java program to reverse an array.

        // int[] arr = {25,64,78,49,10};
        // int j = 4;
        // for(int i = 0; i < (arr.length)/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     j--;
        // }

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // Question 5: Write a Java program to find whether an array is sorted or not.
        
        int[] arr = {25,64,78,100,10};
        boolean issorted = true;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                issorted = false;
            }
        }

        if(issorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    } 
}
