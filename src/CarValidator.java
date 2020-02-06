import java.util.Scanner;

public class CarValidator {
	
	public static double getDouble(Scanner scnr, String prompt) {
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine(); 
				System.out.println("Please enter a number using digits.");
			}
		} while (!isValid);

		double number = scnr.nextDouble();
		scnr.nextLine();
		return number;
	}
	public static String getString(Scanner scnr, String prompt) {
		
		System.out.print(prompt);
		return scnr.nextLine();
	}
	
	public static int getInt(Scanner scnr, String prompt) {
		System.out.print(prompt);
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); 
			System.out.println("Please enter a whole number using digits.");
			System.out.println(prompt);
		}
		int result = scnr.nextInt();
		scnr.nextLine();
		return result;
	}
	
	public static boolean yesOrNo(Scanner scnr, String prompt) {

		String input;
		boolean isValid = false;
		
		do {
			input = getString(scnr,prompt);
			
			if (input.toLowerCase().startsWith("y")) {
				return true;
			} else { 
				System.out.println("Are you sure?");
				input = getString(scnr,"");
				if (input.toLowerCase().startsWith("y")) {
				isValid = true;
				} 
			}
			
		} while (!isValid);
				
	
		return false;

	}
}
