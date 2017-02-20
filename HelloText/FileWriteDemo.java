import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by mjl84 on 2/1/2017.
 */
public class FileWriteDemo {
    public static void main(String[] args) throws IOException{

        String fileName;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the name of the file?");
        fileName = keyboard.nextLine();


        //FileWriter fwriter = new FileWriter("MyFriends.txt", true);
        PrintWriter outFile = new PrintWriter(fileName);
        for (int i=0; i <= numFriends; i++){
            System.out.println("What is the name of friend #" + (i+1) + ":");
            friendName = keyboard.nextLine();
            outFile.println(friendName);

        }
    outFile.close();
        System.out.println("File created.");
    }
}
