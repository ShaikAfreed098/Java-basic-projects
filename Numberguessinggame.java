import java.util.Random;
import java.util.Scanner;
public class Numberguessinggame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran=new Random();
        int guessnumber = ran.nextInt(100);
        int guess = 0;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Enter your guessing number");
        while(guess!=guessnumber){
            System.out.println("Enter your guess (between 0 and 99):");
            guess = sc.nextInt();
            attempts++;
            if(guess<guessnumber){
                System.out.println("Too low! Try again.");
            } else if(guess>guessnumber){
                System.out.println("Too high! Try again.");
            } else{
                System.out.println("Congratulations! You've guessed the number " + guessnumber + " in " + attempts + " attempts.");
            }
        }
        sc.close();
    }
    
}
