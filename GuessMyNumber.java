import java.util.Random;
import java.util.*;
public class GuessMyNumber {
	public static void main( String[] args) {
		final Random random = new Random();
		final int numbertobeguessed = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		final int numberguessed = in.nextInt();
		final int offamount = Math.abs(numbertobeguessed - numberguessed);
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(inclusive). Can you guess what number is?");
		System.out.printf("Please type a number: %d%n", numberguessed);
		System.out.printf("You guessed <%d>%n", numberguessed);
		System.out.printf("I was thinking of <%d>%n", numbertobeguessed);
		System.out.printf("You were off by: %d%n", offamount);

	}
}