import java.util.Random;
import java.util.Scanner;


public class project_guess_number {
    public static void main(String[] args){
        // creating object of random
        Random rand = new Random();
        int number = rand.nextInt(101); // generating random no upto 100
        
        int guess = 0;
        int userInput;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Guess the number: ");
            userInput = in.nextInt();

            if(userInput > number){
            System.out.println("Lower the number");
            }
            else if(userInput < number){
            System.out.println("Higher the number");
            }
            guess++;
        }while(userInput != number);

        System.out.printf("You have guessed the number in %d attempts",guess);
    }
}
