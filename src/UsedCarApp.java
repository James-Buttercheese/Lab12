import java.util.ArrayList;
import java.util.Scanner;


public class UsedCarApp {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		boolean looping = true;
		
		cars = CarMethods.carList();
		CarMethods.printUsedCars(cars);
		
		while (looping) {
			
		
		cars = (CarMethods.getACar(cars));
		CarMethods.printUsedCars(cars);
		looping = CarValidator.yesOrNo(scnr, "Would you like to look at another car?");
	}
		System.out.println("Thank you for shopping.  Goodbye.");
		
		
	}

}
