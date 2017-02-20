import javax.swing.*;
import java.util.Scanner;


/**
 * Created by mjl84 on 1/18/2017.
 */
public class HelloWorld {

    //type "psvm" + tab for shortcut (first letter of every word)
    public static void main(String[] args) {
        //"sout" + tab for shortcut ("S"ystem "OUT")
      System.out.println("Hello World");

        int value;
        value = 5;
        float number;
        number = 23.5F;
        double number2;
        number2 = 23.5;
        boolean bool;
        String name;

        //make sure scanner is imported (look above)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name ");
        name = keyboard.nextLine();
        System.out.println("Welcome to the Java Class, " + name);



    //new code below 2/6/2017

      //int res = passArg.showSum(3,5);
      System.out.println(passArg.showSum(3,5));

        System.exit(0);





    }


}
