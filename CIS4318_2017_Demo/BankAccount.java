import java.util.DoubleSummaryStatistics;

/**
 * Created by mjl84 on 2/15/2017.
 */
public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double startBalance) {
        balance = startBalance;
    }
    public BankAccount(String startBalance) {
        balance = Double.parseDouble(startBalance);
    }


    public void deposit(double amount){
        balance+=amount;
    }
    public void deposit(String str){
        balance+=Double.parseDouble(str);
    }



    public void withdraw(double amount){
        balance-=amount;
    }
    public void withdraw(String str){
        balance-=Double.parseDouble(str);
    }


    public void setBalance(double b) {
        balance = b;
    }
    public void setBalance(String b) {
        balance = Double.parseDouble(b);
    }


    public double getBalance() {
        return balance;
    }


}
