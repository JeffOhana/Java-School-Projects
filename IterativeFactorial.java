import java.util.*;
import java. math.*;
public class IterativeFactorial {
	public static void main( String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter `n` (an integer greater than or equal to zero) -- I will calculate `factorial(n)`: ");
		int n = in.nextInt();

		if (n < 0) {
			System.out.println("the input is invalid: n is constrained to be an integer greater than or equal to zero");
			

		}

		else if (n == 0) { 
			System.out.println("factorial(0) = 1");

		}

        else {
        	BigInteger facn = BigInteger.valueOf(1);
        	for (int i = 1; i <= n; i++) {
        		facn = facn.multiply(BigInteger.valueOf(n - i + 1));


        	}

        	System.out.printf("factorial(%d) = %d%n", n, facn);

        }


	}
}