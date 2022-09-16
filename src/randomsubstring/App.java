package randomsubstring;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		/*
		Random rnd;   // declare it; rnd doesn't exist until you use the new keyword
		rnd = new Random();  // this builds the rnd object.
		*/
		
		Random rnd = new Random();  // declares and initializes at once
		// int x = 1 + rnd.nextInt(6);  // 0 through 5
		
		String greeting = "I am so happy it is finally Friday!";
		int length = greeting.length();
		int startingIndex = rnd.nextInt(length);
		int endingIndex = startingIndex+1 + rnd.nextInt(length-startingIndex);
		String sub = greeting.substring(startingIndex,endingIndex);
		System.out.printf("The characters between %d and %d are %s.\n", 
				startingIndex, endingIndex, sub);
	}
}
