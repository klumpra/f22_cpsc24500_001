package arrayofrandomints;
import java.util.Random;
import java.util.Scanner;
public class App {
	public static int[] generateRandomIntegers(int howMany, int maxVal,
		Random rnd) {
		int[] result = new int[howMany];
		for (int i = 0; i < howMany; i++) {
			result[i] = rnd.nextInt(maxVal);
		}
		return result;
	}
	public static void print(int[] numbers) {
		int count = 0;
		for (int num : numbers) {
			if (count != 0 && count % 5 == 0) {
				System.out.println(); // go on to next line
			}
			System.out.printf("%5d",num);
			count = count + 1;
		}
	}
	public static void printMenu() {
		System.out.println("Here are your options: ");
		System.out.println("1. Print");
		System.out.println("2. Mean");
		System.out.println("3. Max");
		System.out.println("4. Min");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static double findMean(int[] numbers) {
		double total = 0;
		for (int num: numbers) {
			total = total + num;
		}
		double result = total / numbers.length;
		return result;
	}
	public static int findMax(int[] numbers) {
		int result = numbers[0];
		for (int num: numbers) {
			if (num > result) {
				result = num;
			}
		}
		return result;
	}
	public static int findMin(int[] numbers) {
		int result = numbers[0];
		for (int num: numbers) {
			if (num < result) {
				result = num;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int numCount;
		System.out.print("How many numbers do you want? ");
		numCount = sc.nextInt();
		int[] nums;  //  nums will eventually be an array of ints
		nums = generateRandomIntegers(numCount,1000,rnd);
		double mean;
		int theMin, theMax;
		int choice;
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice == 1) {
				print(nums);
			} else if (choice == 2) {
				mean = findMean(nums);
				System.out.printf("The mean is %.2f.\n", mean);
			} else if (choice == 3) {
				theMax = findMax(nums);
				System.out.printf("The max is %d.\n", theMax);
			} else if (choice == 4) {
				theMin = findMin(nums);
				System.out.printf("The max is %d.\n", theMin);
			}		
		} while (choice != 5);
	}
}
