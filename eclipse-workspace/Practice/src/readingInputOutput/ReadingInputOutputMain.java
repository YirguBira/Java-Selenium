package readingInputOutput;

import java.util.Scanner;

public class ReadingInputOutputMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("After ten years you will be "+(age+10));
		System.out.println("-----END-----");
		
		ReadingInput readInput = new ReadingInput();
		readInput.Read();
		ReadingOutput readOutput = new ReadingOutput();
		readOutput.Read();

	}

}
 