import java.util.ArrayList;
import java.util.Scanner;
import java.util.Spliterator;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Car> cars = new ArrayList<>();
		
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		int numCars = CarValidator.getInt(scnr, "Please tell me how many cars you are storing.");
		
		for (int i = 0; i < numCars; i ++) {
			Car tempCar = new Car((CarValidator.getString(scnr, ("What is the make of car " + (i+1)))), 
					(CarValidator.getString(scnr, ("What is the model of car " + (i+1)))), 
							(CarValidator.getInt(scnr, ("What is the year of car " + (i+1)))),
									CarValidator.getDouble(scnr, ("What is car " + (i+1) + " worth?")));
			cars.add(tempCar);
		} 
		
		CarMethods.printCars(cars);
		
		
	}

}
