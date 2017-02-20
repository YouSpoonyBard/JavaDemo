import java.util.ArrayList;

/**
 * Created by mjl84 on 2/20/2017.
 */
public class Review1 {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        ArrayList<String> nameList = new ArrayList<String>();

        BankAccount [] myAccounts = new BankAccount[2];

        for( int i=0; i<myAccounts.length; i++){
            myAccounts[i] = new BankAccount();
        }
        myAccounts[0].setBalance(100);
        myAccounts[1].setBalance("50");

        //myAccounts[0] = new BankAccount(100);
       // myAccounts[1] = new BankAccount("50");



        for(int i=0; i<myAccounts.length; i++){
            System.out.println(myAccounts[i].getBalance());
        }



    }
}
