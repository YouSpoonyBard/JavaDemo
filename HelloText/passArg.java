/**
 * Created by mjl84 on 2/6/2017.
 */
public class passArg {
    public static void main(String[] args) {
        int value = 20;
        int resultInt = showSum(1,2);
        double resultDouble = showSum(3.5, 9.4, 7.5);
        String resultString = showSum("Leipnik, ", "Michelle");
        int resultStringLength = showStringLength("Michelle");

        System.out.println(resultInt);
        System.out.println(resultDouble);
        System.out.println(resultString);
        System.out.println(resultStringLength);

        if( isValid(value)){
            System.out.println("within range");
        }else{
            System.out.println("out of range");
        }
    }

    public static boolean isValid(int number) {
        boolean status;
        if (number >=1 && number <= 100)
            status = true;
        else
            status = false;
        return status;
    }
    /**
     *
     * @param str
     * @return
     */
    public static int showStringLength(String str) {
        System.out.println("The string is " + str.length() + " characters long.");
        return str.length();
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int showSum(int a, int b) {
        int c;
        c = a+b;
        return c;

    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double showSum(double a, double b, double c) {
        double d;
        d = a+b+c;
        return d;

    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static String showSum(String a, String b) {
        String c;
        c = a+b;
        return c;

    }

}
