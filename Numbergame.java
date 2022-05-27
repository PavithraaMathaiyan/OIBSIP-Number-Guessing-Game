package Number;
import java.util.*;

public class Numbergame {
	    public static void
	    guessingNumberGame(){
	        Scanner sc = new Scanner(System.in);
	        int number = 1 + (int)(100 * Math.random());
	        int N = 5;
	        int i, guess;
	        System.out.println("Guess the Number between 1 to 100. You have 5 Chance to Guess.");
	        for (i = 0; i < N; i++) {
	            System.out.print("Guess the number :");
	            guess = sc.nextInt();
	            if (number == guess) {
	                System.out.println( "Congratulations! You Won the Game");
	                break;
	            }
	            else if (number > guess && i != N - 1) {
	                System.out.println("Guess the number greater than " + guess);
	            }
	            else if (number < guess && i != N - 1) {
	                System.out.println("Guess the number less than " + guess);
	            }
	        }
	        if (i == N) {
	            System.out.println("Oops! your chances are  Over.");
	            System.out.println("Correct answer is " + number);
	        }
	        sc.close();
	    }
	    public static void main(String arg[])
	    {
	        guessingNumberGame();
	    }

	}
