import java.util.Scanner;

/**
 * Created by mjl84 on 1/25/2017.
 */
public class SwitchDemo {

    public static void main(String[] args) {



        Account myAccount = new Account(2,3);

        Student stud1 = new Student();
        stud1.setFirstName("John");
        stud1.setLastName("Johnson");
        stud1.setStudID(23);




//
//        int number;
//        int number1 = 10;
//        int number2 = 4;
//        double result;
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter 1, 2, or 3");
//        number = keyboard.nextInt();
//        double mySalary = 2300.75;
//        double myHours = 123.768;
//
//        switch(number) {
//            case 1:
//                System.out.println("You entered 1");
//                break;
//            case 2:
//                System.out.println("You entered 2");
//                break;
//            case 3:
//                System.out.println("You entered 3");
//                break;
//            default:
//                System.out.println("You entered something else than 1, 2, or 3");
//
//        }
//
//        System.out.printf("Your Salary is $%4.2f a month for %3.3f hours\n" , mySalary, myHours);
//        result = (double)number1/(double)number2;
//        System.out.println((int)myHours);
//        System.out.println(Math.round(myHours));
//        System.exit(0);
        System.out.println("Dear " + stud1.getFirstName() + " " + stud1.getLastName() + ", your student ID is " + stud1.getStudID());

    }
}
