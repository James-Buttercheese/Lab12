import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class CarMethods {
	static Scanner scnr = new Scanner(System.in);

	public static void printCars(ArrayList<Car> cars) {

		System.out.printf("\n\n\n");
		System.out.println("Current Inventory:");
		System.out.printf("%-10s  %-10s  %-10s  %-10s\n", "Make", "Model", "Year", "Price");
		System.out.println("____________________________________________");
		System.out.println();
		Spliterator<Car> tempSplit = cars.spliterator();
		tempSplit.forEachRemaining(System.out::println);
	}

	public static void printUsedCars(ArrayList<Car> cars) {

		System.out.printf("\n\n\n");
		System.out.println("Current Inventory:");
		System.out.printf("%-10s  %-10s  %-10s  %-15s %-10s\n", "Make", "Model", "Year", "Price", "Mileage");
		System.out.println("_____________________________________________________________");
		System.out.println();
		Spliterator<Car> tempSplit = cars.spliterator();
		tempSplit.forEachRemaining(System.out::println);
	}

	public static ArrayList<Car> carList() {
		ArrayList<Car> cars = new ArrayList<>();

		UsedCar Used1 = new UsedCar("Chevy", "Cruze", 2018, 14000.00, 18000.00);
		UsedCar Used2 = new UsedCar("Ford", "Focus", 2012, 10000.00, 72000.00);
		UsedCar Used3 = new UsedCar("Honda", "Civic", 2004, 4500.00, 178000.00);
		Car Car1 = new Car("Mercury", "Sable", 2019, 44000.00);
		Car Car2 = new Car("Toyota", "Camry", 2019, 31000.00);
		Car Car3 = new Car("Dodge", "Challenger", 2019, 48000.00);

		cars.add(Used1);
		cars.add(Used2);
		cars.add(Used3);
		cars.add(Car1);
		cars.add(Car2);
		cars.add(Car3);

		return cars;
	}

	public static String magic(ArrayList<Car> cars, String response) {
		boolean loop = true;
		while (loop) {
		for (Car car : cars) {
			if (car.getModel().equalsIgnoreCase(response)) {
				System.out.println(car.toString());
				return response;
			}

		}
		System.out.println("We don't carry that model.");
		System.out.println("Would you please enter another option.");
		response = scnr.nextLine();
		} return "This didn't work.";
	}

	public static ArrayList<Car> getACar(ArrayList<Car> cars) {
		System.out.println();
		System.out.println("Which model would you like?");
		String userResponse = scnr.nextLine();
		System.out.println();
		userResponse = (magic(cars, userResponse));
		System.out.println("Would you like to buy this car? (Yes/No)");
		String userResponse2 = scnr.nextLine();
		if (userResponse2.equalsIgnoreCase("yes")) {
			cars = (magic2(cars, userResponse));
		} return cars;
	}
	
	public static ArrayList<Car> magic2(ArrayList<Car> cars, String response) {
		for (Car car : cars) {
			if (car.getModel().equals(response)) {
				cars.remove(car);
				System.out.println();
				System.out.println("Excellent!  Our finance department will be in touch shortly.");
				return cars;
			}

		}
		return cars;
	}
}
