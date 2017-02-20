import java.util.Scanner;
/**
 * Created by mjl84 on 1/30/2017.
 */
public class testAverage1 {
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        System.out.println("This program calculates the average of three scores");

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter score 1");
            score1 = keyboard.nextInt();
            System.out.println("Enter score 2");
            score2 = keyboard.nextInt();
            System.out.println("Enter score 3");
            score3 = keyboard.nextInt();
            keyboard.nextLine();
            average = (score1 + score2 + score3)/3.0;
            System.out.println("The Average is " + average);
            System.out.println();

            System.out.println("Would you like to average another set of scores?");
            System.out.println("Enter Y for yes and N for n");
            input = keyboard.nextLine();
            repeat = input.charAt(0);

        }while (repeat == 'Y' || repeat == 'y');


        System.exit(0);

    }
}
