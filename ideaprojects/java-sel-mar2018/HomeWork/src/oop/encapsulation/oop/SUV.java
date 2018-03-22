package oop.encapsulation.oop;

public class SUV extends Bus{

    static String Make = "Mercedes-Benz";
    private int numOfSeat = 60;
    private double Price = 45000.53;

    public void setMake(String make) {
        Make = make;
        System.out.println("Make: "+ Make);
    }

    public void setNumOfSeat(/*int numOfSeat*/) {
        //this.numOfSeat = numOfSeat;
        System.out.println("Number of seats: " + numOfSeat);
    }
    public int getNumOfSeat() {
        return numOfSeat;
    }
    public void setPrice(double price) {
        this.Price = price;

        System.out.println("Price: " + price);
    }
    public double getPrice() {
        return Price;
    }

    public void setMake(String make, String Model) {
        Make = make;
        System.out.println("Make: " + Make + ", Model: " + Model);
    }
    @Override
    public void setNumOfSeat(int numOfSeat, double Price) {
        this.numOfSeat = numOfSeat;
        System.out.println("Buses with number of seats upto " + numOfSeat + " can cost upto " + Price);
    }
    @Override
    public void setPrice(double originalPrice, double newPrice) {
        this.Price = originalPrice;
        double Balance = originalPrice - (newPrice-200);
        System.out.println("The difference between the original price and the new price is "+ Balance);
    }

}