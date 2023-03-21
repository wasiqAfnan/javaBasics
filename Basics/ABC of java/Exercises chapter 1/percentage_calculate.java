import java.util.Scanner;
public class percentage_calculate {
    public static void main(String[] args){
        int totalMarks;
        double average;
        double percent;
        int toatlMarksAcquired = 0;

        int[] marks; // initializing an array
        marks = new int[5];// alloocating memory for array

        Scanner in = new Scanner(System.in); // crearing object for taking input

        System.out.print("Total marks of each subject is: ");
        totalMarks = in.nextInt();

        // taking input marks
        for(int i=0;i<5;i++){
            System.out.print("Enter marks out of " + totalMarks + " for subject "+ (i+1) + " ");
            marks[i] = in.nextInt();
        }

        // calculating total of 5 marks
        for(int i=0;i<5;i++){
            toatlMarksAcquired = toatlMarksAcquired + marks[i];
        }

        average = (toatlMarksAcquired / 5.0); // calculating average
        percent = (toatlMarksAcquired/(totalMarks*5.0))*100.0f;
        System.out.println("Average marks = "+ average);
        System.out.println("Your percentage = "+percent);
    }
}
