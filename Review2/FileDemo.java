import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

/**
 * Created by darknesstouch09 on 3/27/2017.
 */
public class FileDemo {
    public static void main(String[] args ) throws IOException{
        String fname, lname, fullname, answer, lineread;
        int  monthlySalary, monthsOfPay;
        char ans;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Testing");


        System.out.print("Enter first name: ");
        fname = keyboard.nextLine();
        System.out.print("Enter last name: ");
        lname = keyboard.nextLine();

        fullname = fname + " " + lname;

        System.out.println("Entering monthly information");
        System.out.println("Enter monthly salary: ");
        monthlySalary = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter months of pay: ");
        monthsOfPay = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("");
        System.out.println("Your info is:" + FileWrite(fullname, monthlySalary, monthsOfPay));
        System.out.printf("");


        do{
            System.out.println("Read from file? (y/n)");
            answer = keyboard.nextLine();
            answer = answer.toLowerCase();
            ans = answer.charAt(0);
            if (ans == 'n')
                System.exit(0);
        }while (ans != 'y');
            File file = new File("./FileDemo.txt");
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                lineread = inputFile.nextLine();
                System.out.println(lineread);
            }
            inputFile.close();

    }

    public static double FileWrite(String nameFull, int salMonth, int payMonth) throws IOException{
        double yearlySalary;
        File filename = new File("./FileDemo.txt");
        FileWriter fwriter = new FileWriter(filename, true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        yearlySalary = salMonth*payMonth;

        if(filename.length() == 0){
            outputFile.println("Full Name\tMonthly Salary\tMonths of Pay\t Total");
        }

        outputFile.println(nameFull + "\t" + salMonth + "\t" + payMonth + "\t" + yearlySalary);
        outputFile.close();

        return yearlySalary;
    }

}
