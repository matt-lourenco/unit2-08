/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program tests the vehicle subclasses
 *
 ****************************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception {
		//Instantiate two vehicles and test them
		
		System.out.println("Bike");
		Bike bike = new Bike(Bike.Colours.RED);
		System.out.println(bike.getStatus());
		System.out.println("Number of tires: " + bike.getNumberOfTires());
		
		System.out.println("\nTruck");
		Truck truck = new Truck("BBBB445", Truck.Colours.WHITE);
		System.out.println(truck.getStatus());
		System.out.println("Number of tires: " + truck.getNumberOfTires());
	}
}