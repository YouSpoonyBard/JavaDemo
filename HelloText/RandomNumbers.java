import java.util.Random;

/**
 * Created by mjl84 on 2/1/2017.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int number1;
        int number2;

        Random randNumbers = new Random();

        number1 = randNumbers.nextInt(10) ;
        number2 = randNumbers.nextInt(10) ;

        System.out.println(number1 + "\t\t" + number2);



    }
}
