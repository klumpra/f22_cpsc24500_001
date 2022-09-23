package tempconvert;
import java.util.Scanner;
public class App {

    public static double convertToCelsius(double temp) {
        return 5.0/9*(temp-32);
    }
    public static double convertToFahr(double temp) {
        return 9.0/5 * temp + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature as degrees followed by F or C: ");
        double degrees;
        String scale;
        degrees = sc.nextDouble();
        scale = sc.next();   
        double newTemp;
        if (scale.equalsIgnoreCase("F")) {
            newTemp = convertToCelsius(degrees);
            System.out.printf("That is %.2f C.\n", newTemp);
        } else if (scale.equalsIgnoreCase("C")) {
            newTemp = convertToFahr(degrees);
            System.out.printf("That is %.2f F.\n", newTemp);
        } else {
            System.out.println("Dude.");
        }
    }
}
