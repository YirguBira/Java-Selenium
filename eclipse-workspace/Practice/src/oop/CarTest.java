package oop;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("------Interface object---------");
		//interface object
		Car car = new Toyota();
		car.drive();
		car.shape();
		car.stop();
		
		System.out.println("-------Concrete Class object----------");
		
		//class object
		Toyota carToyota = new Toyota();
		carToyota.drive();
		carToyota.shape();
		carToyota.stop();
		carToyota.carModel();
		
		System.out.println("-------Abstract class object----------");
		
		//Abstract class object
		ModernCar modernCar = new Toyota();
		modernCar.motor();
		modernCar.secureBreak();
		
		System.out.println("-------Concrete lass object----------");
		
		//Concrete class object
		carToyota.secureBreak();
		
		System.out.println("-------interface object----------");
		//interface object (BMW)
		BMW bmw = new Toyota();
		bmw.engine();
		
		System.out.println("-------Concrete class object----------");
		
		//Concrete class object
		
		carToyota.engine();
		

	}

}
