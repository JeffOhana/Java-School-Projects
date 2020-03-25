import java.util.*;
public class EmployeePay {
	public static void main( String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter employeeId, hrsWorked, wageRate, deductions: ");
		String firstNameOfEmployeeX = in.next(); 
		double hrsWorked = in.nextDouble();
		double wageRate = in.nextDouble();
		int deductions = in.nextInt();

		System.out.println("Input ...");
		System.out.printf("Employee Id: %s%n", firstNameOfEmployeeX);
		System.out.printf("Hours Worked: %.2f%n", hrsWorked);
		System.out.printf("Wage Rate: %.2f%n", wageRate);
		System.out.printf("Deductions: %d%n", deductions);

		double gross = hrsWorked * wageRate;
		double tax = gross * 0.15;
        double net = gross - tax - deductions - (gross * 0.05);
        double average = net / hrsWorked;


		if (hrsWorked < 1 || wageRate < 15 || deductions <= 0 || deductions >= 35) {
			System.out.println("One or more of the input(s) is/are invalid");
			

		}



		else if (net < 0) {
			System.out.println("Error: the net pay is negative");
			

		}

        else {
        	System.out.println("Output ...");
            System.out.printf("Gross Pay: %.2f%n", gross);
		    System.out.printf("Taxes: %.2f%n", tax);
		    System.out.printf("Net pay: %.2f%n", net);
		    System.out.printf("Average pay: %.2f%n", average);

        }


	}
}