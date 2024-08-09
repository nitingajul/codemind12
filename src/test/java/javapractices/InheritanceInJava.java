package javapractices;

public class InheritanceInJava {

	public static void main(String[] args) {

		Bicycle t = new Bicycle();
		t.runnig();
		System.out.println(t.color);
		System.out.println(t.numberOfWeels);
		System.out.println(t.manufacturer);

		FourWheelerVehicle f = new FourWheelerVehicle();
		System.out.println(f.numberOfVehicle);
		System.out.println(f.color);
	}

}

class Vehicle {

	// properties
	String rtoRegistrationNumber = "MH12 AB1020";
	String color = "white";

	// Behavior
	public void runnig() {
		System.out.println("Vehicle is runnig");
	}
}

class TwoWheelerVehicle extends Vehicle {

	int numberOfWeels = 2;
}

class Bicycle extends TwoWheelerVehicle {

	String manufacturer = "hero";
}

class FourWheelerVehicle extends Vehicle {

	int numberOfVehicle = 4;

}
