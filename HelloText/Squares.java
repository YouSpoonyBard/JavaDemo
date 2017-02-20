import java.util.Scanner;

/**
 * Created by mjl84 on 2/1/2017.
 */
public class Squares {
    public static void main(String[] args) {
        int number;
        int total = 0;
        System.out.println("Please enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        System.out.println("Number Squared Total");
        System.out.println("----------------------------");
        for (int index = 1; index <= number; index++){
            total= index + index*index;
            System.out.println(index + "\t\t" + index * index + "\t\t" + total);

        }
        System.exit(0);
    }
}
