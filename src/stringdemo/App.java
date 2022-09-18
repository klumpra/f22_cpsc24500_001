package stringdemo;

public class App {
    public static void main(String[] args) {
        String greeting = "Hello. It is a gloomy Monday.";
        String shouted = greeting.toUpperCase();
        String lowered = greeting.toLowerCase();
        
        String part = greeting.substring(3,10);
        int location = greeting.indexOf(".");
        char charAtPosition5 = greeting.charAt(5);
        System.out.printf("Uppercase: %s, Lowercase: %s, Part: %s, Location: %d\n",
            shouted,lowered,part,location);
        System.out.println(charAtPosition5);
    }
}
