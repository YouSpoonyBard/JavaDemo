import java.util.Scanner;

/**
 * Created by mjl84 on 2/15/2017.
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
       int[] hours = new int[3];
        Scanner keyboard = new Scanner(System.in);

        BankAccount[] mAcct = new BankAccount[3];
/*
        for (int index = 0; index < hours.length; index++) {
            System.out.println("Employee #" + index + 1 + " hours:");
            hours[index] = keyboard.nextInt();

        }
        int total = 0;
        System.out.println("You entered the following hours:");
        for (int index = 0; index < hours.length; index++) {
            System.out.println(hours[index]);
            total+=hours[index];

        }
        System.out.println("The index contains:");
        for (int value:hours) {
            System.out.println(value);
        }
        System.out.println("The total is:");
        System.out.println(total); */

        int[] array1 = {2,3,4,5};
        int[] array2 ;

        SumArray(array1);


    }





    private static void SumArray(int[] anyArray) {
        int total = 0;
        for (int i= 0; i < anyArray.length; i++){
            total+=anyArray[i];
        }
        System.out.println(total);


    }

    public static double[] getArray(){
        double[] mArray = {1,2,3,4,5,6,7};
        return mArray;
    }

}
