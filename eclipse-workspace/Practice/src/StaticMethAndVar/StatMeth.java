package StaticMethAndVar;

public class StatMeth {
	
	private double height = 6.0;
	private int number = 3;
	private String color = "red";
	
	public StatMeth() {
		
		int number = 3;
		String color = "red";
		
	}
	
	public static void describe(int num, String colr) {
		//Not possible for static method
		/*this.number = num();
		this.color = col();*/
		
		int number = 3;
		String color = "red";
		
		System.out.println("number: " + number + "; color: " + color);
		
	}
	
	public void description(int numb, String col) {
		this.number = numb;
		this.color = col;
		System.out.println ("Number of items: " + numb + " Color of items: " + col);
	}
	

}
