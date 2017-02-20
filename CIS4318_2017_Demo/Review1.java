import java.util.ArrayList;

/**
 * Created by mjl84 on 2/20/2017.
 */
public class Review1 {
    public static void main(String[] args) {

        int [] numbers = new int[3];


        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("John");



        BankAccount myAccount = CreateAccount(55);
        System.out.println(myAccount.getBalance());

        BankAccount[] myAcc = CreateArrayAcc(33,44,55);
        for(int j=0; j < myAcc.length; j++){
            System.out.println(myAcc[j].getBalance());
        }


        ArrayList<BankAccount> myAccountList = new ArrayList<BankAccount>();

        myAccountList.add(new BankAccount(101));
        myAccountList.add(new BankAccount("50"));
        myAccountList.get(0).setBalance(77);
        System.out.println(myAccountList);


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

       // public static BankAccount[] CreateAccount(double startBal){
      //      return new BankAccount(startBal);
       // }

        public static BankAccount[] CreateArrayAcc(int a, int b, int c){
            BankAccount[] myBA = new BankAccount[3];
            myBA[0] = new BankAccount(a);
            myBA[1] = new BankAccount(b);
            myBA[2] = new BankAccount(c);
                return myBA;
        }

    }
}
