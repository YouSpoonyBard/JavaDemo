import javax.swing.*;
import java.util.Scanner;

/**
 * Created by mjl84 on 2/15/2017.
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount mAcct1= new BankAccount();
        System.out.println(mAcct1.getBalance());
        BankAccount mAcct2 = new BankAccount(10.0);
        System.out.println(mAcct2.getBalance());
        String amount = "20";
        BankAccount mAcct3 = new BankAccount(amount);
        System.out.println(mAcct3.getBalance());
        BankAccount mAcct4 = new BankAccount(4);
        System.out.println(mAcct4.getBalance());



        Scanner keyboard = new Scanner(System.in);
        String dep;
        dep = JOptionPane.showInputDialog("Please enter deposit amount for account 1");
        mAcct1.deposit(Double.parseDouble(dep));
        System.out.println("The new balance for account 1 is $" + mAcct1.getBalance());




    }


}
