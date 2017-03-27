import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by darknesstouch09 on 3/27/2017.
 */
public class HW1 {

    /**
     * Created by Cody Kern and Michelle Leipnik on 2/15/2017.
     */

        public static void main(String[] args) throws IOException {
            String firstName, lastName, fullName, answer, lineread;
            int monthlySalary, monthsOfPayment;
            char ans;
            Scanner keyboard = new Scanner(System.in);

            //Welcomes the user to the application
            System.out.println("Welcome to the Texas State Yearly Salary Calculator");

            //Asking for the users first and last name
            System.out.println("First, we'll need your name.");
            System.out.print("Please enter your first name: ");
            firstName = keyboard.nextLine();
            System.out.print("Please enter your last name: ");
            lastName = keyboard.nextLine();

            //Combines the first and last name to consolidate variables
            fullName = firstName + " " + lastName;

            //Asking for the users monthly information
            System.out.println("Now, we'll need your monthly information.");
            System.out.print("Please enter your monthly salary: ");
            monthlySalary = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Please enter the number of payment months: ");
            monthsOfPayment = keyboard.nextInt();
            keyboard.nextLine();

            //Displays the Yearly Salary
            System.out.println("");
            System.out.println("Your yearly salary is: " + YearlySalary(fullName, monthlySalary, monthsOfPayment));
            System.out.printf("");

            //Asks the user whether they would like to read from the file
            do{
                System.out.printf("Would you like to read from the file? (y/n) ");
                answer = keyboard.nextLine();
                answer = answer.toLowerCase();
                ans = answer.charAt(0);
                if(ans == 'n')
                    System.exit(0);
            }while(ans != 'y');

            //Section for reading the file. This area is only accessible if they replied with y or Y
            File file = new File("./yearlySalary.txt");
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()){
                lineread = inputFile.nextLine();
                System.out.println(lineread);
            }
            inputFile.close();
        }

        //Method to find the YearlySalary
        public static double YearlySalary(String fullName, int monthlySal, int monthsOfPay) throws IOException{
            double yearlySalary;
            File filename = new File("./yearlySalary.txt");
            FileWriter fwriter = new FileWriter(filename, true);
            PrintWriter outputFile = new PrintWriter(fwriter);

            yearlySalary = monthlySal * monthsOfPay;

            //Adding the header if the file doesn't exist
            if(filename.length() == 0){
                outputFile.println("Consumer Name\tMonthly Salary\tMonths of Pay\tYearly Salary");
            }

            outputFile.println(fullName + "\t" + monthlySal  + "\t" + monthsOfPay + "\t" + yearlySalary);
            outputFile.close();

            return yearlySalary;
        }
    }

