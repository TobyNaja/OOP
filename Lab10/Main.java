public class Main {

    public static void main(String[] args) {
        Account acct1 = new Account(5000, "Bubu");
        Account acct2 = new Account(3000, "Jo");
        Account acct3 = new Account(9000, "Sully");
        
        Bank myBank = new Bank();
        myBank.addAccount(acct1);
        myBank.addAccount(acct2);
        myBank.addAccount(acct3);
        
        System.out.println("Num of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        myBank.getAccount(0).withdraw(200);
        myBank.getAccount(1).deposit(1000);
        
        for ( int i=0; i<myBank.getNumAccount(); i++) {
            myBank.getAccount(i).showAccount();
        }
    }
}