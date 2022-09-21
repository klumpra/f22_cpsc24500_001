package sumandprodfunctions;
import java.util.Scanner;

public class SumAndProduct {
	private double x, y, z;  // the data of the class
	public double computeSum(double n1, double n2, double n3) {
		double sum;
		sum = n1 + n2 + n3;
		return sum;
	}
	public double computeProduct(double n1, double n2, double n3) {
		double prod;
		prod = n1 * n2 * n3;
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Enter three numbers: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		SumAndProduct me = new SumAndProduct(x,y,z);
		double sum, product;
		sum = me.computeSum(x,y,z);
		product = me.computeProduct(x,y,z);
		System.out.printf("The three numbers are %.2f, %.2f, and %.2f.\n", 
				x,y,z);
		System.out.printf("The sum is %.2f and the product is %.4f.\n",
				sum,product);
		*/
	}
}
