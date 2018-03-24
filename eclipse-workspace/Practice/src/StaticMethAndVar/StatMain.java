package StaticMethAndVar;

public class StatMain {

	public static void main(String[] args) {
		//Static method belongs to the class; hence no need to create object
		StatMeth.describe(6, "blue");
		
		//Not possible for non-static method
		//StatMeth.description(5, "yellow");
		StatMeth statMeth = new StatMeth();
		statMeth.description(5, "yellow");
	
	}

}
