package oop;

public class Toyota extends ModernCar implements Car, BMW{

	public void drive() {
		System.out.println("Car: drive");
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Car: shape");
	}

	public void stop() {
		System.out.println("Car: break");
	}
	
	public void carModel() {
		System.out.println("Toyta: Camry");
	}

	public void motor() {
		System.out.println();
		
	}

	public void engine() {
		System.out.println("BMW: engine implemented in Toyota");
		
	}

}
