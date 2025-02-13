
public class Customer {
     private String firstName;
    private String lastName;
    private Account [] acct;
    private int numOfAccount;
    
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    
    public Customer() {
        this("", "");
        acct = new Account[5];
    }

    public void addAccount(Account ac) {
        acct[numOfAccount] = ac;
        numOfAccount++;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return acct[index];
    }
    
    public int getNumOfAccount() {
        return numOfAccount;
    }
    
    @Override
    public String toString() {
        if ( acct == null ) {
            return firstName + " " + lastName + " doesn’t have account.";
        }
        return firstName + " " + lastName + " has " + numOfAccount +" accounts.";
    }
    
    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}