package mathdemo;

public class App {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        double z = (double)x/y;
        double roundedDown = Math.floor(z);
        double roundedUp = Math.ceil(z);
        System.out.printf("Exact is %.2f, rounded up is %.2f, rounded down is %.2f.\n",z,roundedUp,roundedDown);
    }    
}
