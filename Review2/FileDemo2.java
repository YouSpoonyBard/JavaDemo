import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by darknesstouch09 on 3/27/2017.
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        String fName, lName, fullName, answer, lineRead;
        int width, length;
        char ans;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Please enter your first name: ");
        fName = keyboard.nextLine();
        System.out.print("Please enter your last name: ");
        lName = keyboard.nextLine();


        fullName = fName + " " + lName;

        System.out.println("Entering Shape information");
        System.out.println("Please enter the width: ");
        width = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the length: ");
        length = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("");
        System.out.println("The area is: " + FindArea(fullName, width, length));
        System.out.printf("");
        do {
            System.out.printf("Do you want to see the file? (y/n) ");
            answer = keyboard.nextLine();
            answer.toLowerCase();
            ans = answer.charAt(0);

            if (ans == 'n') {
                System.out.println("Bye");
                System.exit(0);
            }//else{
            //    ans = "yes".charAt(0);
            //}

        } while (ans != 'y') ;
/**            File file = new File("./FileDemo2.txt");
            Scanner inputIntoFile = new Scanner(file);

            while (inputIntoFile.hasNext()) {
                lineRead = inputIntoFile.nextLine();
                System.out.println(lineRead);
                System.out.println("Done");
            }

            inputIntoFile.close();
            System.out.println("Closed");


        }
**/

    public static double FindArea (String nameFull, int wside, int  lside) throws IOException{
        double areaShape;

        File fileName = new File("./FileDemo2.txt");
        FileWriter writeToFile = new FileWriter(fileName, true);
        PrintWriter printedFile = new PrintWriter(writeToFile);

        areaShape = wside*lside;

        if(fileName.length() == 0){
            printedFile.println("Full Name\tWidth\tLength\tArea");
        }
        printedFile.println(nameFull + "\t" + wside + "\t" + lside + "\t" + areaShape);
        printedFile.close();
        return areaShape;
    }

}
