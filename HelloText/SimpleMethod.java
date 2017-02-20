/**
 * Created by mjl84 on 2/6/2017.
 */
public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from the main method");
        displayMessage();
        System.out.println("Hello back from the main method");
    }

    public static void displayMessage() {
        System.out.println("Hello from the display message");
        displayMessage2();
    }

    public static void displayMessage2() {
        System.out.println("Hello from the second message");
        displayMessage3();
    }

    private static void displayMessage3() {
        System.out.println("Hello from the third message");
    }
}
