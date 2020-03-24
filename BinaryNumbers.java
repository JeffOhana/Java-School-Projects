package edu.yu.intro.arrays;

import java.util.*;

public class BinaryNumbers {
	public static void main( String[] args) {

		Scanner in = new Scanner(System.in);

		
		System.out.print("Enter an integer greater than zero: ");
        int userInput = in.nextInt();
		
			if (userInput <= 0) {
				System.out.println("Not greater than zero, exiting");

		    }

		    else { 

		    	

		    	String bitstring = "";

		    	System.out.printf("Converting %d to binary representation%n", userInput);

		    	while (userInput > 0 ) {
		    		int bit = userInput % 2 ;
                    int quotient = userInput/2 ;
                    bitstring = bit + bitstring;
                    userInput = quotient ;
                }
                int strlength = bitstring.length();
                System.out.printf("%d -> %s%n", userInput, bitstring);
                System.out.printf("Need %d bits to represent %d in binary%n", strlength , userInput);







		    }

		

		

    }

}

