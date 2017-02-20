import javax.swing.*;

/**
 * Created by mjl84 on 1/23/2017.
 */
public class Division {

    public static void main(String[] args) {
        String number1, number2;
        double num1, num2, result;

        number1 = JOptionPane.showInputDialog("Enter number one ");
        num1 = Double.parseDouble(number1);
        number2 = JOptionPane.showInputDialog("Enter number two ");
        num2 = Double.parseDouble(number2);

        if(num2==0) {
            JOptionPane.showMessageDialog(null, "Division by 0 is impossible ");
            JOptionPane.showMessageDialog(null, "Please run the program again ");
        }else {
        result = num1/num2;
            JOptionPane.showMessageDialog(null, "The result is " + result);
        }


        System.exit(0);


    }
}
