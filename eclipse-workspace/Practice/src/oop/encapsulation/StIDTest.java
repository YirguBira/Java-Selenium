package oop.encapsulation;

public class StIDTest {

	public static void main(String[] args) {
		StID stID = new StID();
		stID.setStID(1212);
		stID.setStName("Emebet");
		stID.setBirthDate("03-02-1900");
		System.out.println(stID.getStID() + " " + stID.getStName() + " " + stID.getBirthDate());
		
		StID stID2 = new StID();
		stID2.setStID(1213);
		stID2.setStName("Yirgu");
		stID2.setBirthDate("11-15-1800");
		System.out.println(stID2.getStID() + " " + stID2.getStName() + " " + stID2.getBirthDate());
	}

}
