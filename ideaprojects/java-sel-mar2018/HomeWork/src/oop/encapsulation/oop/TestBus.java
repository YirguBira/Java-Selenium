package oop.encapsulation.oop;

public class TestBus {

    public static void main (String[] args){

        //Static variable belongs to the class and the main method (itself static) accesses it through the class
        System.out.println(Bus.Make);
        //Instantiating the object to access local variables (and class variables via getter methods)
        Bus bus = new Bus();
        bus.setMake("Daewoo");
        //Overloading setMake
        bus.setMake("Daewoo", "BX212");
        //Variables may not be redefined
        bus.setNumOfSeat();
        //Overloading setNumOfSeat
        bus.setNumOfSeat(60, 5999.99);
        bus.setPrice(1000);
        //Overloading setPrice
        bus.setPrice(1000, 700);
        //Instantiating SUV object
        SUV suv = new SUV();
        //Overriding
        //SUV method (setPrice (double, double)) overrides Bus method (setPrice(double, double))
        suv.setPrice(1000, 700);
        //Accessing SUV static variable through the class
        System.out.println(SUV.Make);
    }
}
